package com.tuto.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Tell Spring it's a Controller that handles REST requests
@RestController
public class HelloWorldController {
    
    //GET method
    //URI - /hello-world
    //method - "Hello World"

    // Create a mapping for a GET method to this URI
    // @RequestMapping(method=RequestMethod.GET, path = "/hello-world") - enhance with @GetMapping
    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //Now create an object as HelloWorld Bean and return it
    //hello-world-bean
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean ("Hello World Bean");
    }

    //Now create an object as HelloWorld Bean and return it, but with pathparameter
    //hello-world/path-variable/tuto
    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
        return new HelloWorldBean (String.format("Hello World Bean, %s", name));
    }
}
