package com.danielfireman.ifal.calcapi;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    get("/", ctx -> "Chupa Javascript!");
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
