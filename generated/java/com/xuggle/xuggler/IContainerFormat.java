/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
public class IContainerFormat extends RefCounted {
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
  protected IContainerFormat(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.IContainerFormat_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected IContainerFormat(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.IContainerFormat_SWIGUpcast(cPtr),
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
  public static long getCPtr(IContainerFormat obj) {
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
   * Create a new IContainerFormat object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public IContainerFormat copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new IContainerFormat(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof IContainerFormat)
      equal = (((IContainerFormat)obj).swigCPtr == this.swigCPtr);
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
   * info about this format object
   * @return information about this object
   */
   
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    if (isInput())
    {
      result.append("iname:"+getInputFormatShortName()+";");
      result.append("ilongname:"+getInputFormatLongName()+";");
    }
    if (isOutput())
    {
      result.append("oname:"+getOutputFormatShortName()+";");
      result.append("olongname:"+getOutputFormatLongName()+";");
      result.append("omimetype:"+getOutputFormatMimeType()+";");
      result.append("oextensions:"+getOutputExtensions()+";");
    }
    result.append("]");
    return result.toString();
  }
  
  /**
   * Returns a list of all codecs supported for this Object.
   *
   * <p>
   *
   * If this object hasn't been set up for output, then
   * we return null.
   *
   * </p>
   *
   * @return A list of supported codecs, in decreasing preferred order.
   * @since 3.1
   */
  public java.util.List<ICodec.ID> getOutputCodecsSupported()
  {
    final java.util.List<ICodec.ID> retval =
      new java.util.LinkedList<ICodec.ID>();
    final java.util.Set<ICodec.ID> uniqueSet =
      new java.util.HashSet<ICodec.ID>();
    
    int numCodecs = getOutputNumCodecsSupported();
    for(int i = 0; i < numCodecs; i++)
    {
      ICodec.ID id = getOutputCodecID(i);
      // remove duplicate IDs
      if (id != ICodec.ID.AV_CODEC_ID_NONE && !uniqueSet.contains(id))
        retval.add(id);
      uniqueSet.add(id);
    }    
    return retval;
  }

  /**
   * Returns a list of all codec tags supported for this container.
   *
   * <p>
   *
   * If this object hasn't been set up for output, then
   * we return null.
   *
   * </p>
   *
   * @return A list of supported codec tags, in decreasing preferred order.
   * @since 3.3
   */
  public java.util.List<Integer> getOutputTagsSupported()
  {
    final java.util.List<Integer> retval =
      new java.util.LinkedList<Integer>();
    final java.util.Set<Integer> uniqueSet =
      new java.util.HashSet<Integer>();
    
    int numCodecs = getOutputNumCodecsSupported();
    for(int i = 0; i < numCodecs; i++)
    {
      int tag = getOutputCodecTag(i);
      ICodec.ID id = getOutputCodecID(i);
      // remove duplicate tags
      if (id != ICodec.ID.AV_CODEC_ID_NONE && !uniqueSet.contains(tag))
        retval.add(tag);
      uniqueSet.add(tag);
    }    
    return retval;
  }
  
    /**
   * Return a collection of all input formats installed on this system.
   * @return the list.
   */
  public static java.util.Collection<IContainerFormat>
  getInstalledInputFormats()
  {
    java.util.Collection<IContainerFormat> retval =
      new java.util.HashSet<IContainerFormat>();
    int count = getNumInstalledInputFormats();
    for(int i = 0; i< count;++i)
    {
      IContainerFormat fmt = getInstalledInputFormat(i);
      if (fmt != null)
        retval.add(fmt);
    }
    return retval;
  }
  
  /**
   * Return a collection of all output formats installed on this system.
   * @return the list.
   */
  public static java.util.Collection<IContainerFormat>
  getInstalledOutputFormats()
  {
    java.util.Collection<IContainerFormat> retval =
      new java.util.HashSet<IContainerFormat>();
    int count = getNumInstalledOutputFormats();
    for(int i = 0; i< count;++i)
    {
      IContainerFormat fmt = getInstalledOutputFormat(i);
      if (fmt != null)
        retval.add(fmt);
    }
    return retval;
  }
/**
   * For a given output codec type guess the best codec
   * for encoding into this container.
   * 
   * @param type the codec type
   *
   * @return the best guess output codec ID
   * 
   * @see #establishOutputCodecId(com.xuggle.xuggler.ICodec.Type, com.xuggle.xuggler.ICodec.ID)
   * @throws IllegalArgumentException if type is null
   *   or {@link #isOutput()} is false.
   * @throws UnsupportedOperationException if we cannot establish
   *   a codec.
   */

  public ICodec.ID establishOutputCodecId(ICodec.Type type)
  {
    return establishOutputCodecId(type, null);
  }
  
  /**
   * For a given input codec id guess an ID supported by this
   * IContainerFormat that might be good for encoding.
   * 
   * @param inputCodecId the input codec id
   *
   * @return the best guess output codec ID
   * 
   * @see #establishOutputCodecId(com.xuggle.xuggler.ICodec.Type, com.xuggle.xuggler.ICodec.ID)
   * @throws IllegalArgumentException if inputCodec is null
   *   or {@link #isOutput()} is false.
   * @throws UnsupportedOperationException if we cannot establish
   *   a codec.
   */

  public ICodec.ID establishOutputCodecId(ICodec.ID inputCodecId)
  {
    ICodec codec = null;
    try
    {
      if (inputCodecId == null || inputCodecId == ICodec.ID.AV_CODEC_ID_NONE)
        throw new IllegalArgumentException("null inputCodecId");
      
      codec = ICodec.findDecodingCodec(inputCodecId);
      if (codec == null)
        throw new UnsupportedOperationException("could not find decoding codec");
      return establishOutputCodecId(codec);
    }
    finally
    {
      if (codec != null)
        codec.delete();
    }
  }
  /**
   * For a given input codec guess an ID supported by this
   * IContainerFormat that might be good for encoding.
   * 
   * @param inputCodec the input codec
   *
   * @see #establishOutputCodecId(com.xuggle.xuggler.ICodec.Type, com.xuggle.xuggler.ICodec.ID)
   * @return the best guess output codec ID
   * 
   * @throws IllegalArgumentException if inputCodec is null
   *   or {@link #isOutput()} is false.
   * @throws UnsupportedOperationException if we cannot establish
   *   a codec.
   */

  public ICodec.ID establishOutputCodecId(ICodec inputCodec)
  {
    if (inputCodec == null)
      throw new IllegalArgumentException();
    return establishOutputCodecId(inputCodec.getType(), inputCodec.getID());
  }

  /**
   * For a given input codec guess an ID supported by this
   * IContainerFormat that might be good for encoding.
   * 
   * <p>
   * For example, if the input codec ID was
   * {@link ICodec.ID#CODEC_ID_FLAC} and you were trying
   * to encoding into an "FLV" file that doesn't support that
   * codec for outputting, this method will instead suggest
   * {@link ICodec.ID#CODEC_ID_MP3} instead.
   * </p>
   * <p>
   * The algorithm followed is:
   * </p>
   * <ul>
   *   <li>If the container has a preferred codec for the given
   *   codec type, use that; else</li>
   *   <li>If the input codec can be used for encoding into this
   *   container, and is installed on this system, use that; else</li>
   *   <li>Query the container format to see what other formats it
   *   can support, and are installed on this system, and choose the
   *   first one that will work; else</li>
   *   <li>Throw an {@link UnsupportedOperationException}.</li>
   * </ul>
   * 
   * <p>
   * This method relies on
   * FFMPEGs internal database of codec IDs to identify the correct
   * output codec IDs that can fit in this container.
   * </p>
   * 
   * @param type the type of codec desired
   * @param inputCodecId an input codec id to attempt to match, or null
   *   if none.
   *
   * @return the best guess output codec ID
   * 
   * @throws IllegalArgumentException if inputCodecId is null
   *   or equal to {@link ICodec.ID#CODEC_ID_NONE}, or 
   *   {@link #isOutput()} is false.
   * @throws UnsupportedOperationException if we cannot establish
   *   a codec.
   */

  public ICodec.ID establishOutputCodecId(
      ICodec.Type type,
      ICodec.ID inputCodecId)
  {
    ICodec codec = null;
    ICodec inputCodec = null;
    try
    {
      if (type == null)
        throw new IllegalArgumentException("null codec type");

      if (!this.isOutput())
        throw new IllegalArgumentException(
            "passed output container format, actally an input container format");

      if (inputCodecId != null && inputCodecId != ICodec.ID.AV_CODEC_ID_NONE)
      {
        inputCodec = ICodec.findDecodingCodec(inputCodecId);
        if (inputCodec == null)
          throw new IllegalArgumentException("could not find input codec id");
        
        if (inputCodec.getType() != type)
          throw new IllegalArgumentException("inputCodecId of different type"+
            " than expected");
      }

      // the would be output codec

      ICodec.ID outputCodecId = null;

      // find the default codec for the output container by input codec type

      switch (type)
      {
        case CODEC_TYPE_AUDIO:
          outputCodecId = this.getOutputDefaultAudioCodec();
          break;
        case CODEC_TYPE_VIDEO:
          outputCodecId = this.getOutputDefaultVideoCodec();
          break;
        case CODEC_TYPE_SUBTITLE:
          outputCodecId = this.getOutputDefaultSubtitleCodec();
          break;
      }
      if (outputCodecId != null && outputCodecId != ICodec.ID.AV_CODEC_ID_NONE)
      {
        codec = ICodec.findEncodingCodec(outputCodecId);
      }
      if (codec != null)
        return outputCodecId;

      // ok, otherwise that didn't work, so try the input codec
      if (inputCodec != null)
      {
        codec = ICodec.findEncodingCodec(inputCodecId);
        if (codec != null &&
            this.isCodecSupportedForOutput(codec.getID()))
          return codec.getID();
      }

      // if there still isn't a valid codec, hunt through all the codecs
      // for the output format and see if ANY match the input codec type

      for (ICodec.ID codecId : this.getOutputCodecsSupported())
      {
        if (codec != null)
          codec.delete();
        codec = ICodec.findEncodingCodec(codecId);
        if (codec != null && codec.getType() == type)
        {
          // if it is a valid codec break out of the search

          outputCodecId = codec.getID();
          if (codec.canEncode())
          {
            break;
          }
        }
      }
      if (outputCodecId == null || outputCodecId == ICodec.ID.AV_CODEC_ID_NONE)
        throw new UnsupportedOperationException("could not guess codec");
      return outputCodecId;
    }
    finally
    {
      if (codec != null)
        codec.delete();
      if (inputCodec != null)
        inputCodec.delete();
    }
  }
   

  public int setInputFormat(String shortName) {
    return XugglerJNI.IContainerFormat_setInputFormat(swigCPtr, this, shortName);
  }

  public int setOutputFormat(String shortName, String url, String mimeType) {
    return XugglerJNI.IContainerFormat_setOutputFormat(swigCPtr, this, shortName, url, mimeType);
  }

  public String getInputFormatShortName() {
    return XugglerJNI.IContainerFormat_getInputFormatShortName(swigCPtr, this);
  }

  public String getInputFormatLongName() {
    return XugglerJNI.IContainerFormat_getInputFormatLongName(swigCPtr, this);
  }

  public String getOutputFormatShortName() {
    return XugglerJNI.IContainerFormat_getOutputFormatShortName(swigCPtr, this);
  }

  public String getOutputFormatLongName() {
    return XugglerJNI.IContainerFormat_getOutputFormatLongName(swigCPtr, this);
  }

  public String getOutputFormatMimeType() {
    return XugglerJNI.IContainerFormat_getOutputFormatMimeType(swigCPtr, this);
  }

  public static IContainerFormat make() {
    long cPtr = XugglerJNI.IContainerFormat_make();
    return (cPtr == 0) ? null : new IContainerFormat(cPtr, false);
  }

  public int getInputFlags() {
    return XugglerJNI.IContainerFormat_getInputFlags(swigCPtr, this);
  }

  public void setInputFlags(int newFlags) {
    XugglerJNI.IContainerFormat_setInputFlags(swigCPtr, this, newFlags);
  }

  public boolean getInputFlag(IContainerFormat.Flags flag) {
    return XugglerJNI.IContainerFormat_getInputFlag(swigCPtr, this, flag.swigValue());
  }

  public void setInputFlag(IContainerFormat.Flags flag, boolean value) {
    XugglerJNI.IContainerFormat_setInputFlag(swigCPtr, this, flag.swigValue(), value);
  }

  public int getOutputFlags() {
    return XugglerJNI.IContainerFormat_getOutputFlags(swigCPtr, this);
  }

  public void setOutputFlags(int newFlags) {
    XugglerJNI.IContainerFormat_setOutputFlags(swigCPtr, this, newFlags);
  }

  public boolean getOutputFlag(IContainerFormat.Flags flag) {
    return XugglerJNI.IContainerFormat_getOutputFlag(swigCPtr, this, flag.swigValue());
  }

  public void setOutputFlag(IContainerFormat.Flags flag, boolean value) {
    XugglerJNI.IContainerFormat_setOutputFlag(swigCPtr, this, flag.swigValue(), value);
  }

  public boolean isOutput() {
    return XugglerJNI.IContainerFormat_isOutput(swigCPtr, this);
  }

  public boolean isInput() {
    return XugglerJNI.IContainerFormat_isInput(swigCPtr, this);
  }

  public String getOutputExtensions() {
    return XugglerJNI.IContainerFormat_getOutputExtensions(swigCPtr, this);
  }

  public ICodec.ID getOutputDefaultAudioCodec() {
    return ICodec.ID.swigToEnum(XugglerJNI.IContainerFormat_getOutputDefaultAudioCodec(swigCPtr, this));
  }

  public ICodec.ID getOutputDefaultVideoCodec() {
    return ICodec.ID.swigToEnum(XugglerJNI.IContainerFormat_getOutputDefaultVideoCodec(swigCPtr, this));
  }

  public ICodec.ID getOutputDefaultSubtitleCodec() {
    return ICodec.ID.swigToEnum(XugglerJNI.IContainerFormat_getOutputDefaultSubtitleCodec(swigCPtr, this));
  }

  public int getOutputNumCodecsSupported() {
    return XugglerJNI.IContainerFormat_getOutputNumCodecsSupported(swigCPtr, this);
  }

  public ICodec.ID getOutputCodecID(int index) {
    return ICodec.ID.swigToEnum(XugglerJNI.IContainerFormat_getOutputCodecID(swigCPtr, this, index));
  }

  public int getOutputCodecTag(int index) {
    return XugglerJNI.IContainerFormat_getOutputCodecTag__SWIG_0(swigCPtr, this, index);
  }

  public int getOutputCodecTag(ICodec.ID id) {
    return XugglerJNI.IContainerFormat_getOutputCodecTag__SWIG_1(swigCPtr, this, id.swigValue());
  }

  public boolean isCodecSupportedForOutput(ICodec.ID id) {
    return XugglerJNI.IContainerFormat_isCodecSupportedForOutput(swigCPtr, this, id.swigValue());
  }

  public static int getNumInstalledInputFormats() {
    return XugglerJNI.IContainerFormat_getNumInstalledInputFormats();
  }

  public static IContainerFormat getInstalledInputFormat(int index) {
    long cPtr = XugglerJNI.IContainerFormat_getInstalledInputFormat(index);
    return (cPtr == 0) ? null : new IContainerFormat(cPtr, false);
  }

  public static int getNumInstalledOutputFormats() {
    return XugglerJNI.IContainerFormat_getNumInstalledOutputFormats();
  }

  public static IContainerFormat getInstalledOutputFormat(int index) {
    long cPtr = XugglerJNI.IContainerFormat_getInstalledOutputFormat(index);
    return (cPtr == 0) ? null : new IContainerFormat(cPtr, false);
  }

  public enum Flags {
    FLAG_NOFILE(XugglerJNI.IContainerFormat_FLAG_NOFILE_get()),
    FLAG_NEEDNUMBER(XugglerJNI.IContainerFormat_FLAG_NEEDNUMBER_get()),
    FLAG_SHOW_IDS(XugglerJNI.IContainerFormat_FLAG_SHOW_IDS_get()),
    FLAG_RAWPICTURE(XugglerJNI.IContainerFormat_FLAG_RAWPICTURE_get()),
    FLAG_GLOBALHEADER(XugglerJNI.IContainerFormat_FLAG_GLOBALHEADER_get()),
    FLAG_NOTIMESTAMPS(XugglerJNI.IContainerFormat_FLAG_NOTIMESTAMPS_get()),
    FLAG_GENERIC_INDEX(XugglerJNI.IContainerFormat_FLAG_GENERIC_INDEX_get()),
    FLAG_TS_DISCONT(XugglerJNI.IContainerFormat_FLAG_TS_DISCONT_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Flags swigToEnum(int swigValue) {
      Flags[] swigValues = Flags.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Flags swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Flags.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Flags() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Flags(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Flags(Flags swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
