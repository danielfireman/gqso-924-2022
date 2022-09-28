package com.danielfireman.ifal.calcapi;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import io.jooby.annotations.PathParam;
import io.jooby.exception.BadRequestException;

@Path("/raiz/{op}")
public class Raiz {

    @GET
    public double calculaRaiz(@PathParam("op") String op) {
        try {
            return Double.parseDouble(op);
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Parâmetro inválido: " + op);
        }
    }
}