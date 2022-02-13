package com.example.demo.controller;

import com.example.demo.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto) {
        System.out.println(putRequestDto);
        return putRequestDto;
    }

    @PutMapping("/put/{userId}")
    public PutRequestDto put01(@RequestBody PutRequestDto putRequestDto, @PathVariable Long userId) {
        System.out.println(putRequestDto);
        System.out.println(userId);
        return putRequestDto;
    }
}
