/* -*- Mode: C++; tab-width: 8; indent-tabs-mode: nil; c-basic-offset: 2 -*- */
/* vim: set ts=8 sts=2 et sw=2 tw=80: */
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include "Location.h"
#include "nsIScriptObjectPrincipal.h"
#include "nsIScriptContext.h"
#include "nsDocShellLoadState.h"
#include "nsIWebNavigation.h"
#include "nsIOService.h"
#include "nsIURL.h"
#include "nsIJARURI.h"
#include "nsIURIMutator.h"
#include "nsNetUtil.h"
#include "nsCOMPtr.h"
#include "nsEscape.h"
#include "nsPresContext.h"
#include "nsError.h"
#include "nsReadableUtils.h"
#include "nsJSUtils.h"
#include "nsContentUtils.h"
#include "nsDocShell.h"
#include "nsGlobalWindowOuter.h"
#include "nsPIDOMWindowInlines.h"
#include "mozilla/Likely.h"
#include "nsCycleCollectionParticipant.h"
#include "mozilla/BasePrincipal.h"
#include "mozilla/Components.h"
#include "mozilla/NullPrincipal.h"
#include "mozilla/ServoStyleConsts.h"
#include "mozilla/StaticPrefs_dom.h"
#include "mozilla/Unused.h"
#include "mozilla/dom/Document.h"
#include "mozilla/dom/DocumentInlines.h"
#include "mozilla/dom/FragmentDirective.h"
#include "mozilla/dom/LocationBinding.h"
#include "mozilla/dom/ScriptSettings.h"
#include "ReferrerInfo.h"

namespace mozilla::dom {

Location::Location(nsPIDOMWindowInner* aWindow)
    : mCachedHash(VoidCString()), mInnerWindow(aWindow) {
  BrowsingContext* bc = GetBrowsingContext();
  if (bc) {
    bc->LocationCreated(this);
  }
}

Location::~Location() {
  if (isInList()) {
    remove();
  }
}

// QueryInterface implementation for Location
NS_INTERFACE_MAP_BEGIN_CYCLE_COLLECTION(Location)
  NS_WRAPPERCACHE_INTERFACE_MAP_ENTRY
  NS_INTERFACE_MAP_ENTRY(nsISupports)
NS_INTERFACE_MAP_END

NS_IMPL_CYCLE_COLLECTION_WRAPPERCACHE(Location, mInnerWindow)

NS_IMPL_CYCLE_COLLECTING_ADDREF(Location)
NS_IMPL_CYCLE_COLLECTING_RELEASE(Location)

BrowsingContext* Location::GetBrowsingContext() {
  return mInnerWindow ? mInnerWindow->GetBrowsingContext() : nullptr;
}

nsIDocShell* Location::GetDocShell() {
  if (BrowsingContext* bc = GetBrowsingContext()) {
    return bc->GetDocShell();
  }
  return nullptr;
}

nsresult Location::GetURI(nsIURI** aURI, bool aGetInnermostURI) {
  *aURI = nullptr;

  nsIDocShell* docShell = GetDocShell();
  if (!docShell) {
    return NS_OK;
  }

  nsIWebNavigation* webNav = nsDocShell::Cast(docShell);

  nsCOMPtr<nsIURI> uri;
  nsresult rv = webNav->GetCurrentURI(getter_AddRefs(uri));
  NS_ENSURE_SUCCESS(rv, rv);

  // It is valid for docshell to return a null URI. Don't try to fixup
  // if this happens.
  if (!uri) {
    return NS_OK;
  }

  if (aGetInnermostURI) {
    nsCOMPtr<nsIJARURI> jarURI(do_QueryInterface(uri));
    while (jarURI) {
      jarURI->GetJARFile(getter_AddRefs(uri));
      jarURI = do_QueryInterface(uri);
    }
  }

  NS_ASSERTION(uri, "nsJARURI screwed up?");

  // Remove the fragment directive from the url hash.
  FragmentDirective::ParseAndRemoveFragmentDirectiveFromFragment(uri);
  nsCOMPtr<nsIURI> exposableURI = net::nsIOService::CreateExposableURI(uri);
  exposableURI.forget(aURI);
  return NS_OK;
}

void Location::GetHash(nsACString& aHash, nsIPrincipal& aSubjectPrincipal,
                       ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  if (!mCachedHash.IsVoid()) {
    aHash = mCachedHash;
    return;
  }

  aHash.SetLength(0);

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  nsAutoCString ref;

  aRv = uri->GetRef(ref);
  if (NS_WARN_IF(aRv.Failed())) {
    return;
  }

  if (!ref.IsEmpty()) {
    aHash.SetCapacity(ref.Length() + 1);
    aHash.Assign('#');
    aHash.Append(ref);
  }

  mCachedHash = aHash;
}

void Location::SetHash(const nsACString& aHash, nsIPrincipal& aSubjectPrincipal,
                       ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  if (aHash.IsEmpty() || aHash.First() != '#') {
    aRv = NS_MutateURI(uri).SetRef("#"_ns + aHash).Finalize(uri);
  } else {
    aRv = NS_MutateURI(uri).SetRef(aHash).Finalize(uri);
  }
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  SetURI(uri, aSubjectPrincipal, aRv);
}

void Location::GetHost(nsACString& aHost, nsIPrincipal& aSubjectPrincipal,
                       ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  aHost.Truncate();

  nsCOMPtr<nsIURI> uri;
  mozilla::Unused << GetURI(getter_AddRefs(uri), true);

  if (uri) {
    mozilla::Unused << uri->GetHostPort(aHost);
  }
}

void Location::SetHost(const nsACString& aHost, nsIPrincipal& aSubjectPrincipal,
                       ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  aRv = NS_MutateURI(uri).SetHostPort(aHost).Finalize(uri);
  if (NS_WARN_IF(aRv.Failed())) {
    return;
  }

  SetURI(uri, aSubjectPrincipal, aRv);
}

void Location::GetHostname(nsACString& aHostname,
                           nsIPrincipal& aSubjectPrincipal, ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  aHostname.Truncate();

  nsCOMPtr<nsIURI> uri;
  GetURI(getter_AddRefs(uri), true);
  if (uri) {
    nsContentUtils::GetHostOrIPv6WithBrackets(uri, aHostname);
  }
}

void Location::SetHostname(const nsACString& aHostname,
                           nsIPrincipal& aSubjectPrincipal, ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  aRv = NS_MutateURI(uri).SetHost(aHostname).Finalize(uri);
  if (NS_WARN_IF(aRv.Failed())) {
    return;
  }

  SetURI(uri, aSubjectPrincipal, aRv);
}

nsresult Location::GetHref(nsACString& aHref) {
  aHref.Truncate();

  nsCOMPtr<nsIURI> uri;
  nsresult rv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(NS_FAILED(rv)) || !uri) {
    return rv;
  }

  rv = uri->GetSpec(aHref);
  if (NS_WARN_IF(NS_FAILED(rv))) {
    return rv;
  }
  return NS_OK;
}

void Location::GetOrigin(nsACString& aOrigin, nsIPrincipal& aSubjectPrincipal,
                         ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  aOrigin.Truncate();

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri), true);
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  aRv = nsContentUtils::GetWebExposedOriginSerialization(uri, aOrigin);
  if (NS_WARN_IF(aRv.Failed())) {
    aOrigin.Truncate();
    return;
  }
}

void Location::GetPathname(nsACString& aPathname,
                           nsIPrincipal& aSubjectPrincipal, ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  aPathname.Truncate();

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  aRv = uri->GetFilePath(aPathname);
  if (NS_WARN_IF(aRv.Failed())) {
    return;
  }
}

void Location::SetPathname(const nsACString& aPathname,
                           nsIPrincipal& aSubjectPrincipal, ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  nsresult rv = NS_MutateURI(uri).SetFilePath(aPathname).Finalize(uri);
  if (NS_FAILED(rv)) {
    return;
  }

  SetURI(uri, aSubjectPrincipal, aRv);
}

void Location::GetPort(nsACString& aPort, nsIPrincipal& aSubjectPrincipal,
                       ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  aPort.SetLength(0);

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri), true);
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  int32_t port;
  nsresult result = uri->GetPort(&port);

  // Don't propagate this exception to caller
  if (NS_SUCCEEDED(result) && -1 != port) {
    aPort.AppendInt(port);
  }
}

void Location::SetPort(const nsACString& aPort, nsIPrincipal& aSubjectPrincipal,
                       ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(aRv.Failed() || !uri)) {
    return;
  }

  // perhaps use nsReadingIterators at some point?
  nsAutoCString portStr(aPort);
  const char* buf = portStr.get();
  int32_t port = -1;

  if (!portStr.IsEmpty() && buf) {
    // Sadly, ToInteger() on nsACString does not have the right semantics.
    if (*buf == ':') {
      port = atol(buf + 1);
    } else {
      port = atol(buf);
    }
  }

  aRv = NS_MutateURI(uri).SetPort(port).Finalize(uri);
  if (NS_WARN_IF(aRv.Failed())) {
    return;
  }

  SetURI(uri, aSubjectPrincipal, aRv);
}

void Location::GetProtocol(nsACString& aProtocol,
                           nsIPrincipal& aSubjectPrincipal, ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  aProtocol.SetLength(0);

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  aRv = uri->GetScheme(aProtocol);
  if (NS_WARN_IF(aRv.Failed())) {
    return;
  }

  aProtocol.Append(':');
}

void Location::SetProtocol(const nsACString& aProtocol,
                           nsIPrincipal& aSubjectPrincipal, ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  if (NS_WARN_IF(aRv.Failed()) || !uri) {
    return;
  }

  nsACString::const_iterator start, end;
  aProtocol.BeginReading(start);
  aProtocol.EndReading(end);
  nsACString::const_iterator iter(start);
  Unused << FindCharInReadable(':', iter, end);

  nsresult rv =
      NS_MutateURI(uri).SetScheme(Substring(start, iter)).Finalize(uri);
  if (NS_WARN_IF(NS_FAILED(rv))) {
    // Oh, I wish nsStandardURL returned NS_ERROR_MALFORMED_URI for _all_ the
    // malformed cases, not just some of them!
    aRv.Throw(NS_ERROR_DOM_SYNTAX_ERR);
    return;
  }

  nsAutoCString newSpec;
  aRv = uri->GetSpec(newSpec);
  if (NS_WARN_IF(aRv.Failed())) {
    return;
  }
  // We may want a new URI class for the new URI, so recreate it:
  rv = NS_NewURI(getter_AddRefs(uri), newSpec);
  if (NS_FAILED(rv)) {
    if (rv == NS_ERROR_MALFORMED_URI) {
      rv = NS_ERROR_DOM_SYNTAX_ERR;
    }

    aRv.Throw(rv);
    return;
  }

  if (!net::SchemeIsHttpOrHttps(uri)) {
    // No-op, per spec.
    return;
  }

  SetURI(uri, aSubjectPrincipal, aRv);
}

void Location::GetSearch(nsACString& aSearch, nsIPrincipal& aSubjectPrincipal,
                         ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  aSearch.SetLength(0);

  nsCOMPtr<nsIURI> uri;
  nsresult result = NS_OK;

  result = GetURI(getter_AddRefs(uri));

  nsCOMPtr<nsIURL> url(do_QueryInterface(uri));

  if (url) {
    nsAutoCString search;

    result = url->GetQuery(search);

    if (NS_SUCCEEDED(result) && !search.IsEmpty()) {
      aSearch.SetCapacity(search.Length() + 1);
      aSearch.Assign('?');
      aSearch.Append(search);
    }
  }
}

void Location::SetSearch(const nsACString& aSearch,
                         nsIPrincipal& aSubjectPrincipal, ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  nsCOMPtr<nsIURI> uri;
  aRv = GetURI(getter_AddRefs(uri));
  nsCOMPtr<nsIURL> url(do_QueryInterface(uri));
  if (NS_WARN_IF(aRv.Failed()) || !url) {
    return;
  }

  aRv = NS_MutateURI(uri).SetQuery(aSearch).Finalize(uri);
  if (NS_WARN_IF(aRv.Failed())) {
    return;
  }

  SetURI(uri, aSubjectPrincipal, aRv);
}

void Location::Reload(JSContext* aCx, bool aForceget,
                      nsIPrincipal& aSubjectPrincipal, ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  RefPtr<nsDocShell> docShell(nsDocShell::Cast(GetDocShell()));
  if (!docShell) {
    return aRv.Throw(NS_ERROR_FAILURE);
  }

  RefPtr<BrowsingContext> bc = GetBrowsingContext();
  if (!bc || bc->IsDiscarded()) {
    return;
  }

  CallerType callerType = aSubjectPrincipal.IsSystemPrincipal()
                              ? CallerType::System
                              : CallerType::NonSystem;

  nsresult rv = bc->CheckNavigationRateLimit(callerType);
  if (NS_FAILED(rv)) {
    aRv.Throw(rv);
    return;
  }

  uint32_t reloadFlags = nsIWebNavigation::LOAD_FLAGS_NONE;

  if (aForceget) {
    reloadFlags = nsIWebNavigation::LOAD_FLAGS_BYPASS_CACHE |
                  nsIWebNavigation::LOAD_FLAGS_BYPASS_PROXY;
  }

  UserNavigationInvolvement userInvolvement =
      callerType == CallerType::System ? UserNavigationInvolvement::BrowserUI
                                       : UserNavigationInvolvement::None;

  rv = docShell->ReloadNavigable(Some(WrapNotNull(aCx)), reloadFlags, nullptr,
                                 userInvolvement);
  if (NS_FAILED(rv) && rv != NS_BINDING_ABORTED) {
    // NS_BINDING_ABORTED is returned when we attempt to reload a POST result
    // and the user says no at the "do you want to reload?" prompt.  Don't
    // propagate this one back to callers.
    return aRv.Throw(rv);
  }
}

void Location::Assign(const nsACString& aUrl, nsIPrincipal& aSubjectPrincipal,
                      ErrorResult& aRv) {
  if (!CallerSubsumes(&aSubjectPrincipal)) {
    aRv.Throw(NS_ERROR_DOM_SECURITY_ERR);
    return;
  }

  DoSetHref(aUrl, aSubjectPrincipal, false, aRv);
}

bool Location::CallerSubsumes(nsIPrincipal* aSubjectPrincipal) {
  MOZ_ASSERT(aSubjectPrincipal);

  BrowsingContext* bc = GetBrowsingContext();
  if (MOZ_UNLIKELY(!bc) || MOZ_UNLIKELY(bc->IsDiscarded())) {
    // Per spec, operations on a Location object with a discarded BC are no-ops,
    // not security errors, so we need to return true from the access check and
    // let the caller do its own discarded docShell check.
    return true;
  }
  if (MOZ_UNLIKELY(!bc->IsInProcess())) {
    return false;
  }

  // Get the principal associated with the location object.  Note that this is
  // the principal of the page which will actually be navigated, not the
  // principal of the Location object itself.  This is why we need this check
  // even though we only allow limited cross-origin access to Location objects
  // in general.
  nsPIDOMWindowOuter* outer = bc->GetDOMWindow();
  MOZ_DIAGNOSTIC_ASSERT(outer);
  if (MOZ_UNLIKELY(!outer)) return false;

  nsIScriptObjectPrincipal* sop = nsGlobalWindowOuter::Cast(outer);
  bool subsumes = false;
  nsresult rv = aSubjectPrincipal->SubsumesConsideringDomain(
      sop->GetPrincipal(), &subsumes);
  NS_ENSURE_SUCCESS(rv, false);
  return subsumes;
}

JSObject* Location::WrapObject(JSContext* aCx,
                               JS::Handle<JSObject*> aGivenProto) {
  return Location_Binding::Wrap(aCx, this, aGivenProto);
}

void Location::ClearCachedValues() { mCachedHash = VoidCString(); }

}  // namespace mozilla::dom
