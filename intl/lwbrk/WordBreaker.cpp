/* -*- Mode: C++; tab-width: 2; indent-tabs-mode: nil; c-basic-offset: 2 -*- */
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include "mozilla/intl/WordBreaker.h"

#include "icu4x/WordSegmenter.hpp"
#include "mozilla/CheckedInt.h"
#include "mozilla/intl/UnicodeProperties.h"
#include "mozilla/StaticPrefs_intl.h"
#include "mozilla/StaticPrefs_layout.h"
#include "nsComplexBreaker.h"
#include "nsTArray.h"
#include "nsUnicharUtils.h"
#include "nsUnicodeProperties.h"

using mozilla::intl::Script;
using mozilla::intl::UnicodeProperties;
using mozilla::intl::WordBreaker;
using mozilla::intl::WordRange;
using mozilla::unicode::GetGenCategory;

#define ASCII_IS_ALPHA(c) \
  ((('a' <= (c)) && ((c) <= 'z')) || (('A' <= (c)) && ((c) <= 'Z')))
#define ASCII_IS_DIGIT(c) (('0' <= (c)) && ((c) <= '9'))
#define ASCII_IS_SPACE(c) \
  ((' ' == (c)) || ('\t' == (c)) || ('\r' == (c)) || ('\n' == (c)))
#define IS_ALPHABETICAL_SCRIPT(c) ((c) < 0x2E80)

// we change the beginning of IS_HAN from 0x4e00 to 0x3400 to relfect
// Unicode 3.0
#define IS_HAN(c) \
  ((0x3400 <= (c)) && ((c) <= 0x9fff)) || ((0xf900 <= (c)) && ((c) <= 0xfaff))
#define IS_KATAKANA(c) ((0x30A0 <= (c)) && ((c) <= 0x30FF))
#define IS_HIRAGANA(c) ((0x3040 <= (c)) && ((c) <= 0x309F))
#define IS_HALFWIDTHKATAKANA(c) ((0xFF60 <= (c)) && ((c) <= 0xFF9F))

/* static */
WordBreaker::WordBreakClass WordBreaker::GetClass(char16_t c) {
  // begin of the hack

  if (IS_ALPHABETICAL_SCRIPT(c)) {
    if (IS_ASCII(c)) {
      if (ASCII_IS_SPACE(c)) {
        return kWbClassSpace;
      }
      if (ASCII_IS_ALPHA(c) || ASCII_IS_DIGIT(c) ||
          (c == '_' && !StaticPrefs::layout_word_select_stop_at_underscore())) {
        return kWbClassAlphaLetter;
      }
      return kWbClassPunct;
    }
    if (c == 0x00A0 /*NBSP*/) {
      return kWbClassSpace;
    }
    if (GetGenCategory(c) == nsUGenCategory::kPunctuation) {
      return kWbClassPunct;
    }
    if (UnicodeProperties::IsScriptioContinua(c)) {
      return kWbClassScriptioContinua;
    }
    return kWbClassAlphaLetter;
  }
  if (IS_HAN(c)) {
    return kWbClassHanLetter;
  }
  if (IS_KATAKANA(c)) {
    return kWbClassKatakanaLetter;
  }
  if (IS_HIRAGANA(c)) {
    return kWbClassHiraganaLetter;
  }
  if (IS_HALFWIDTHKATAKANA(c)) {
    return kWbClassHWKatakanaLetter;
  }
  if (GetGenCategory(c) == nsUGenCategory::kPunctuation) {
    return kWbClassPunct;
  }
  if (UnicodeProperties::IsScriptioContinua(c)) {
    return kWbClassScriptioContinua;
  }
  return kWbClassAlphaLetter;
}

WordRange WordBreaker::FindWord(const nsAString& aText, uint32_t aPos,
                                const FindWordOptions aOptions) {
  const CheckedInt<uint32_t> len = aText.Length();
  MOZ_RELEASE_ASSERT(len.isValid());

  if (aPos >= len.value()) {
    return {len.value(), len.value()};
  }

  WordRange range{0, len.value()};

  if (StaticPrefs::intl_icu4x_segmenter_enabled()) {
    auto segmenter = icu4x::WordSegmenter::create_auto();
    auto iterator = segmenter->segment16(
        std::u16string_view(aText.BeginReading(), aText.Length()));

    uint32_t previousPos = 0;
    while (true) {
      const int32_t nextPos = iterator->next();
      if (nextPos < 0) {
        range.mBegin = previousPos;
        range.mEnd = len.value();
        break;
      }
      if ((uint32_t)nextPos > aPos) {
        range.mBegin = previousPos;
        range.mEnd = (uint32_t)nextPos;
        break;
      }

      previousPos = nextPos;
    }

    if (aOptions != FindWordOptions::StopAtPunctuation) {
      return range;
    }

    for (uint32_t i = range.mBegin; i < range.mEnd; i++) {
      if (mozilla::IsPunctuationForWordSelect(aText[i])) {
        if (i > aPos) {
          range.mEnd = i;
          break;
        }
        if (i == aPos) {
          range.mBegin = i;
          range.mEnd = i + 1;
          break;
        }
        if (i < aPos) {
          range.mBegin = i + 1;
        }
      }
    }

    return range;
  }

  WordBreakClass c = GetClass(aText[aPos]);

  // Scan forward
  for (uint32_t i = aPos + 1; i < len.value(); i++) {
    if (c != GetClass(aText[i])) {
      range.mEnd = i;
      break;
    }
  }

  // Scan backward
  for (uint32_t i = aPos; i > 0; i--) {
    if (c != GetClass(aText[i - 1])) {
      range.mBegin = i;
      break;
    }
  }

  if (kWbClassScriptioContinua == c) {
    // we pass the whole text segment to the complex word breaker to find a
    // shorter answer
    AutoTArray<uint8_t, 256> breakBefore;
    breakBefore.SetLength(range.mEnd - range.mBegin);
    ComplexBreaker::GetBreaks(aText.BeginReading() + range.mBegin,
                              range.mEnd - range.mBegin,
                              breakBefore.Elements());

    // Scan forward
    for (uint32_t i = aPos + 1; i < range.mEnd; i++) {
      if (breakBefore[i - range.mBegin]) {
        range.mEnd = i;
        break;
      }
    }

    // Scan backward
    for (uint32_t i = aPos; i > range.mBegin; i--) {
      if (breakBefore[i - range.mBegin]) {
        range.mBegin = i;
        break;
      }
    }
  }
  return range;
}

int32_t WordBreaker::Next(const char16_t* aText, uint32_t aLen, uint32_t aPos) {
  MOZ_ASSERT(aText);

  if (aPos >= aLen) {
    return NS_WORDBREAKER_NEED_MORE_TEXT;
  }

  const WordBreakClass posClass = GetClass(aText[aPos]);
  uint32_t nextBreakPos;
  for (nextBreakPos = aPos + 1; nextBreakPos < aLen; ++nextBreakPos) {
    if (posClass != GetClass(aText[nextBreakPos])) {
      break;
    }
  }

  if (kWbClassScriptioContinua == posClass) {
    // We pass the whole text segment to the complex word breaker to find a
    // shorter answer.
    const char16_t* segStart = aText + aPos;
    const uint32_t segLen = nextBreakPos - aPos + 1;
    AutoTArray<uint8_t, 256> breakBefore;
    breakBefore.SetLength(segLen);
    ComplexBreaker::GetBreaks(segStart, segLen, breakBefore.Elements());

    for (uint32_t i = aPos + 1; i < nextBreakPos; ++i) {
      if (breakBefore[i - aPos]) {
        nextBreakPos = i;
        break;
      }
    }
  }

  MOZ_ASSERT(nextBreakPos != aPos);
  return nextBreakPos;
}
