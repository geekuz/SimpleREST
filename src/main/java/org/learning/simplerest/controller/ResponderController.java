package org.learning.simplerest.controller;

import lombok.RequiredArgsConstructor;
import org.learning.simplerest.service.ResponderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@RequiredArgsConstructor
public class ResponderController {
    private ResponderService responderService;

    @GetMapping("/getName")
    public String getResponse(@RequestParam String name) {
        return "name: " + name;
    }


}
