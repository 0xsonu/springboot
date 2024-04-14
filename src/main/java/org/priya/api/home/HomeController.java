package org.priya.api.home;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @GetMapping("/")
    public String sayHi() {
        return "Hello Priya!";
    }

    @PostMapping("/")
    @DeleteMapping
    public String greetHi(@RequestParam String name) {
        return "Hello " + name +  "!";
    }
}
