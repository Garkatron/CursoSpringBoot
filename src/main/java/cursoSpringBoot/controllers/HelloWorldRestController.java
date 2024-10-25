package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World";
    }

    // https://www.youtube.com/watch?v=319Vm8BHCJk
}
