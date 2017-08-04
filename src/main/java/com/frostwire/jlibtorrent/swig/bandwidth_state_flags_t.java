/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class bandwidth_state_flags_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected bandwidth_state_flags_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bandwidth_state_flags_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_bandwidth_state_flags_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public bandwidth_state_flags_t all() {
    return new bandwidth_state_flags_t(libtorrent_jni.bandwidth_state_flags_t_all(swigCPtr, this), true);
  }

  public boolean op_bool() {
    return libtorrent_jni.bandwidth_state_flags_t_op_bool(swigCPtr, this);
  }

  public boolean op_eq(bandwidth_state_flags_t f) {
    return libtorrent_jni.bandwidth_state_flags_t_op_eq(swigCPtr, this, bandwidth_state_flags_t.getCPtr(f), f);
  }

  public boolean op_ne(bandwidth_state_flags_t f) {
    return libtorrent_jni.bandwidth_state_flags_t_op_ne(swigCPtr, this, bandwidth_state_flags_t.getCPtr(f), f);
  }

  public static bandwidth_state_flags_t op_or(bandwidth_state_flags_t lhs, bandwidth_state_flags_t rhs) {
    return new bandwidth_state_flags_t(libtorrent_jni.bandwidth_state_flags_t_op_or(bandwidth_state_flags_t.getCPtr(lhs), lhs, bandwidth_state_flags_t.getCPtr(rhs), rhs), true);
  }

  public static bandwidth_state_flags_t op_and(bandwidth_state_flags_t lhs, bandwidth_state_flags_t rhs) {
    return new bandwidth_state_flags_t(libtorrent_jni.bandwidth_state_flags_t_op_and(bandwidth_state_flags_t.getCPtr(lhs), lhs, bandwidth_state_flags_t.getCPtr(rhs), rhs), true);
  }

  public static bandwidth_state_flags_t op_xor(bandwidth_state_flags_t lhs, bandwidth_state_flags_t rhs) {
    return new bandwidth_state_flags_t(libtorrent_jni.bandwidth_state_flags_t_op_xor(bandwidth_state_flags_t.getCPtr(lhs), lhs, bandwidth_state_flags_t.getCPtr(rhs), rhs), true);
  }

  public bandwidth_state_flags_t op_inv() {
    return new bandwidth_state_flags_t(libtorrent_jni.bandwidth_state_flags_t_op_inv(swigCPtr, this), true);
  }

  public int to_int() {
    return libtorrent_jni.bandwidth_state_flags_t_to_int(swigCPtr, this);
  }

  public bandwidth_state_flags_t() {
    this(libtorrent_jni.new_bandwidth_state_flags_t(), true);
  }

}