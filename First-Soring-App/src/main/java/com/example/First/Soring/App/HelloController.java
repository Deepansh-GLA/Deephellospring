package com.example.First.Soring.App;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Use Case 1: Basic GET Request
    // API:- http://localhost:8080/hello
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // Use Case 2: GET Request with Query Parameter
    //API:- http://localhost:8080/hello/query?name=Deepansh
    @GetMapping("/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    // Use Case 3: GET Request with Path Variable
    //API:- http://localhost:8080/hello/param/Deepansh
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }


}