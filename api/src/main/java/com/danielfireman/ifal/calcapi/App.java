package com.danielfireman.ifal.calcapi;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    get("/", ctx -> "Chupa Javascript!");

    get("/raiz/{op}", ctx -> {
      float op = ctx.path("op").floatValue();
      return Math.sqrt(op);
    });
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
