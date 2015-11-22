/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_log_alert extends alert {
  private transient long swigCPtr;

  protected dht_log_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.dht_log_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_log_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_log_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.dht_log_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.dht_log_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.dht_log_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.dht_log_alert_message(swigCPtr, this);
  }

  public String log_message() {
    return libtorrent_jni.dht_log_alert_log_message(swigCPtr, this);
  }

  public void setModule(dht_log_alert.dht_module_t value) {
    libtorrent_jni.dht_log_alert_module_set(swigCPtr, this, value.swigValue());
  }

  public dht_log_alert.dht_module_t getModule() {
    return dht_log_alert.dht_module_t.swigToEnum(libtorrent_jni.dht_log_alert_module_get(swigCPtr, this));
  }

  public enum dht_module_t {
    tracker,
    node,
    routing_table,
    rpc_manager,
    traversal;

    public final int swigValue() {
      return swigValue;
    }

    public static dht_module_t swigToEnum(int swigValue) {
      dht_module_t[] swigValues = dht_module_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (dht_module_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + dht_module_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private dht_module_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private dht_module_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private dht_module_t(dht_module_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public final static int static_category = libtorrent_jni.dht_log_alert_static_category_get();
  public final static int priority = libtorrent_jni.dht_log_alert_priority_get();
  public final static int alert_type = libtorrent_jni.dht_log_alert_alert_type_get();
}