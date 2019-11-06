/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
public class ITimeValue extends RefCounted {
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
  protected ITimeValue(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.ITimeValue_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected ITimeValue(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.ITimeValue_SWIGUpcast(cPtr),
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
  public static long getCPtr(ITimeValue obj) {
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
   * Create a new ITimeValue object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public ITimeValue copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new ITimeValue(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof ITimeValue)
      equal = (((ITimeValue)obj).swigCPtr == this.swigCPtr);
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
  
  public static ITimeValue make(long value, ITimeValue.Unit unit) {
    long cPtr = XugglerJNI.ITimeValue_make__SWIG_0(value, unit.swigValue());
    return (cPtr == 0) ? null : new ITimeValue(cPtr, false);
  }

  public static ITimeValue make(ITimeValue src) {
    long cPtr = XugglerJNI.ITimeValue_make__SWIG_1(ITimeValue.getCPtr(src), src);
    return (cPtr == 0) ? null : new ITimeValue(cPtr, false);
  }

  public long get(ITimeValue.Unit unit) {
    return XugglerJNI.ITimeValue_get(swigCPtr, this, unit.swigValue());
  }

  public int compareTo(ITimeValue other) {
    return XugglerJNI.ITimeValue_compareTo(swigCPtr, this, ITimeValue.getCPtr(other), other);
  }

  public static int compare(ITimeValue a, ITimeValue b) {
    return XugglerJNI.ITimeValue_compare__SWIG_0(ITimeValue.getCPtr(a), a, ITimeValue.getCPtr(b), b);
  }

  public static int compare(long a, long b) {
    return XugglerJNI.ITimeValue_compare__SWIG_1(a, b);
  }

  public enum Unit {
    DAYS,
    HOURS,
    MINUTES,
    SECONDS,
    MILLISECONDS,
    MICROSECONDS,
    NANOSECONDS;

    public final int swigValue() {
      return swigValue;
    }

    public static Unit swigToEnum(int swigValue) {
      Unit[] swigValues = Unit.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Unit swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Unit.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Unit() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Unit(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Unit(Unit swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
