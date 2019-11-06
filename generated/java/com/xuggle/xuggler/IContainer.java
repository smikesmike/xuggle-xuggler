/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
public class IContainer extends RefCounted implements com.xuggle.xuggler.IConfigurable {
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
  protected IContainer(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.IContainer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected IContainer(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.IContainer_SWIGUpcast(cPtr),
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
  public static long getCPtr(IContainer obj) {
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
   * Create a new IContainer object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public IContainer copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new IContainer(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof IContainer)
      equal = (((IContainer)obj).swigCPtr == this.swigCPtr);
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
   * info about this container.  We only print information that can be
   * determined without reading data from the container.
   * @return a string representation of this object
   */
   
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("url:"+getURL()+";");
    result.append("type:"+getType()+";");
    result.append("format:"+getContainerFormat()+";");
    result.append("]");
    return result.toString();
  }

  /**
   * Open this container and make it ready for reading or writing.
   * Reading or writing ability is determined by
   * what the {@link com.xuggle.xuggler.io.IURLProtocolHandler}
   * passed in supports.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    com.xuggle.xuggler.io.IURLProtocolHandler handler,
    IContainer.Type type, IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(handler), type, format); 
  }

  /**
   * Open this container and make it ready for writing.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.io.OutputStream output,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(output),
     IContainer.Type.WRITE, format); 
  }

  /**
   * Open this container and make it ready for reading.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.io.InputStream input,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(input),
     IContainer.Type.READ, format); 
  }

  /**
   * Open this container and make it ready for writing.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.io.DataOutput output,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(output),
     IContainer.Type.WRITE, format); 
  }

  /**
   * Open this container and make it ready for writing.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.io.DataOutputStream output,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(
        (java.io.OutputStream)output),
     IContainer.Type.WRITE, format); 
  }

  /**
   * Open this container and make it ready for reading.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.io.DataInput input,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(input),
     IContainer.Type.READ, format); 
  }

  /**
   * Open this container and make it ready for reading.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.io.DataInputStream input,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(
        (java.io.InputStream)input),
     IContainer.Type.READ, format); 
  }

  /**
   * Open this container and make it ready for reading or writing.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.io.RandomAccessFile file,
    IContainer.Type type,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(file),
     type, format); 
  }

  /**
   * Open this container and make it ready for writing.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.nio.channels.WritableByteChannel output,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(output),
     IContainer.Type.WRITE, format); 
  }

  /**
   * Open this container and make it ready for reading.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.nio.channels.ReadableByteChannel input,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(input),
     IContainer.Type.READ, format); 
  }

  /**
   * Open this container and make it ready for reading or writing.
   * @see #open(String, IContainer.Type, IContainerFormat)
   */  
  public int open(
    java.nio.channels.ByteChannel channel,
    IContainer.Type type,
    IContainerFormat format)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(channel),
     type, format); 
  }


/**
 * Open this container and make it ready for reading or writing, optionally 
 * reading as far into the container as necessary to find all streams.
 * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
 */
  public int open(com.xuggle.xuggler.io.IURLProtocolHandler handler,
    IContainer.Type type, IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(handler), type, format,
      streamsCanBeAddedDynamically,
      queryStreamMetaData); 
  }

  /**
   * Open this container and make it ready for writing.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.io.OutputStream output,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(output),
     IContainer.Type.WRITE, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }

  /**
   * Open this container and make it ready for reading.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.io.InputStream input,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(input),
     IContainer.Type.READ, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }

  /**
   * Open this container and make it ready for writing.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.io.DataOutput output,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(output),
     IContainer.Type.WRITE, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }

  /**
   * Open this container and make it ready for writing.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.io.DataOutputStream output,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(
        (java.io.OutputStream)output),
     IContainer.Type.WRITE, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }

  /**
   * Open this container and make it ready for reading.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.io.DataInput input,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(input),
     IContainer.Type.READ, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }

  /**
   * Open this container and make it ready for reading.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.io.DataInputStream input,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(
        (java.io.InputStream)input),
     IContainer.Type.READ, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }
  
  /**
   * Open this container and make it ready for reading or writing.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.io.RandomAccessFile file,
    IContainer.Type type,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(file),
     type, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }

  /**
   * Open this container and make it ready for writing.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.nio.channels.WritableByteChannel output,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(output),
     IContainer.Type.WRITE, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }

  /**
   * Open this container and make it ready for reading.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.nio.channels.ReadableByteChannel input,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(input),
     IContainer.Type.READ, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }

  /**
   * Open this container and make it ready for reading or writing.
   * @see #open(String, IContainer.Type, IContainerFormat, boolean, boolean) 
   */  
  public int open(
    java.nio.channels.ByteChannel channel,
    IContainer.Type type,
    IContainerFormat format,
    boolean streamsCanBeAddedDynamically,
    boolean queryStreamMetaData)
  {
    return open(com.xuggle.xuggler.io.XugglerIO.map(channel),
     type, format, streamsCanBeAddedDynamically, queryStreamMetaData); 
  }

  /**
   * Gets the SDP data as a Java string.
   * <p>
   * This method only supports SDP files up to 4K in size.
   * If you have a larger SDP file, use the
   * {@link #createSDPData(com.xuggle.ferry.IBuffer)} method and pass in your
   * own {@link com.xuggle.ferry.IBuffer} object.
   * </p> 
   * @return A {@link String} representing the data.
   * @see #createSDPData(IBuffer)
   */
  public String createSDPData()
  {
    IBuffer buffer = IBuffer.make(null, 4096);
    int len = this.createSDPData(buffer);
    if (len > 1)
    {
      byte [] stringBuf = new byte[len-1];
      buffer.get(0, stringBuf, 0, stringBuf.length);
      return new String(stringBuf);
    }
    return null;
  }
  /**
   * {@inheritDoc}
   */
  public java.util.Collection<String> getPropertyNames()
  {
    java.util.Collection<String> retval = new java.util.LinkedList<String>();
    int numProperties = this.getNumProperties();
    for(int i = 0; i < numProperties; i++)
    {
      IProperty property = this.getPropertyMetaData(i);
      String name = property.getName();
      retval.add(name);
    }
    return retval;
  }

  

  public int setInputBufferLength(long size) {
    return XugglerJNI.IContainer_setInputBufferLength(swigCPtr, this, size);
  }

  public long getInputBufferLength() {
    return XugglerJNI.IContainer_getInputBufferLength(swigCPtr, this);
  }

  public boolean isOpened() {
    return XugglerJNI.IContainer_isOpened(swigCPtr, this);
  }

  public boolean isHeaderWritten() {
    return XugglerJNI.IContainer_isHeaderWritten(swigCPtr, this);
  }

  public int open(String url, IContainer.Type type, IContainerFormat pContainerFormat) {
    return XugglerJNI.IContainer_open__SWIG_0(swigCPtr, this, url, type.swigValue(), IContainerFormat.getCPtr(pContainerFormat), pContainerFormat);
  }

  public int open(String url, IContainer.Type type, IContainerFormat pContainerFormat, boolean aStreamsCanBeAddedDynamically, boolean aQueryStreamMetaData) {
    return XugglerJNI.IContainer_open__SWIG_1(swigCPtr, this, url, type.swigValue(), IContainerFormat.getCPtr(pContainerFormat), pContainerFormat, aStreamsCanBeAddedDynamically, aQueryStreamMetaData);
  }

  public IContainerFormat getContainerFormat() {
    long cPtr = XugglerJNI.IContainer_getContainerFormat(swigCPtr, this);
    return (cPtr == 0) ? null : new IContainerFormat(cPtr, false);
  }

  public int close() {
    return XugglerJNI.IContainer_close(swigCPtr, this);
  }

  public IContainer.Type getType() {
    return IContainer.Type.swigToEnum(XugglerJNI.IContainer_getType(swigCPtr, this));
  }

  public int getNumStreams() {
    return XugglerJNI.IContainer_getNumStreams(swigCPtr, this);
  }

  public IStream getStream(long streamIndex) {
    long cPtr = XugglerJNI.IContainer_getStream(swigCPtr, this, streamIndex);
    return (cPtr == 0) ? null : new IStream(cPtr, false);
  }

  @Deprecated public IStream addNewStream(int id) {
    long cPtr = XugglerJNI.IContainer_addNewStream__SWIG_0(swigCPtr, this, id);
    return (cPtr == 0) ? null : new IStream(cPtr, false);
  }

  public int writeHeader() {
    return XugglerJNI.IContainer_writeHeader(swigCPtr, this);
  }

  public int writeTrailer() {
    return XugglerJNI.IContainer_writeTrailer(swigCPtr, this);
  }

  public int readNextPacket(IPacket packet) {
    return XugglerJNI.IContainer_readNextPacket(swigCPtr, this, IPacket.getCPtr(packet), packet);
  }

  public int writePacket(IPacket packet, boolean forceInterleave) {
    return XugglerJNI.IContainer_writePacket__SWIG_0(swigCPtr, this, IPacket.getCPtr(packet), packet, forceInterleave);
  }

  public int writePacket(IPacket packet) {
    return XugglerJNI.IContainer_writePacket__SWIG_1(swigCPtr, this, IPacket.getCPtr(packet), packet);
  }

  public static IContainer make() {
    long cPtr = XugglerJNI.IContainer_make__SWIG_0();
    return (cPtr == 0) ? null : new IContainer(cPtr, false);
  }

  public int queryStreamMetaData() {
    return XugglerJNI.IContainer_queryStreamMetaData(swigCPtr, this);
  }

  public int seekKeyFrame(int streamIndex, long timestamp, int flags) {
    return XugglerJNI.IContainer_seekKeyFrame__SWIG_0(swigCPtr, this, streamIndex, timestamp, flags);
  }

  public long getDuration() {
    return XugglerJNI.IContainer_getDuration(swigCPtr, this);
  }

  public long getStartTime() {
    return XugglerJNI.IContainer_getStartTime(swigCPtr, this);
  }

  public long getFileSize() {
    return XugglerJNI.IContainer_getFileSize(swigCPtr, this);
  }

  public int getBitRate() {
    return XugglerJNI.IContainer_getBitRate(swigCPtr, this);
  }

  public int getNumProperties() {
    return XugglerJNI.IContainer_getNumProperties(swigCPtr, this);
  }

  public IProperty getPropertyMetaData(int propertyNo) {
    long cPtr = XugglerJNI.IContainer_getPropertyMetaData__SWIG_0(swigCPtr, this, propertyNo);
    return (cPtr == 0) ? null : new IProperty(cPtr, false);
  }

  public IProperty getPropertyMetaData(String name) {
    long cPtr = XugglerJNI.IContainer_getPropertyMetaData__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new IProperty(cPtr, false);
  }

  public int setProperty(String name, String value) {
    return XugglerJNI.IContainer_setProperty__SWIG_0(swigCPtr, this, name, value);
  }

  public int setProperty(String name, double value) {
    return XugglerJNI.IContainer_setProperty__SWIG_1(swigCPtr, this, name, value);
  }

  public int setProperty(String name, long value) {
    return XugglerJNI.IContainer_setProperty__SWIG_2(swigCPtr, this, name, value);
  }

  public int setProperty(String name, boolean value) {
    return XugglerJNI.IContainer_setProperty__SWIG_3(swigCPtr, this, name, value);
  }

  public int setProperty(String name, IRational value) {
    return XugglerJNI.IContainer_setProperty__SWIG_4(swigCPtr, this, name, IRational.getCPtr(value), value);
  }

  public String getPropertyAsString(String name) {
    return XugglerJNI.IContainer_getPropertyAsString(swigCPtr, this, name);
  }

  public double getPropertyAsDouble(String name) {
    return XugglerJNI.IContainer_getPropertyAsDouble(swigCPtr, this, name);
  }

  public long getPropertyAsLong(String name) {
    return XugglerJNI.IContainer_getPropertyAsLong(swigCPtr, this, name);
  }

  public IRational getPropertyAsRational(String name) {
    long cPtr = XugglerJNI.IContainer_getPropertyAsRational(swigCPtr, this, name);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

  public boolean getPropertyAsBoolean(String name) {
    return XugglerJNI.IContainer_getPropertyAsBoolean(swigCPtr, this, name);
  }

  public int getFlags() {
    return XugglerJNI.IContainer_getFlags(swigCPtr, this);
  }

  public void setFlags(int newFlags) {
    XugglerJNI.IContainer_setFlags(swigCPtr, this, newFlags);
  }

  public boolean getFlag(IContainer.Flags flag) {
    return XugglerJNI.IContainer_getFlag(swigCPtr, this, flag.swigValue());
  }

  public void setFlag(IContainer.Flags flag, boolean value) {
    XugglerJNI.IContainer_setFlag(swigCPtr, this, flag.swigValue(), value);
  }

  public String getURL() {
    return XugglerJNI.IContainer_getURL(swigCPtr, this);
  }

  public int flushPackets() {
    return XugglerJNI.IContainer_flushPackets(swigCPtr, this);
  }

  public int getReadRetryCount() {
    return XugglerJNI.IContainer_getReadRetryCount(swigCPtr, this);
  }

  public void setReadRetryCount(int count) {
    XugglerJNI.IContainer_setReadRetryCount(swigCPtr, this, count);
  }

  public boolean canStreamsBeAddedDynamically() {
    return XugglerJNI.IContainer_canStreamsBeAddedDynamically(swigCPtr, this);
  }

  public IMetaData getMetaData() {
    long cPtr = XugglerJNI.IContainer_getMetaData(swigCPtr, this);
    return (cPtr == 0) ? null : new IMetaData(cPtr, false);
  }

  public void setMetaData(IMetaData data) {
    XugglerJNI.IContainer_setMetaData(swigCPtr, this, IMetaData.getCPtr(data), data);
  }

  public int createSDPData(IBuffer buffer) {
    return XugglerJNI.IContainer_createSDPData(swigCPtr, this, IBuffer.getCPtr(buffer), buffer);
  }

  public int setForcedAudioCodec(ICodec.ID id) {
    return XugglerJNI.IContainer_setForcedAudioCodec(swigCPtr, this, id.swigValue());
  }

  public int setForcedVideoCodec(ICodec.ID id) {
    return XugglerJNI.IContainer_setForcedVideoCodec(swigCPtr, this, id.swigValue());
  }

  public int setForcedSubtitleCodec(ICodec.ID id) {
    return XugglerJNI.IContainer_setForcedSubtitleCodec(swigCPtr, this, id.swigValue());
  }

  public int seekKeyFrame(int streamIndex, long minTimeStamp, long targetTimeStamp, long maxTimeStamp, int flags) {
    return XugglerJNI.IContainer_seekKeyFrame__SWIG_1(swigCPtr, this, streamIndex, minTimeStamp, targetTimeStamp, maxTimeStamp, flags);
  }

  @Deprecated public int setPreload(int preload) {
    return XugglerJNI.IContainer_setPreload(swigCPtr, this, preload);
  }

  @Deprecated public int getPreload() {
    return XugglerJNI.IContainer_getPreload(swigCPtr, this);
  }

  public int setMaxDelay(int maxdelay) {
    return XugglerJNI.IContainer_setMaxDelay(swigCPtr, this, maxdelay);
  }

  public int getMaxDelay() {
    return XugglerJNI.IContainer_getMaxDelay(swigCPtr, this);
  }

  public IStream addNewStream(ICodec.ID id) {
    long cPtr = XugglerJNI.IContainer_addNewStream__SWIG_1(swigCPtr, this, id.swigValue());
    return (cPtr == 0) ? null : new IStream(cPtr, false);
  }

  public IStream addNewStream(ICodec codec) {
    long cPtr = XugglerJNI.IContainer_addNewStream__SWIG_2(swigCPtr, this, ICodec.getCPtr(codec), codec);
    return (cPtr == 0) ? null : new IStream(cPtr, false);
  }

  public IStream addNewStream(IStreamCoder coder) {
    long cPtr = XugglerJNI.IContainer_addNewStream__SWIG_3(swigCPtr, this, IStreamCoder.getCPtr(coder), coder);
    return (cPtr == 0) ? null : new IStream(cPtr, false);
  }

  public int setProperty(IMetaData valuesToSet, IMetaData valuesNotFound) {
    return XugglerJNI.IContainer_setProperty__SWIG_5(swigCPtr, this, IMetaData.getCPtr(valuesToSet), valuesToSet, IMetaData.getCPtr(valuesNotFound), valuesNotFound);
  }

  public IContainerFormat getFormat() {
    long cPtr = XugglerJNI.IContainer_getFormat(swigCPtr, this);
    return (cPtr == 0) ? null : new IContainerFormat(cPtr, false);
  }

  public int setFormat(IContainerFormat format) {
    return XugglerJNI.IContainer_setFormat(swigCPtr, this, IContainerFormat.getCPtr(format), format);
  }

  public static IContainer make(IContainerFormat format) {
    long cPtr = XugglerJNI.IContainer_make__SWIG_1(IContainerFormat.getCPtr(format), format);
    return (cPtr == 0) ? null : new IContainer(cPtr, false);
  }

  public int open(String url, IContainer.Type type, IContainerFormat containerFormat, boolean streamsCanBeAddedDynamically, boolean queryStreamMetaData, IMetaData options, IMetaData optionsNotSet) {
    return XugglerJNI.IContainer_open__SWIG_2(swigCPtr, this, url, type.swigValue(), IContainerFormat.getCPtr(containerFormat), containerFormat, streamsCanBeAddedDynamically, queryStreamMetaData, IMetaData.getCPtr(options), options, IMetaData.getCPtr(optionsNotSet), optionsNotSet);
  }

  public enum Type {
    READ,
    WRITE;

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

  public enum Flags {
    FLAG_GENPTS(XugglerJNI.IContainer_FLAG_GENPTS_get()),
    FLAG_IGNIDX(XugglerJNI.IContainer_FLAG_IGNIDX_get()),
    FLAG_NONBLOCK(XugglerJNI.IContainer_FLAG_NONBLOCK_get()),
    FLAG_IGNDTS(XugglerJNI.IContainer_FLAG_IGNDTS_get()),
    FLAG_NOFILLIN(XugglerJNI.IContainer_FLAG_NOFILLIN_get()),
    FLAG_NOPARSE(XugglerJNI.IContainer_FLAG_NOPARSE_get()),
    FLAG_NOBUFFER(XugglerJNI.IContainer_FLAG_NOBUFFER_get()),
    FLAG_CUSTOM_IO(XugglerJNI.IContainer_FLAG_CUSTOM_IO_get()),
    FLAG_DISCARD_CORRUPT(XugglerJNI.IContainer_FLAG_DISCARD_CORRUPT_get()),
    FLAG_FLUSH_PACKETS(XugglerJNI.IContainer_FLAG_FLUSH_PACKETS_get()),
    FLAG_BITEXACT(XugglerJNI.IContainer_FLAG_BITEXACT_get()),
    FLAG_MP4A_LATM(XugglerJNI.IContainer_FLAG_MP4A_LATM_get()),
    FLAG_SORT_DTS(XugglerJNI.IContainer_FLAG_SORT_DTS_get()),
    FLAG_PRIV_OPT(XugglerJNI.IContainer_FLAG_PRIV_OPT_get()),
    FLAG_KEEP_SIDE_DATA(XugglerJNI.IContainer_FLAG_KEEP_SIDE_DATA_get()),
    FLAG_FAST_SEEK(XugglerJNI.IContainer_FLAG_FAST_SEEK_get());

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

  public final static int SEEK_FLAG_BACKWARDS = XugglerJNI.IContainer_SEEK_FLAG_BACKWARDS_get();
  public final static int SEEK_FLAG_BYTE = XugglerJNI.IContainer_SEEK_FLAG_BYTE_get();
  public final static int SEEK_FLAG_ANY = XugglerJNI.IContainer_SEEK_FLAG_ANY_get();
  public final static int SEEK_FLAG_FRAME = XugglerJNI.IContainer_SEEK_FLAG_FRAME_get();
}
