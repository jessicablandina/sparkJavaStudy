package com.movie.api;

import static spark.Spark.*;

public class App {

    public static void main (String[] args){
        get("/hello", (req, res) -> "Hellow World!");
    }
}
