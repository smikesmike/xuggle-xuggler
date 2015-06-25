/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
public class ICodec extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected ICodec(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.ICodec_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected ICodec(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.ICodec_SWIGUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(ICodec obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new ICodec object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public ICodec copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new ICodec(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof ICodec)
      equal = (((ICodec)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

  /**
   * Prints the type and id of this codec
   * @return the type and id
   */
   
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("type="+getType()+";");
    result.append("id="+getID()+";");
    result.append("name="+getName()+";");
    result.append("]");
    return result.toString();
  }

  /**
   * Gets a collection of ALL codecs installed on this
   * system. 
   * 
   * @return A collection of all installed codecs.
   */

  public static java.util.Collection<ICodec>
  getInstalledCodecs()
  {
    java.util.Collection<ICodec> retval = new java.util.LinkedHashSet<ICodec>();
    int count = getNumInstalledCodecs();
    for(int i=0;i<count;i++)
    {
      ICodec codec = getInstalledCodec(i);
      if (codec != null)
        retval.add(codec);
    }
    return retval;
  }

  /**
   * Returns a list of supported frame-rates this codec can encode
   * video to.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<IRational>
  getSupportedVideoFrameRates()
  {
    java.util.List<IRational> retval =
      new java.util.LinkedList<IRational>();
    int count = getNumSupportedVideoFrameRates();
    for(int i=0;i<count;i++)
    {
      IRational rate = getSupportedVideoFrameRate(i);
      if (rate != null)
        retval.add(rate);
    }
    return retval;
  }

  /**
   * Returns a list of supported pixel formats this codec can encode
   * video in.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<IPixelFormat.Type>
  getSupportedVideoPixelFormats()
  {
    java.util.List<IPixelFormat.Type> retval =
      new java.util.LinkedList<IPixelFormat.Type>();
    int count = getNumSupportedVideoPixelFormats();
    for(int i=0;i<count;i++)
    {
      IPixelFormat.Type type = getSupportedVideoPixelFormat(i);
      if (type != null && type != IPixelFormat.Type.NONE)
        retval.add(type);
    }
    return retval;
  }

  /**
   * Returns a list of supported audio sample rates this codec can encode
   * audio in.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<Integer>
  getSupportedAudioSampleRates()
  {
    java.util.List<Integer> retval =
      new java.util.LinkedList<Integer>();
    int count = getNumSupportedAudioSampleRates();
    for(int i=0;i<count;i++)
    {
      int rate = getSupportedAudioSampleRate(i);
      if (rate != 0)
        retval.add(rate);
    }
    return retval;
  }

  /**
   * Returns a list of supported audio sample formats this codec can encode
   * audio in.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<IAudioSamples.Format>
  getSupportedAudioSampleFormats()
  {
    java.util.List<IAudioSamples.Format> retval =
      new java.util.LinkedList<IAudioSamples.Format>();
    int count = getNumSupportedAudioSampleFormats();
    for(int i=0;i<count;i++)
    {
      IAudioSamples.Format fmt = getSupportedAudioSampleFormat(i);
      if (fmt != null && fmt != IAudioSamples.Format.FMT_NONE)
        retval.add(fmt);
    }
    return retval;
  }

  /**
   * Returns a list of supported audio channel layouts this codec can encode
   * audio in.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<Long>
  getSupportedAudioChannelLayouts()
  {
    java.util.List<Long> retval =
      new java.util.LinkedList<Long>();
    int count = getNumSupportedAudioChannelLayouts();
    for(int i=0;i<count;i++)
    {
      long layout = getSupportedAudioChannelLayout(i);
      if (layout != 0)
        retval.add(layout);
    }
    return retval;
  }


  public String getName() {
    return XugglerJNI.ICodec_getName(swigCPtr, this);
  }

  public int getIDAsInt() {
    return XugglerJNI.ICodec_getIDAsInt(swigCPtr, this);
  }

  public ICodec.ID getID() {
    return ICodec.ID.swigToEnum(XugglerJNI.ICodec_getID(swigCPtr, this));
  }

  public ICodec.Type getType() {
    return ICodec.Type.swigToEnum(XugglerJNI.ICodec_getType(swigCPtr, this));
  }

  public boolean canDecode() {
    return XugglerJNI.ICodec_canDecode(swigCPtr, this);
  }

  public boolean canEncode() {
    return XugglerJNI.ICodec_canEncode(swigCPtr, this);
  }

  public static ICodec findEncodingCodec(ICodec.ID id) {
    long cPtr = XugglerJNI.ICodec_findEncodingCodec(id.swigValue());
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

  public static ICodec findEncodingCodecByIntID(int id) {
    long cPtr = XugglerJNI.ICodec_findEncodingCodecByIntID(id);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

  public static ICodec findEncodingCodecByName(String id) {
    long cPtr = XugglerJNI.ICodec_findEncodingCodecByName(id);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

  public static ICodec findDecodingCodec(ICodec.ID id) {
    long cPtr = XugglerJNI.ICodec_findDecodingCodec(id.swigValue());
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

  public static ICodec findDecodingCodecByIntID(int id) {
    long cPtr = XugglerJNI.ICodec_findDecodingCodecByIntID(id);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

  public static ICodec findDecodingCodecByName(String id) {
    long cPtr = XugglerJNI.ICodec_findDecodingCodecByName(id);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

  public static ICodec guessEncodingCodec(IContainerFormat fmt, String shortName, String url, String mimeType, ICodec.Type type) {
    long cPtr = XugglerJNI.ICodec_guessEncodingCodec(IContainerFormat.getCPtr(fmt), fmt, shortName, url, mimeType, type.swigValue());
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

  public String getLongName() {
    return XugglerJNI.ICodec_getLongName(swigCPtr, this);
  }

  public int getCapabilities() {
    return XugglerJNI.ICodec_getCapabilities(swigCPtr, this);
  }

  public boolean hasCapability(ICodec.Capabilities capability) {
    return XugglerJNI.ICodec_hasCapability(swigCPtr, this, capability.swigValue());
  }

  public static int getNumInstalledCodecs() {
    return XugglerJNI.ICodec_getNumInstalledCodecs();
  }

  public static ICodec getInstalledCodec(int index) {
    long cPtr = XugglerJNI.ICodec_getInstalledCodec(index);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

  public int getNumSupportedVideoFrameRates() {
    return XugglerJNI.ICodec_getNumSupportedVideoFrameRates(swigCPtr, this);
  }

  public IRational getSupportedVideoFrameRate(int index) {
    long cPtr = XugglerJNI.ICodec_getSupportedVideoFrameRate(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

  public int getNumSupportedVideoPixelFormats() {
    return XugglerJNI.ICodec_getNumSupportedVideoPixelFormats(swigCPtr, this);
  }

  public IPixelFormat.Type getSupportedVideoPixelFormat(int index) {
    return IPixelFormat.Type.swigToEnum(XugglerJNI.ICodec_getSupportedVideoPixelFormat(swigCPtr, this, index));
  }

  public int getNumSupportedAudioSampleRates() {
    return XugglerJNI.ICodec_getNumSupportedAudioSampleRates(swigCPtr, this);
  }

  public int getSupportedAudioSampleRate(int index) {
    return XugglerJNI.ICodec_getSupportedAudioSampleRate(swigCPtr, this, index);
  }

  public int getNumSupportedAudioSampleFormats() {
    return XugglerJNI.ICodec_getNumSupportedAudioSampleFormats(swigCPtr, this);
  }

  public IAudioSamples.Format getSupportedAudioSampleFormat(int index) {
    return IAudioSamples.Format.swigToEnum(XugglerJNI.ICodec_getSupportedAudioSampleFormat(swigCPtr, this, index));
  }

  public int getNumSupportedAudioChannelLayouts() {
    return XugglerJNI.ICodec_getNumSupportedAudioChannelLayouts(swigCPtr, this);
  }

  public long getSupportedAudioChannelLayout(int index) {
    return XugglerJNI.ICodec_getSupportedAudioChannelLayout(swigCPtr, this, index);
  }

  public enum ID {
    AV_CODEC_ID_NONE,
    AV_CODEC_ID_MPEG1VIDEO,
    AV_CODEC_ID_MPEG2VIDEO,
    AV_CODEC_ID_MPEG2VIDEO_XVMC,
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
    AV_CODEC_ID_IFF_BYTERUN1,
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
    AV_CODEC_ID_ESCAPE130_DEPRECATED,
    AV_CODEC_ID_G2M_DEPRECATED,
    AV_CODEC_ID_WEBP_DEPRECATED,
    AV_CODEC_ID_HNM4_VIDEO,
    AV_CODEC_ID_HEVC_DEPRECATED,
    AV_CODEC_ID_FIC,
    AV_CODEC_ID_ALIAS_PIX,
    AV_CODEC_ID_BRENDER_PIX_DEPRECATED,
    AV_CODEC_ID_PAF_VIDEO_DEPRECATED,
    AV_CODEC_ID_EXR_DEPRECATED,
    AV_CODEC_ID_VP7_DEPRECATED,
    AV_CODEC_ID_SANM_DEPRECATED,
    AV_CODEC_ID_SGIRLE_DEPRECATED,
    AV_CODEC_ID_MVC1_DEPRECATED,
    AV_CODEC_ID_MVC2_DEPRECATED,
    AV_CODEC_ID_HQX,
    AV_CODEC_ID_BRENDER_PIX(XugglerJNI.ICodec_AV_CODEC_ID_BRENDER_PIX_get()),
    AV_CODEC_ID_Y41P(XugglerJNI.ICodec_AV_CODEC_ID_Y41P_get()),
    AV_CODEC_ID_ESCAPE130(XugglerJNI.ICodec_AV_CODEC_ID_ESCAPE130_get()),
    AV_CODEC_ID_EXR(XugglerJNI.ICodec_AV_CODEC_ID_EXR_get()),
    AV_CODEC_ID_AVRP(XugglerJNI.ICodec_AV_CODEC_ID_AVRP_get()),
    AV_CODEC_ID_012V(XugglerJNI.ICodec_AV_CODEC_ID_012V_get()),
    AV_CODEC_ID_G2M(XugglerJNI.ICodec_AV_CODEC_ID_G2M_get()),
    AV_CODEC_ID_AVUI(XugglerJNI.ICodec_AV_CODEC_ID_AVUI_get()),
    AV_CODEC_ID_AYUV(XugglerJNI.ICodec_AV_CODEC_ID_AYUV_get()),
    AV_CODEC_ID_TARGA_Y216(XugglerJNI.ICodec_AV_CODEC_ID_TARGA_Y216_get()),
    AV_CODEC_ID_V308(XugglerJNI.ICodec_AV_CODEC_ID_V308_get()),
    AV_CODEC_ID_V408(XugglerJNI.ICodec_AV_CODEC_ID_V408_get()),
    AV_CODEC_ID_YUV4(XugglerJNI.ICodec_AV_CODEC_ID_YUV4_get()),
    AV_CODEC_ID_SANM(XugglerJNI.ICodec_AV_CODEC_ID_SANM_get()),
    AV_CODEC_ID_PAF_VIDEO(XugglerJNI.ICodec_AV_CODEC_ID_PAF_VIDEO_get()),
    AV_CODEC_ID_AVRN(XugglerJNI.ICodec_AV_CODEC_ID_AVRN_get()),
    AV_CODEC_ID_CPIA(XugglerJNI.ICodec_AV_CODEC_ID_CPIA_get()),
    AV_CODEC_ID_XFACE(XugglerJNI.ICodec_AV_CODEC_ID_XFACE_get()),
    AV_CODEC_ID_SGIRLE(XugglerJNI.ICodec_AV_CODEC_ID_SGIRLE_get()),
    AV_CODEC_ID_MVC1(XugglerJNI.ICodec_AV_CODEC_ID_MVC1_get()),
    AV_CODEC_ID_MVC2(XugglerJNI.ICodec_AV_CODEC_ID_MVC2_get()),
    AV_CODEC_ID_SNOW(XugglerJNI.ICodec_AV_CODEC_ID_SNOW_get()),
    AV_CODEC_ID_WEBP(XugglerJNI.ICodec_AV_CODEC_ID_WEBP_get()),
    AV_CODEC_ID_SMVJPEG(XugglerJNI.ICodec_AV_CODEC_ID_SMVJPEG_get()),
    AV_CODEC_ID_HEVC(XugglerJNI.ICodec_AV_CODEC_ID_HEVC_get()),
    AV_CODEC_ID_VP7(XugglerJNI.ICodec_AV_CODEC_ID_VP7_get()),
    AV_CODEC_ID_APNG(XugglerJNI.ICodec_AV_CODEC_ID_APNG_get()),
    AV_CODEC_ID_FIRST_AUDIO(XugglerJNI.ICodec_AV_CODEC_ID_FIRST_AUDIO_get()),
    AV_CODEC_ID_PCM_S16LE(XugglerJNI.ICodec_AV_CODEC_ID_PCM_S16LE_get()),
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
    AV_CODEC_ID_PCM_S24LE_PLANAR_DEPRECATED,
    AV_CODEC_ID_PCM_S32LE_PLANAR_DEPRECATED,
    AV_CODEC_ID_PCM_S24LE_PLANAR(XugglerJNI.ICodec_AV_CODEC_ID_PCM_S24LE_PLANAR_get()),
    AV_CODEC_ID_PCM_S32LE_PLANAR(XugglerJNI.ICodec_AV_CODEC_ID_PCM_S32LE_PLANAR_get()),
    AV_CODEC_ID_PCM_S16BE_PLANAR(XugglerJNI.ICodec_AV_CODEC_ID_PCM_S16BE_PLANAR_get()),
    AV_CODEC_ID_ADPCM_IMA_QT(XugglerJNI.ICodec_AV_CODEC_ID_ADPCM_IMA_QT_get()),
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
    AV_CODEC_ID_ADPCM_VIMA_DEPRECATED,
    AV_CODEC_ID_ADPCM_VIMA(XugglerJNI.ICodec_AV_CODEC_ID_ADPCM_VIMA_get()),
    AV_CODEC_ID_VIMA(XugglerJNI.ICodec_AV_CODEC_ID_VIMA_get()),
    AV_CODEC_ID_ADPCM_AFC(XugglerJNI.ICodec_AV_CODEC_ID_ADPCM_AFC_get()),
    AV_CODEC_ID_ADPCM_IMA_OKI(XugglerJNI.ICodec_AV_CODEC_ID_ADPCM_IMA_OKI_get()),
    AV_CODEC_ID_ADPCM_DTK(XugglerJNI.ICodec_AV_CODEC_ID_ADPCM_DTK_get()),
    AV_CODEC_ID_ADPCM_IMA_RAD(XugglerJNI.ICodec_AV_CODEC_ID_ADPCM_IMA_RAD_get()),
    AV_CODEC_ID_ADPCM_G726LE(XugglerJNI.ICodec_AV_CODEC_ID_ADPCM_G726LE_get()),
    AV_CODEC_ID_AMR_NB(XugglerJNI.ICodec_AV_CODEC_ID_AMR_NB_get()),
    AV_CODEC_ID_AMR_WB,
    AV_CODEC_ID_RA_144(XugglerJNI.ICodec_AV_CODEC_ID_RA_144_get()),
    AV_CODEC_ID_RA_288,
    AV_CODEC_ID_ROQ_DPCM(XugglerJNI.ICodec_AV_CODEC_ID_ROQ_DPCM_get()),
    AV_CODEC_ID_INTERPLAY_DPCM,
    AV_CODEC_ID_XAN_DPCM,
    AV_CODEC_ID_SOL_DPCM,
    AV_CODEC_ID_MP2(XugglerJNI.ICodec_AV_CODEC_ID_MP2_get()),
    AV_CODEC_ID_MP3,
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
    AV_CODEC_ID_GSM,
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
    AV_CODEC_ID_GSM_MS,
    AV_CODEC_ID_ATRAC3,
    AV_CODEC_ID_VOXWARE,
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
    AV_CODEC_ID_OPUS_DEPRECATED,
    AV_CODEC_ID_COMFORT_NOISE,
    AV_CODEC_ID_TAK_DEPRECATED,
    AV_CODEC_ID_METASOUND,
    AV_CODEC_ID_PAF_AUDIO_DEPRECATED,
    AV_CODEC_ID_ON2AVC,
    AV_CODEC_ID_DSS_SP,
    AV_CODEC_ID_FFWAVESYNTH(XugglerJNI.ICodec_AV_CODEC_ID_FFWAVESYNTH_get()),
    AV_CODEC_ID_SONIC(XugglerJNI.ICodec_AV_CODEC_ID_SONIC_get()),
    AV_CODEC_ID_SONIC_LS(XugglerJNI.ICodec_AV_CODEC_ID_SONIC_LS_get()),
    AV_CODEC_ID_PAF_AUDIO(XugglerJNI.ICodec_AV_CODEC_ID_PAF_AUDIO_get()),
    AV_CODEC_ID_OPUS(XugglerJNI.ICodec_AV_CODEC_ID_OPUS_get()),
    AV_CODEC_ID_TAK(XugglerJNI.ICodec_AV_CODEC_ID_TAK_get()),
    AV_CODEC_ID_EVRC(XugglerJNI.ICodec_AV_CODEC_ID_EVRC_get()),
    AV_CODEC_ID_SMV(XugglerJNI.ICodec_AV_CODEC_ID_SMV_get()),
    AV_CODEC_ID_DSD_LSBF(XugglerJNI.ICodec_AV_CODEC_ID_DSD_LSBF_get()),
    AV_CODEC_ID_DSD_MSBF(XugglerJNI.ICodec_AV_CODEC_ID_DSD_MSBF_get()),
    AV_CODEC_ID_DSD_LSBF_PLANAR(XugglerJNI.ICodec_AV_CODEC_ID_DSD_LSBF_PLANAR_get()),
    AV_CODEC_ID_DSD_MSBF_PLANAR(XugglerJNI.ICodec_AV_CODEC_ID_DSD_MSBF_PLANAR_get()),
    AV_CODEC_ID_FIRST_SUBTITLE(XugglerJNI.ICodec_AV_CODEC_ID_FIRST_SUBTITLE_get()),
    AV_CODEC_ID_DVD_SUBTITLE(XugglerJNI.ICodec_AV_CODEC_ID_DVD_SUBTITLE_get()),
    AV_CODEC_ID_DVB_SUBTITLE,
    AV_CODEC_ID_TEXT,
    AV_CODEC_ID_XSUB,
    AV_CODEC_ID_SSA,
    AV_CODEC_ID_MOV_TEXT,
    AV_CODEC_ID_HDMV_PGS_SUBTITLE,
    AV_CODEC_ID_DVB_TELETEXT,
    AV_CODEC_ID_SRT,
    AV_CODEC_ID_MICRODVD(XugglerJNI.ICodec_AV_CODEC_ID_MICRODVD_get()),
    AV_CODEC_ID_EIA_608(XugglerJNI.ICodec_AV_CODEC_ID_EIA608_get()),
    AV_CODEC_ID_JACOSUB(XugglerJNI.ICodec_AV_CODEC_ID_JACOSUB_get()),
    AV_CODEC_ID_SAMI(XugglerJNI.ICodec_AV_CODEC_ID_SAMI_get()),
    AV_CODEC_ID_REALTEXT(XugglerJNI.ICodec_AV_CODEC_ID_REALTEXT_get()),
    AV_CODEC_ID_STL(XugglerJNI.ICodec_AV_CODEC_ID_STL_get()),
    AV_CODEC_ID_SUBVIEWER1(XugglerJNI.ICodec_AV_CODEC_ID_SUBVIEWER1_get()),
    AV_CODEC_ID_SUBVIEWER(XugglerJNI.ICodec_AV_CODEC_ID_SUBVIEWER_get()),
    AV_CODEC_ID_SUBRIP(XugglerJNI.ICodec_AV_CODEC_ID_SUBRIP_get()),
    AV_CODEC_ID_WEBVTT(XugglerJNI.ICodec_AV_CODEC_ID_WEBVTT_get()),
    AV_CODEC_ID_MPL2(XugglerJNI.ICodec_AV_CODEC_ID_MPL2_get()),
    AV_CODEC_ID_VPLAYER(XugglerJNI.ICodec_AV_CODEC_ID_VPLAYER_get()),
    AV_CODEC_ID_PJS(XugglerJNI.ICodec_AV_CODEC_ID_PJS_get()),
    AV_CODEC_ID_ASS(XugglerJNI.ICodec_AV_CODEC_ID_ASS_get()),
    AV_CODEC_ID_FIRST_UNKNOWN(XugglerJNI.ICodec_AV_CODEC_ID_FIRST_UNKNOWN_get()),
    AV_CODEC_ID_TTF(XugglerJNI.ICodec_AV_CODEC_ID_TTF_get()),
    AV_CODEC_ID_BINTEXT(XugglerJNI.ICodec_AV_CODEC_ID_BINTEXT_get()),
    AV_CODEC_ID_XBIN(XugglerJNI.ICodec_AV_CODEC_ID_XBIN_get()),
    AV_CODEC_ID_IDF(XugglerJNI.ICodec_AV_CODEC_ID_IDF_get()),
    AV_CODEC_ID_OTF(XugglerJNI.ICodec_AV_CODEC_ID_OTF_get()),
    AV_CODEC_ID_SMPTE_KLV(XugglerJNI.ICodec_AV_CODEC_ID_SMPTE_KLV_get()),
    AV_CODEC_ID_DVD_NAV(XugglerJNI.ICodec_AV_CODEC_ID_DVD_NAV_get()),
    AV_CODEC_ID_TIMED_ID3(XugglerJNI.ICodec_AV_CODEC_ID_TIMED_ID3_get()),
    AV_CODEC_ID_BIN_DATA(XugglerJNI.ICodec_AV_CODEC_ID_BIN_DATA_get()),
    AV_CODEC_ID_PROBE(XugglerJNI.ICodec_AV_CODEC_ID_PROBE_get()),
    AV_CODEC_ID_MPEG2TS(XugglerJNI.ICodec_AV_CODEC_ID_MPEG2TS_get()),
    AV_CODEC_ID_MPEG4SYSTEMS(XugglerJNI.ICodec_AV_CODEC_ID_MPEG4SYSTEMS_get()),
    AV_CODEC_ID_FFMETADATA(XugglerJNI.ICodec_AV_CODEC_ID_FFMETADATA_get());

    public final int swigValue() {
      return swigValue;
    }

    public static ID swigToEnum(int swigValue) {
      ID[] swigValues = ID.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ID swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ID.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ID() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ID(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ID(ID swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum Type {
    CODEC_TYPE_UNKNOWN(XugglerJNI.ICodec_CODEC_TYPE_UNKNOWN_get()),
    CODEC_TYPE_VIDEO,
    CODEC_TYPE_AUDIO,
    CODEC_TYPE_DATA,
    CODEC_TYPE_SUBTITLE,
    CODEC_TYPE_ATTACHMENT;

    public final int swigValue() {
      return swigValue;
    }

    public static Type swigToEnum(int swigValue) {
      Type[] swigValues = Type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Type(Type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum Capabilities {
    CAP_DRAW_HORIZ_BAND(XugglerJNI.ICodec_CAP_DRAW_HORIZ_BAND_get()),
    CAP_DR1(XugglerJNI.ICodec_CAP_DR1_get()),
    CAP_PARSE_ONLY(XugglerJNI.ICodec_CAP_PARSE_ONLY_get()),
    CAP_TRUNCATED(XugglerJNI.ICodec_CAP_TRUNCATED_get()),
    CAP_HWACCEL(XugglerJNI.ICodec_CAP_HWACCEL_get()),
    CAP_DELAY(XugglerJNI.ICodec_CAP_DELAY_get()),
    CAP_SMALL_LAST_FRAME(XugglerJNI.ICodec_CAP_SMALL_LAST_FRAME_get()),
    CAP_HWACCEL_VDPAU(XugglerJNI.ICodec_CAP_HWACCEL_VDPAU_get()),
    CAP_SUBFRAMES(XugglerJNI.ICodec_CAP_SUBFRAMES_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Capabilities swigToEnum(int swigValue) {
      Capabilities[] swigValues = Capabilities.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Capabilities swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Capabilities.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Capabilities() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Capabilities(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Capabilities(Capabilities swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
