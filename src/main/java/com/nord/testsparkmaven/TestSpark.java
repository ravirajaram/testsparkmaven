package com.nord.testsparkmaven;

import static spark.Spark.*;

public class TestSpark {
    public static void main(String[] args) {
        port(4590);
        get("/hello", (req, res) -> "Hello World");
    }
}