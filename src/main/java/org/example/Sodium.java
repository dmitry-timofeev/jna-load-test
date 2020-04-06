package org.example;

import com.sun.jna.Native;

public class Sodium {

  static {
    Native.register(Sodium.class, "sodium");
  }

  public static void main(String[] args) {
    System.out.println("Sodium init: " + sodium_init());
  }

  static native int sodium_init();
}
