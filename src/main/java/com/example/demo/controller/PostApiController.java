package com.example.demo.controller;

import com.example.demo.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    // post 일떄는 파라마티() 안에 @RequestBody 를 붙여준다.
    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData) {
        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
    }

    // 객체를 이용하여 포스트맵핑.
    @PostMapping("/post01")
    public void post(@RequestBody PostRequestDto requestData) {
        System.out.println(requestData);
    }
}
