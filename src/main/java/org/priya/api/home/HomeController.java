package org.priya.api.home;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @GetMapping("/")
    public String sayHi() {
        return "Hello Priya!";
    }

    @PostMapping("/")
    public String greetHi(@RequestParam String name) {
        return "Hello " + name +  "!";
    }
}
