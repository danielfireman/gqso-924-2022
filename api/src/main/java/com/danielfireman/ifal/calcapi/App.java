package com.danielfireman.ifal.calcapi;

import java.nio.file.Paths;

import io.jooby.Jooby;

public class App extends Jooby {

  {
    get("/", ctx -> "Java é massa!");
    mvc(new Raiz());
    //assets("/assets/*", Paths.get("assets"));
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
