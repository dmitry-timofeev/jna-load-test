package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SodiumTest {

  @Test
  void testInit() {
    // https://libsodium.gitbook.io/doc/usage
    assertEquals(0, Sodium.sodium_init());
  }
}