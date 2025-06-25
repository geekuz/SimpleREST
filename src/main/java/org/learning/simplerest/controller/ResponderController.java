package org.learning.simplerest.controller;

import lombok.RequiredArgsConstructor;
import org.learning.simplerest.service.ResponderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResponderController {

    @GetMapping("/getName")
    public String getResponse(@RequestParam String name) {
        return "name: " + name;
    }


}
