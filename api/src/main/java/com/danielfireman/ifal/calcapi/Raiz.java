package com.danielfireman.ifal.calcapi;

import io.jooby.annotations.*;

@Path("/raiz/{op}") 
public class Raiz {

    @GET
    public double calculaRaiz(@PathParam("op") float op) {
        return Math.sqrt(op);
    }
}