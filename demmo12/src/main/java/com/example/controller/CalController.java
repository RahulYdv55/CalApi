package com.example.controller;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/cal")
public class CalController {
	
	@Get("/add/{x}/{y}")
    public int addition(@PathVariable int x,@PathVariable int y) {
        return x+y;
    }
	@Get("/subtract/{x}/{y}")
    public int subtraction(@PathVariable int x,@PathVariable int y) {
        return x-y;
    }
	@Get("/multiply/{x}/{y}")
    public int multiplication(@PathVariable int x,@PathVariable int y) {
        return x*y;
    }
	@Get("/divide/{x}/{y}")
    public int division(@PathVariable int x,@PathVariable int y) {
        return x/y;
    }

	

}
