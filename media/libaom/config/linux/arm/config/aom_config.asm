;
; Copyright (c) 2025, Alliance for Open Media. All rights reserved.
;
; This source code is subject to the terms of the BSD 2 Clause License and
; the Alliance for Open Media Patent License 1.0. If the BSD 2 Clause License
; was not distributed with this source code in the LICENSE file, you can
; obtain it at www.aomedia.org/license/software. If the Alliance for Open
; Media Patent License 1.0 was not distributed with this source code in the
; PATENTS file, you can obtain it at www.aomedia.org/license/patent.
;

.equ AOM_ARCH_AARCH64, 0
.equ AOM_ARCH_ARM, 1
.equ AOM_ARCH_PPC, 0
.equ AOM_ARCH_RISCV, 0
.equ AOM_ARCH_X86, 0
.equ AOM_ARCH_X86_64, 0
.equ CONFIG_ACCOUNTING, 0
.equ CONFIG_ANALYZER, 0
.equ CONFIG_AV1_DECODER, 1
.equ CONFIG_AV1_ENCODER, 1
.equ CONFIG_AV1_HIGHBITDEPTH, 1
.equ CONFIG_AV1_TEMPORAL_DENOISING, 0
.equ CONFIG_BIG_ENDIAN, 0
.equ CONFIG_BITRATE_ACCURACY, 0
.equ CONFIG_BITRATE_ACCURACY_BL, 0
.equ CONFIG_BITSTREAM_DEBUG, 0
.equ CONFIG_COEFFICIENT_RANGE_CHECKING, 0
.equ CONFIG_COLLECT_COMPONENT_TIMING, 0
.equ CONFIG_COLLECT_PARTITION_STATS, 0
.equ CONFIG_COLLECT_RD_STATS, 0
.equ CONFIG_CWG_C013, 0
.equ CONFIG_CWG_E050, 0
.equ CONFIG_DEBUG, 0
.equ CONFIG_DENOISE, 1
.equ CONFIG_DISABLE_FULL_PIXEL_SPLIT_8X8, 1
.equ CONFIG_ENTROPY_STATS, 0
.equ CONFIG_EXCLUDE_SIMD_MISMATCH, 0
.equ CONFIG_FPMT_TEST, 0
.equ CONFIG_GCC, 1
.equ CONFIG_GCOV, 0
.equ CONFIG_GPROF, 0
.equ CONFIG_HIGHWAY, 0
.equ CONFIG_INSPECTION, 0
.equ CONFIG_INTERNAL_STATS, 0
.equ CONFIG_INTER_STATS_ONLY, 0
.equ CONFIG_LIBVMAF_PSNR_PEAK, 1
.equ CONFIG_LIBYUV, 0
.equ CONFIG_MAX_DECODE_PROFILE, 2
.equ CONFIG_MISMATCH_DEBUG, 0
.equ CONFIG_MULTITHREAD, 1
.equ CONFIG_NN_V2, 0
.equ CONFIG_NORMAL_TILE_MODE, 0
.equ CONFIG_OPTICAL_FLOW_API, 0
.equ CONFIG_OS_SUPPORT, 1
.equ CONFIG_OUTPUT_FRAME_SIZE, 0
.equ CONFIG_PARTITION_SEARCH_ORDER, 0
.equ CONFIG_PIC, 1
.equ CONFIG_QUANT_MATRIX, 1
.equ CONFIG_RATECTRL_LOG, 0
.equ CONFIG_RD_COMMAND, 0
.equ CONFIG_RD_DEBUG, 0
.equ CONFIG_REALTIME_ONLY, 0
.equ CONFIG_RT_ML_PARTITIONING, 0
.equ CONFIG_RUNTIME_CPU_DETECT, 1
.equ CONFIG_SALIENCY_MAP, 0
.equ CONFIG_SHARED, 0
.equ CONFIG_SIZE_LIMIT, 0
.equ CONFIG_SPEED_STATS, 0
.equ CONFIG_SVT_AV1, 1
.equ CONFIG_TFLITE, 0
.equ CONFIG_THREE_PASS, 0
.equ CONFIG_TUNE_BUTTERAUGLI, 0
.equ CONFIG_TUNE_VMAF, 0
.equ CONFIG_WEBM_IO, 0
.equ DECODE_HEIGHT_LIMIT, 0
.equ DECODE_WIDTH_LIMIT, 0
.equ FORCE_HIGHBITDEPTH_DECODING, 0
.equ HAVE_ARM_CRC32, 0
.equ HAVE_AVX, 0
.equ HAVE_AVX2, 0
.equ HAVE_AVX512, 0
.equ HAVE_FEXCEPT, 1
.equ HAVE_MMX, 0
.equ HAVE_NEON, 1
.equ HAVE_NEON_DOTPROD, 0
.equ HAVE_NEON_I8MM, 0
.equ HAVE_RVV, 0
.equ HAVE_SSE, 0
.equ HAVE_SSE2, 0
.equ HAVE_SSE3, 0
.equ HAVE_SSE4_1, 0
.equ HAVE_SSE4_2, 0
.equ HAVE_SSSE3, 0
.equ HAVE_SVE, 0
.equ HAVE_SVE2, 0
.equ HAVE_VSX, 0
.equ HAVE_WXWIDGETS, 0
.equ STATIC_LINK_JXL, 0
.section	.note.GNU-stack,"",%progbits