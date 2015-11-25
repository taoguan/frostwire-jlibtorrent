/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class torrent_plugin {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected torrent_plugin(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(torrent_plugin obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_torrent_plugin(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void on_piece_pass(int arg0) {
    libtorrent_jni.torrent_plugin_on_piece_pass(swigCPtr, this, arg0);
  }

  public void on_piece_failed(int arg0) {
    libtorrent_jni.torrent_plugin_on_piece_failed(swigCPtr, this, arg0);
  }

  public void tick() {
    libtorrent_jni.torrent_plugin_tick(swigCPtr, this);
  }

  public boolean on_pause() {
    return libtorrent_jni.torrent_plugin_on_pause(swigCPtr, this);
  }

  public boolean on_resume() {
    return libtorrent_jni.torrent_plugin_on_resume(swigCPtr, this);
  }

  public void on_files_checked() {
    libtorrent_jni.torrent_plugin_on_files_checked(swigCPtr, this);
  }

  public void on_state(int arg0) {
    libtorrent_jni.torrent_plugin_on_state(swigCPtr, this, arg0);
  }

  public void on_unload() {
    libtorrent_jni.torrent_plugin_on_unload(swigCPtr, this);
  }

  public void on_load() {
    libtorrent_jni.torrent_plugin_on_load(swigCPtr, this);
  }

  public void on_add_peer(tcp_endpoint arg0, int arg1, int arg2) {
    libtorrent_jni.torrent_plugin_on_add_peer(swigCPtr, this, tcp_endpoint.getCPtr(arg0), arg0, arg1, arg2);
  }

  public torrent_plugin() {
    this(libtorrent_jni.new_torrent_plugin(), true);
  }

  public enum flags_t {
    first_time(libtorrent_jni.torrent_plugin_first_time_get()),
    filtered(libtorrent_jni.torrent_plugin_filtered_get());

    public final int swigValue() {
      return swigValue;
    }

    public static flags_t swigToEnum(int swigValue) {
      flags_t[] swigValues = flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private flags_t(flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
