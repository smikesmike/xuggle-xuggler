/*******************************************************************************
 * Copyright (c) 2008, 2010 Xuggle Inc.  All rights reserved.
 *  
 * This file is part of Xuggle-Xuggler-Main.
 *
 * Xuggle-Xuggler-Main is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Xuggle-Xuggler-Main is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Xuggle-Xuggler-Main.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

#ifndef ICODEC_H_
#define ICODEC_H_

#include <com/xuggle/ferry/RefCounted.h>
#include <com/xuggle/xuggler/Xuggler.h>
#include <com/xuggle/xuggler/IRational.h>
#include <com/xuggle/xuggler/IPixelFormat.h>
#include <com/xuggle/xuggler/IAudioSamples.h>

#ifndef LIBAVCODEC_VERSION_MAJOR
#define LIBAVCODEC_VERSION_MAJOR 57
#endif // ! LIBAVCODEC_VERSION_MAJOR

#ifndef FF_API_VIMA_DECODER
#define FF_API_VIMA_DECODER     (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_AUDIO_CONVERT
#define FF_API_AUDIO_CONVERT     (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_AVCODEC_RESAMPLE
#define FF_API_AVCODEC_RESAMPLE  FF_API_AUDIO_CONVERT
#endif
#ifndef FF_API_GETCHROMA
#define FF_API_GETCHROMA         (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_MISSING_SAMPLE
#define FF_API_MISSING_SAMPLE    (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_LOWRES
#define FF_API_LOWRES            (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_CAP_VDPAU
#define FF_API_CAP_VDPAU         (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_BUFS_VDPAU
#define FF_API_BUFS_VDPAU        (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_VOXWARE
#define FF_API_VOXWARE           (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_SET_DIMENSIONS
#define FF_API_SET_DIMENSIONS    (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_DEBUG_MV
#define FF_API_DEBUG_MV          (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_AC_VLC
#define FF_API_AC_VLC            (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_OLD_MSMPEG4
#define FF_API_OLD_MSMPEG4       (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_ASPECT_EXTENDED
#define FF_API_ASPECT_EXTENDED   (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_ARCH_ALPHA
#define FF_API_ARCH_ALPHA        (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_XVMC
#define FF_API_XVMC              (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_ERROR_RATE
#define FF_API_ERROR_RATE        (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_QSCALE_TYPE
#define FF_API_QSCALE_TYPE       (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_MB_TYPE
#define FF_API_MB_TYPE           (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_MAX_BFRAMES
#define FF_API_MAX_BFRAMES       (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_NEG_LINESIZES
#define FF_API_NEG_LINESIZES     (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_EMU_EDGE
#define FF_API_EMU_EDGE          (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_ARCH_SH4
#define FF_API_ARCH_SH4          (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_ARCH_SPARC
#define FF_API_ARCH_SPARC        (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_UNUSED_MEMBERS
#define FF_API_UNUSED_MEMBERS    (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_IDCT_XVIDMMX
#define FF_API_IDCT_XVIDMMX      (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_INPUT_PRESERVED
#define FF_API_INPUT_PRESERVED   (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_NORMALIZE_AQP
#define FF_API_NORMALIZE_AQP     (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_GMC
#define FF_API_GMC               (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_MV0
#define FF_API_MV0               (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_CODEC_NAME
#define FF_API_CODEC_NAME        (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_AFD
#define FF_API_AFD               (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_VISMV
/* XXX: don't forget to drop the -vismv documentation */
#define FF_API_VISMV             (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_AUDIOENC_DELAY
#define FF_API_AUDIOENC_DELAY    (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_VAAPI_CONTEXT
#define FF_API_VAAPI_CONTEXT     (LIBAVCODEC_VERSION_MAJOR < 58)
#endif
#ifndef FF_API_AVCTX_TIMEBASE
#define FF_API_AVCTX_TIMEBASE    (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_MPV_OPT
#define FF_API_MPV_OPT           (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_STREAM_CODEC_TAG
#define FF_API_STREAM_CODEC_TAG  (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_QUANT_BIAS
#define FF_API_QUANT_BIAS        (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_RC_STRATEGY
#define FF_API_RC_STRATEGY       (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_CODED_FRAME
#define FF_API_CODED_FRAME       (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_MOTION_EST
#define FF_API_MOTION_EST        (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_WITHOUT_PREFIX
#define FF_API_WITHOUT_PREFIX    (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_SIDEDATA_ONLY_PKT
#define FF_API_SIDEDATA_ONLY_PKT (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_VDPAU_PROFILE
#define FF_API_VDPAU_PROFILE     (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_CONVERGENCE_DURATION
#define FF_API_CONVERGENCE_DURATION (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_AVPICTURE
#define FF_API_AVPICTURE         (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_AVPACKET_OLD_API
#define FF_API_AVPACKET_OLD_API (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_RTP_CALLBACK
#define FF_API_RTP_CALLBACK      (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_VBV_DELAY
#define FF_API_VBV_DELAY         (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_CODER_TYPE
#define FF_API_CODER_TYPE        (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_STAT_BITS
#define FF_API_STAT_BITS         (LIBAVCODEC_VERSION_MAJOR < 59)
#endif
#ifndef FF_API_PRIVATE_OPT
#define FF_API_PRIVATE_OPT      (LIBAVCODEC_VERSION_MAJOR < 59)
#endif

namespace com
{
namespace xuggle
{
namespace xuggler
{

class IContainerFormat;
/**
 * A "key" to an {@link IStreamCoder} that tells it how to encode or decode data.
 *
 * Use these objects to tell a IStreamCoder you want to use MP3 or NellyMoser
 * for example.
 */
class VS_API_XUGGLER ICodec : public com::xuggle::ferry::RefCounted
{
public:
  /**
   * These are the codecs this library currently supports.
   * These are based on FFMPEG Git versions with this HEAD:
   * ed3a49a79b4c7018121ed72a864be30ef1ed09ed
   */
  typedef enum ID
  {
    AV_CODEC_ID_NONE,

    /* video codecs */
    AV_CODEC_ID_MPEG1VIDEO,
    AV_CODEC_ID_MPEG2VIDEO, ///< preferred ID for MPEG-1/2 video decoding
#if FF_API_XVMC
    AV_CODEC_ID_MPEG2VIDEO_XVMC,
#endif /* FF_API_XVMC */
    AV_CODEC_ID_H261,
    AV_CODEC_ID_H263,
    AV_CODEC_ID_RV10,
    AV_CODEC_ID_RV20,
    AV_CODEC_ID_MJPEG,
    AV_CODEC_ID_MJPEGB,
    AV_CODEC_ID_LJPEG,
    AV_CODEC_ID_SP5X,
    AV_CODEC_ID_JPEGLS,
    AV_CODEC_ID_MPEG4,
    AV_CODEC_ID_RAWVIDEO,
    AV_CODEC_ID_MSMPEG4V1,
    AV_CODEC_ID_MSMPEG4V2,
    AV_CODEC_ID_MSMPEG4V3,
    AV_CODEC_ID_WMV1,
    AV_CODEC_ID_WMV2,
    AV_CODEC_ID_H263P,
    AV_CODEC_ID_H263I,
    AV_CODEC_ID_FLV1,
    AV_CODEC_ID_SVQ1,
    AV_CODEC_ID_SVQ3,
    AV_CODEC_ID_DVVIDEO,
    AV_CODEC_ID_HUFFYUV,
    AV_CODEC_ID_CYUV,
    AV_CODEC_ID_H264,
    AV_CODEC_ID_INDEO3,
    AV_CODEC_ID_VP3,
    AV_CODEC_ID_THEORA,
    AV_CODEC_ID_ASV1,
    AV_CODEC_ID_ASV2,
    AV_CODEC_ID_FFV1,
    AV_CODEC_ID_4XM,
    AV_CODEC_ID_VCR1,
    AV_CODEC_ID_CLJR,
    AV_CODEC_ID_MDEC,
    AV_CODEC_ID_ROQ,
    AV_CODEC_ID_INTERPLAY_VIDEO,
    AV_CODEC_ID_XAN_WC3,
    AV_CODEC_ID_XAN_WC4,
    AV_CODEC_ID_RPZA,
    AV_CODEC_ID_CINEPAK,
    AV_CODEC_ID_WS_VQA,
    AV_CODEC_ID_MSRLE,
    AV_CODEC_ID_MSVIDEO1,
    AV_CODEC_ID_IDCIN,
    AV_CODEC_ID_8BPS,
    AV_CODEC_ID_SMC,
    AV_CODEC_ID_FLIC,
    AV_CODEC_ID_TRUEMOTION1,
    AV_CODEC_ID_VMDVIDEO,
    AV_CODEC_ID_MSZH,
    AV_CODEC_ID_ZLIB,
    AV_CODEC_ID_QTRLE,
    AV_CODEC_ID_TSCC,
    AV_CODEC_ID_ULTI,
    AV_CODEC_ID_QDRAW,
    AV_CODEC_ID_VIXL,
    AV_CODEC_ID_QPEG,
    AV_CODEC_ID_PNG,
    AV_CODEC_ID_PPM,
    AV_CODEC_ID_PBM,
    AV_CODEC_ID_PGM,
    AV_CODEC_ID_PGMYUV,
    AV_CODEC_ID_PAM,
    AV_CODEC_ID_FFVHUFF,
    AV_CODEC_ID_RV30,
    AV_CODEC_ID_RV40,
    AV_CODEC_ID_VC1,
    AV_CODEC_ID_WMV3,
    AV_CODEC_ID_LOCO,
    AV_CODEC_ID_WNV1,
    AV_CODEC_ID_AASC,
    AV_CODEC_ID_INDEO2,
    AV_CODEC_ID_FRAPS,
    AV_CODEC_ID_TRUEMOTION2,
    AV_CODEC_ID_BMP,
    AV_CODEC_ID_CSCD,
    AV_CODEC_ID_MMVIDEO,
    AV_CODEC_ID_ZMBV,
    AV_CODEC_ID_AVS,
    AV_CODEC_ID_SMACKVIDEO,
    AV_CODEC_ID_NUV,
    AV_CODEC_ID_KMVC,
    AV_CODEC_ID_FLASHSV,
    AV_CODEC_ID_CAVS,
    AV_CODEC_ID_JPEG2000,
    AV_CODEC_ID_VMNC,
    AV_CODEC_ID_VP5,
    AV_CODEC_ID_VP6,
    AV_CODEC_ID_VP6F,
    AV_CODEC_ID_TARGA,
    AV_CODEC_ID_DSICINVIDEO,
    AV_CODEC_ID_TIERTEXSEQVIDEO,
    AV_CODEC_ID_TIFF,
    AV_CODEC_ID_GIF,
    AV_CODEC_ID_DXA,
    AV_CODEC_ID_DNXHD,
    AV_CODEC_ID_THP,
    AV_CODEC_ID_SGI,
    AV_CODEC_ID_C93,
    AV_CODEC_ID_BETHSOFTVID,
    AV_CODEC_ID_PTX,
    AV_CODEC_ID_TXD,
    AV_CODEC_ID_VP6A,
    AV_CODEC_ID_AMV,
    AV_CODEC_ID_VB,
    AV_CODEC_ID_PCX,
    AV_CODEC_ID_SUNRAST,
    AV_CODEC_ID_INDEO4,
    AV_CODEC_ID_INDEO5,
    AV_CODEC_ID_MIMIC,
    AV_CODEC_ID_RL2,
    AV_CODEC_ID_ESCAPE124,
    AV_CODEC_ID_DIRAC,
    AV_CODEC_ID_BFI,
    AV_CODEC_ID_CMV,
    AV_CODEC_ID_MOTIONPIXELS,
    AV_CODEC_ID_TGV,
    AV_CODEC_ID_TGQ,
    AV_CODEC_ID_TQI,
    AV_CODEC_ID_AURA,
    AV_CODEC_ID_AURA2,
    AV_CODEC_ID_V210X,
    AV_CODEC_ID_TMV,
    AV_CODEC_ID_V210,
    AV_CODEC_ID_DPX,
    AV_CODEC_ID_MAD,
    AV_CODEC_ID_FRWU,
    AV_CODEC_ID_FLASHSV2,
    AV_CODEC_ID_CDGRAPHICS,
    AV_CODEC_ID_R210,
    AV_CODEC_ID_ANM,
    AV_CODEC_ID_BINKVIDEO,
    AV_CODEC_ID_IFF_ILBM,
#define AV_CODEC_ID_IFF_BYTERUN1 AV_CODEC_ID_IFF_ILBM
    AV_CODEC_ID_KGV1,
    AV_CODEC_ID_YOP,
    AV_CODEC_ID_VP8,
    AV_CODEC_ID_PICTOR,
    AV_CODEC_ID_ANSI,
    AV_CODEC_ID_A64_MULTI,
    AV_CODEC_ID_A64_MULTI5,
    AV_CODEC_ID_R10K,
    AV_CODEC_ID_MXPEG,
    AV_CODEC_ID_LAGARITH,
    AV_CODEC_ID_PRORES,
    AV_CODEC_ID_JV,
    AV_CODEC_ID_DFA,
    AV_CODEC_ID_WMV3IMAGE,
    AV_CODEC_ID_VC1IMAGE,
    AV_CODEC_ID_UTVIDEO,
    AV_CODEC_ID_BMV_VIDEO,
    AV_CODEC_ID_VBLE,
    AV_CODEC_ID_DXTORY,
    AV_CODEC_ID_V410,
    AV_CODEC_ID_XWD,
    AV_CODEC_ID_CDXL,
    AV_CODEC_ID_XBM,
    AV_CODEC_ID_ZEROCODEC,
    AV_CODEC_ID_MSS1,
    AV_CODEC_ID_MSA1,
    AV_CODEC_ID_TSCC2,
    AV_CODEC_ID_MTS2,
    AV_CODEC_ID_CLLC,
    AV_CODEC_ID_MSS2,
    AV_CODEC_ID_VP9,
    AV_CODEC_ID_AIC,
    AV_CODEC_ID_ESCAPE130,
    AV_CODEC_ID_G2M,
    AV_CODEC_ID_WEBP,
    AV_CODEC_ID_HNM4_VIDEO,
    AV_CODEC_ID_HEVC,
#define AV_CODEC_ID_H265 AV_CODEC_ID_HEVC
    AV_CODEC_ID_FIC,
    AV_CODEC_ID_ALIAS_PIX,
    AV_CODEC_ID_BRENDER_PIX,
    AV_CODEC_ID_PAF_VIDEO,
    AV_CODEC_ID_EXR,
    AV_CODEC_ID_VP7,
    AV_CODEC_ID_SANM,
    AV_CODEC_ID_SGIRLE,
    AV_CODEC_ID_MVC1,
    AV_CODEC_ID_MVC2,
    AV_CODEC_ID_HQX,
    AV_CODEC_ID_TDSC,
    AV_CODEC_ID_HQ_HQA,
    AV_CODEC_ID_HAP,
    AV_CODEC_ID_DDS,
    AV_CODEC_ID_DXV,
    AV_CODEC_ID_SCREENPRESSO,
    AV_CODEC_ID_RSCC,

    AV_CODEC_ID_Y41P = 0x8000,
    AV_CODEC_ID_AVRP,
    AV_CODEC_ID_012V,
    AV_CODEC_ID_AVUI,
    AV_CODEC_ID_AYUV,
    AV_CODEC_ID_TARGA_Y216,
    AV_CODEC_ID_V308,
    AV_CODEC_ID_V408,
    AV_CODEC_ID_YUV4,
    AV_CODEC_ID_AVRN,
    AV_CODEC_ID_CPIA,
    AV_CODEC_ID_XFACE,
    AV_CODEC_ID_SNOW,
    AV_CODEC_ID_SMVJPEG,
    AV_CODEC_ID_APNG,
    AV_CODEC_ID_DAALA,
    AV_CODEC_ID_CFHD,

    /* various PCM "codecs" */
    AV_CODEC_ID_FIRST_AUDIO = 0x10000,     ///< A dummy id pointing at the start of audio codecs
    AV_CODEC_ID_PCM_S16LE = 0x10000,
    AV_CODEC_ID_PCM_S16BE,
    AV_CODEC_ID_PCM_U16LE,
    AV_CODEC_ID_PCM_U16BE,
    AV_CODEC_ID_PCM_S8,
    AV_CODEC_ID_PCM_U8,
    AV_CODEC_ID_PCM_MULAW,
    AV_CODEC_ID_PCM_ALAW,
    AV_CODEC_ID_PCM_S32LE,
    AV_CODEC_ID_PCM_S32BE,
    AV_CODEC_ID_PCM_U32LE,
    AV_CODEC_ID_PCM_U32BE,
    AV_CODEC_ID_PCM_S24LE,
    AV_CODEC_ID_PCM_S24BE,
    AV_CODEC_ID_PCM_U24LE,
    AV_CODEC_ID_PCM_U24BE,
    AV_CODEC_ID_PCM_S24DAUD,
    AV_CODEC_ID_PCM_ZORK,
    AV_CODEC_ID_PCM_S16LE_PLANAR,
    AV_CODEC_ID_PCM_DVD,
    AV_CODEC_ID_PCM_F32BE,
    AV_CODEC_ID_PCM_F32LE,
    AV_CODEC_ID_PCM_F64BE,
    AV_CODEC_ID_PCM_F64LE,
    AV_CODEC_ID_PCM_BLURAY,
    AV_CODEC_ID_PCM_LXF,
    AV_CODEC_ID_S302M,
    AV_CODEC_ID_PCM_S8_PLANAR,
    AV_CODEC_ID_PCM_S24LE_PLANAR,
    AV_CODEC_ID_PCM_S32LE_PLANAR,
    AV_CODEC_ID_PCM_S16BE_PLANAR,
    /* new PCM "codecs" should be added right below this line starting with
     * an explicit value of for example 0x10800
     */

    /* various ADPCM codecs */
    AV_CODEC_ID_ADPCM_IMA_QT = 0x11000,
    AV_CODEC_ID_ADPCM_IMA_WAV,
    AV_CODEC_ID_ADPCM_IMA_DK3,
    AV_CODEC_ID_ADPCM_IMA_DK4,
    AV_CODEC_ID_ADPCM_IMA_WS,
    AV_CODEC_ID_ADPCM_IMA_SMJPEG,
    AV_CODEC_ID_ADPCM_MS,
    AV_CODEC_ID_ADPCM_4XM,
    AV_CODEC_ID_ADPCM_XA,
    AV_CODEC_ID_ADPCM_ADX,
    AV_CODEC_ID_ADPCM_EA,
    AV_CODEC_ID_ADPCM_G726,
    AV_CODEC_ID_ADPCM_CT,
    AV_CODEC_ID_ADPCM_SWF,
    AV_CODEC_ID_ADPCM_YAMAHA,
    AV_CODEC_ID_ADPCM_SBPRO_4,
    AV_CODEC_ID_ADPCM_SBPRO_3,
    AV_CODEC_ID_ADPCM_SBPRO_2,
    AV_CODEC_ID_ADPCM_THP,
    AV_CODEC_ID_ADPCM_IMA_AMV,
    AV_CODEC_ID_ADPCM_EA_R1,
    AV_CODEC_ID_ADPCM_EA_R3,
    AV_CODEC_ID_ADPCM_EA_R2,
    AV_CODEC_ID_ADPCM_IMA_EA_SEAD,
    AV_CODEC_ID_ADPCM_IMA_EA_EACS,
    AV_CODEC_ID_ADPCM_EA_XAS,
    AV_CODEC_ID_ADPCM_EA_MAXIS_XA,
    AV_CODEC_ID_ADPCM_IMA_ISS,
    AV_CODEC_ID_ADPCM_G722,
    AV_CODEC_ID_ADPCM_IMA_APC,
    AV_CODEC_ID_ADPCM_VIMA,
#if FF_API_VIMA_DECODER
    AV_CODEC_ID_VIMA = AV_CODEC_ID_ADPCM_VIMA,
#endif

    AV_CODEC_ID_ADPCM_AFC = 0x11800,
    AV_CODEC_ID_ADPCM_IMA_OKI,
    AV_CODEC_ID_ADPCM_DTK,
    AV_CODEC_ID_ADPCM_IMA_RAD,
    AV_CODEC_ID_ADPCM_G726LE,
    AV_CODEC_ID_ADPCM_THP_LE,
    AV_CODEC_ID_ADPCM_PSX,
    AV_CODEC_ID_ADPCM_AICA,

    /* AMR */
    AV_CODEC_ID_AMR_NB = 0x12000,
    AV_CODEC_ID_AMR_WB,

    /* RealAudio codecs*/
    AV_CODEC_ID_RA_144 = 0x13000,
    AV_CODEC_ID_RA_288,

    /* various DPCM codecs */
    AV_CODEC_ID_ROQ_DPCM = 0x14000,
    AV_CODEC_ID_INTERPLAY_DPCM,
    AV_CODEC_ID_XAN_DPCM,
    AV_CODEC_ID_SOL_DPCM,

    AV_CODEC_ID_SDX2_DPCM = 0x14800,

    /* audio codecs */
    AV_CODEC_ID_MP2 = 0x15000,
    AV_CODEC_ID_MP3, ///< preferred ID for decoding MPEG audio layer 1, 2 or 3
    AV_CODEC_ID_AAC,
    AV_CODEC_ID_AC3,
    AV_CODEC_ID_DTS,
    AV_CODEC_ID_VORBIS,
    AV_CODEC_ID_DVAUDIO,
    AV_CODEC_ID_WMAV1,
    AV_CODEC_ID_WMAV2,
    AV_CODEC_ID_MACE3,
    AV_CODEC_ID_MACE6,
    AV_CODEC_ID_VMDAUDIO,
    AV_CODEC_ID_FLAC,
    AV_CODEC_ID_MP3ADU,
    AV_CODEC_ID_MP3ON4,
    AV_CODEC_ID_SHORTEN,
    AV_CODEC_ID_ALAC,
    AV_CODEC_ID_WESTWOOD_SND1,
    AV_CODEC_ID_GSM, ///< as in Berlin toast format
    AV_CODEC_ID_QDM2,
    AV_CODEC_ID_COOK,
    AV_CODEC_ID_TRUESPEECH,
    AV_CODEC_ID_TTA,
    AV_CODEC_ID_SMACKAUDIO,
    AV_CODEC_ID_QCELP,
    AV_CODEC_ID_WAVPACK,
    AV_CODEC_ID_DSICINAUDIO,
    AV_CODEC_ID_IMC,
    AV_CODEC_ID_MUSEPACK7,
    AV_CODEC_ID_MLP,
    AV_CODEC_ID_GSM_MS, /* as found in WAV */
    AV_CODEC_ID_ATRAC3,
#if FF_API_VOXWARE
    AV_CODEC_ID_VOXWARE,
#endif
    AV_CODEC_ID_APE,
    AV_CODEC_ID_NELLYMOSER,
    AV_CODEC_ID_MUSEPACK8,
    AV_CODEC_ID_SPEEX,
    AV_CODEC_ID_WMAVOICE,
    AV_CODEC_ID_WMAPRO,
    AV_CODEC_ID_WMALOSSLESS,
    AV_CODEC_ID_ATRAC3P,
    AV_CODEC_ID_EAC3,
    AV_CODEC_ID_SIPR,
    AV_CODEC_ID_MP1,
    AV_CODEC_ID_TWINVQ,
    AV_CODEC_ID_TRUEHD,
    AV_CODEC_ID_MP4ALS,
    AV_CODEC_ID_ATRAC1,
    AV_CODEC_ID_BINKAUDIO_RDFT,
    AV_CODEC_ID_BINKAUDIO_DCT,
    AV_CODEC_ID_AAC_LATM,
    AV_CODEC_ID_QDMC,
    AV_CODEC_ID_CELT,
    AV_CODEC_ID_G723_1,
    AV_CODEC_ID_G729,
    AV_CODEC_ID_8SVX_EXP,
    AV_CODEC_ID_8SVX_FIB,
    AV_CODEC_ID_BMV_AUDIO,
    AV_CODEC_ID_RALF,
    AV_CODEC_ID_IAC,
    AV_CODEC_ID_ILBC,
    AV_CODEC_ID_OPUS,
    AV_CODEC_ID_COMFORT_NOISE,
    AV_CODEC_ID_TAK,
    AV_CODEC_ID_METASOUND,
    AV_CODEC_ID_PAF_AUDIO,
    AV_CODEC_ID_ON2AVC,
    AV_CODEC_ID_DSS_SP,

    AV_CODEC_ID_FFWAVESYNTH = 0x15800,
    AV_CODEC_ID_SONIC,
    AV_CODEC_ID_SONIC_LS,
    AV_CODEC_ID_EVRC,
    AV_CODEC_ID_SMV,
    AV_CODEC_ID_DSD_LSBF,
    AV_CODEC_ID_DSD_MSBF,
    AV_CODEC_ID_DSD_LSBF_PLANAR,
    AV_CODEC_ID_DSD_MSBF_PLANAR,
    AV_CODEC_ID_4GV,
    AV_CODEC_ID_INTERPLAY_ACM,
    AV_CODEC_ID_XMA1,
    AV_CODEC_ID_XMA2,

    /* subtitle codecs */
    AV_CODEC_ID_FIRST_SUBTITLE = 0x17000,          ///< A dummy ID pointing at the start of subtitle codecs.
    AV_CODEC_ID_DVD_SUBTITLE = 0x17000,
    AV_CODEC_ID_DVB_SUBTITLE,
    AV_CODEC_ID_TEXT,  ///< raw UTF-8 text
    AV_CODEC_ID_XSUB,
    AV_CODEC_ID_SSA,
    AV_CODEC_ID_MOV_TEXT,
    AV_CODEC_ID_HDMV_PGS_SUBTITLE,
    AV_CODEC_ID_DVB_TELETEXT,
    AV_CODEC_ID_SRT,

    AV_CODEC_ID_MICRODVD   = 0x17800,
    AV_CODEC_ID_EIA_608,
    AV_CODEC_ID_JACOSUB,
    AV_CODEC_ID_SAMI,
    AV_CODEC_ID_REALTEXT,
    AV_CODEC_ID_STL,
    AV_CODEC_ID_SUBVIEWER1,
    AV_CODEC_ID_SUBVIEWER,
    AV_CODEC_ID_SUBRIP,
    AV_CODEC_ID_WEBVTT,
    AV_CODEC_ID_MPL2,
    AV_CODEC_ID_VPLAYER,
    AV_CODEC_ID_PJS,
    AV_CODEC_ID_ASS,
    AV_CODEC_ID_HDMV_TEXT_SUBTITLE,

    /* other specific kind of codecs (generally used for attachments) */
    AV_CODEC_ID_FIRST_UNKNOWN = 0x18000,           ///< A dummy ID pointing at the start of various fake codecs.
    AV_CODEC_ID_TTF = 0x18000,

    AV_CODEC_ID_BINTEXT    = 0x18800,
    AV_CODEC_ID_XBIN,
    AV_CODEC_ID_IDF,
    AV_CODEC_ID_OTF,
    AV_CODEC_ID_SMPTE_KLV,
    AV_CODEC_ID_DVD_NAV,
    AV_CODEC_ID_TIMED_ID3,
    AV_CODEC_ID_BIN_DATA,

    AV_CODEC_ID_PROBE = 0x19000, ///< codec_id is not known (like AV_CODEC_ID_NONE) but lavf should attempt to identify it

    AV_CODEC_ID_MPEG2TS = 0x20000, /**< _FAKE_ codec to indicate a raw MPEG-2 TS
                                * stream (only used by libavformat) */
    AV_CODEC_ID_MPEG4SYSTEMS = 0x20001, /**< _FAKE_ codec to indicate a MPEG-4 Systems
                                * stream (only used by libavformat) */
    AV_CODEC_ID_FFMETADATA = 0x21000,   ///< Dummy codec for streams containing only metadata information.
    AV_CODEC_ID_WRAPPED_AVFRAME = 0x21001, ///< Passthrough codec, AVFrames wrapped in AVPacket
               
  } ID;

  /**
   * The different types of Codecs that can exist in the system.
   */
  typedef enum Type
  {
    CODEC_TYPE_UNKNOWN = -1,
    CODEC_TYPE_VIDEO,
    CODEC_TYPE_AUDIO,
    CODEC_TYPE_DATA,
    CODEC_TYPE_SUBTITLE,
    CODEC_TYPE_ATTACHMENT
  } Type;

  /**
   * Get the name of the codec.
   * @return The name of this Codec.
   */
  virtual const char *
  getName()=0;

  /**
   * Get the ID of this codec, as an integer.
   * @return the ID of this codec, as an integer.
   */
  virtual int
  getIDAsInt()=0;

  /**
   * Get the ID of this codec as an enumeration.
   * @return the ID of this codec, an enum ID
   */
  virtual ID
  getID()=0;

  /**
   * Get the type of this codec.
   * @return The type of this Codec, as a enum Type
   */
  virtual Type
  getType()=0;

  /**
   * Can this codec be used for decoding?
   * @return Can this Codec decode?
   */
  virtual bool
  canDecode()=0;

  /**
   * Can this codec be used for encoding?
   * @return Can this Codec encode?
   */
  virtual bool
  canEncode()=0;

  /**
   * Find a codec that can be used for encoding.
   * @param id The id of the codec
   * @return the codec, or null if we can't find it.
   *
   */
  static ICodec *
  findEncodingCodec(ICodec::ID id);
  /**
   * Find a codec that can be used for encoding.
   * @param id The id of the codec, as an integer.
   * @return the codec, or null if we can't find it.
   */
  static ICodec *
  findEncodingCodecByIntID(int id);
  /**
   * Find a codec that can be used for encoding.
   * @param id The id of the codec, as a FFMPEG short-name string
   *   (for example, "mpeg4").
   * @return the codec, or null if we can't find it.
   */
  static ICodec *
  findEncodingCodecByName(const char*id);
  /**
   * Find a codec that can be used for decoding.
   * @param id The id of the codec
   * @return the codec, or null if we can't find it.
   */
  static ICodec *
  findDecodingCodec(ICodec::ID id);
  /**
   * Find a codec that can be used for decoding.
   * @param id The id of the codec, as an integer
   * @return the codec, or null if we can't find it.
   */
  static ICodec *
  findDecodingCodecByIntID(int id);
  /**
   * Find a codec that can be used for decoding.
   * @param id The id of the codec, as a FFMPEG short-name string
   *   (for example, "mpeg4")
   * @return the codec, or null if we can't find it.
   */
  static ICodec *
  findDecodingCodecByName(const char*id);

  /**
   * Ask us to guess an encoding codec based on the inputs
   * passed in.
   * <p>
   * You must pass in at least one non null fmt, shortName,
   * url or mime_type.
   * </p>
   * @param fmt An IContainerFormat for the container you'll want to encode into.
   * @param shortName The FFMPEG short name of the codec (e.g. "mpeg4").
   * @param url The URL you'll be writing packets to.
   * @param mimeType The mime type of the container.
   * @param type The codec type.
   * @return the codec, or null if we can't find it.
   */
  static ICodec *
  guessEncodingCodec(IContainerFormat* fmt, const char *shortName,
      const char*url, const char*mimeType, ICodec::Type type);

protected:
  ICodec();
  virtual
  ~ICodec();

  /**
   * Added for 1.17
   */
public:
  /**
   * Get the long name for this codec.
   *
   * @return the long name.
   */
  virtual const char *
  getLongName()=0;

  /*
   * Added for 2.1
   */

  /**
   * Capability flags
   */
  typedef enum Capabilities
  {
    CAP_DRAW_HORIZ_BAND = 0x0001,
    CAP_DR1 = 0x0002,
    CAP_PARSE_ONLY = 0x0004,
    CAP_TRUNCATED = 0x0008,
    CAP_HWACCEL = 0x0010,
    CAP_DELAY = 0x0020,
    CAP_SMALL_LAST_FRAME = 0x0040,
    CAP_HWACCEL_VDPAU = 0x0080,
    CAP_SUBFRAMES =0x0100,

  } Capabilities;

  /**
   * Get the capabilites flag from the codec
   * 
   * @return the capabilities flag
   */
  virtual int32_t getCapabilities()=0;
  
  /**
   * Convenience method to check individual capability flags.
   * 
   * @param capability the capability
   * 
   * @return true if flag is set; false otherwise.
   */
  virtual bool hasCapability(Capabilities capability)=0;
  
  /**
   * Get the number of installed codecs on this system.
   * @return the number of installed codecs.
   */
  static int32_t getNumInstalledCodecs();
  
  /**
   * Get the {@link ICodec} at the given index.
   * 
   * @param index the index in our list
   * 
   * @return the codec, or null if index < 0 or index >= 
   *   {@link #getNumInstalledCodecs()}
   */
  static ICodec* getInstalledCodec(int32_t index);

  /**
   * Get the number of frame rates this codec supports for encoding.
   * Not all codecs will report this number.
   * @return the number or 0 if we don't know.
   */
  virtual int32_t getNumSupportedVideoFrameRates()=0;
  
  /**
   * Return the supported frame rate at the given index.
   * 
   * @param index the index in our list.
   * 
   * @return the frame rate, or null if unknown, if index <0 or
   *   if index >= {@link #getNumSupportedVideoFrameRates()}
   */
  virtual IRational* getSupportedVideoFrameRate(int32_t index)=0;
  
  /**
   * Get the number of supported video pixel formats this codec supports
   * for encoding.  Not all codecs will report this.
   * 
   * @return the number or 0 if we don't know.
   */
  virtual int32_t getNumSupportedVideoPixelFormats()=0;

  /**
   * Return the supported video pixel format at the given index.
   * 
   * @param index the index in our list.
   * 
   * @return the pixel format, or {@link IPixelFormat.Type#NONE} if unknown,
   *   if index <0 or
   *   if index >= {@link #getNumSupportedVideoPixelFormats()}
   */
  virtual IPixelFormat::Type getSupportedVideoPixelFormat(int32_t index)=0;
  
  /**
   * Get the number of different audio sample rates this codec supports
   * for encoding.  Not all codecs will report this.
   * 
   * @return the number or 0 if we don't know.
   */
  virtual int32_t getNumSupportedAudioSampleRates()=0;
  
  /**
   * Return the support audio sample rate at the given index.
   * 
   * @param index the index in our list.
   * 
   * @return the sample rate, or 0 if unknown, index < 0 or
   *   index >= {@link #getNumSupportedAudioSampleRates()}
   */
  virtual int32_t getSupportedAudioSampleRate(int32_t index)=0;
  
  /**
   * Get the number of different audio sample formats this codec supports
   * for encoding.  Not all codecs will report this.
   * 
   * @return the number or 0 if we don't know.
   */

  virtual int32_t getNumSupportedAudioSampleFormats()=0;
  
  /**
   * Get the supported sample format at this index.
   * 
   * @param index the index in our list.
   * 
   * @return the format, or {@link IAudioSamples.Format.FMT_NONE} if
   *   unknown, index < 0 or index >=
   *   {@link #getNumSupportedAudioSampleFormats()}.
   */
  virtual IAudioSamples::Format getSupportedAudioSampleFormat(int32_t index)=0;
  
  /**
   * Get the number of different audio channel layouts this codec supports
   * for encoding.  Not all codecs will report this.
   * 
   * 
   * @return the number or 0 if we don't know.
   */

  virtual int32_t getNumSupportedAudioChannelLayouts()=0;
  
  /**
   * Get the supported audio channel layout at this index.
   * 
   * The value returned is a bit flag representing the different
   * types of audio layout this codec can support.  Test the values
   * by bit-comparing them to the {@link IAudioSamples.ChannelLayout}
   * enum types.
   * 
   * @param index the index
   * 
   * @return the channel layout, or 0 if unknown, index < 0 or
   *   index >= {@link #getNumSupportedAudioChannelLayouts}.
   */
  virtual int64_t getSupportedAudioChannelLayout(int32_t index)=0;
  
};

}
}
}

#endif /*IH_*/
