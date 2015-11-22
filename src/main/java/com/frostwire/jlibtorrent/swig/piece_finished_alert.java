/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class piece_finished_alert extends torrent_alert {
  private transient long swigCPtr;

  protected piece_finished_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.piece_finished_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(piece_finished_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_piece_finished_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public piece_finished_alert(stack_allocator alloc, torrent_handle h, int piece_num) {
    this(libtorrent_jni.new_piece_finished_alert(stack_allocator.getCPtr(alloc), alloc, torrent_handle.getCPtr(h), h, piece_num), true);
  }

  public int type() {
    return libtorrent_jni.piece_finished_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.piece_finished_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.piece_finished_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.piece_finished_alert_message(swigCPtr, this);
  }

  public void setPiece_index(int value) {
    libtorrent_jni.piece_finished_alert_piece_index_set(swigCPtr, this, value);
  }

  public int getPiece_index() {
    return libtorrent_jni.piece_finished_alert_piece_index_get(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.piece_finished_alert_priority_get();
  public final static int alert_type = libtorrent_jni.piece_finished_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.piece_finished_alert_static_category_get();
}