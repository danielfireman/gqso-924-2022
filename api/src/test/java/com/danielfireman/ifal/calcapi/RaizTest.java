package com.danielfireman.ifal.calcapi;

import io.jooby.MockRouter;
import io.jooby.StatusCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaizTest {
  @Test
  public void raiz() {
    MockRouter router = new MockRouter(new App());
    router.get("/raiz/16", rsp -> {
      assertEquals(4.0, rsp.value());
      assertEquals(StatusCode.OK, rsp.getStatusCode());
    });
  }
}