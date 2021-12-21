package com.eduardoshibukawatw.scalingoctosystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SaciController {

    @GetMapping
    public String getSaci() {
        return "Saci";
    }
}
