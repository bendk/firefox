/* -*- Mode: C++; tab-width: 20; indent-tabs-mode: nil; c-basic-offset: 2 -*-
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#ifndef MOZILLA_GFX_PRINTPROMISE_H
#define MOZILLA_GFX_PRINTPROMISE_H

#include "nscore.h"

namespace mozilla {

template <typename ResolveValueT, typename RejectValueT, bool IsExclusive>
class MozPromise;

namespace gfx {

using PrintEndDocumentPromise = MozPromise</* unused */ bool, nsresult, false>;

}  // namespace gfx
}  // namespace mozilla
#endif
