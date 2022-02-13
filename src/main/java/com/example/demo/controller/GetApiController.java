package com.example.demo.controller;

import com.example.demo.dto.GetUserRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // http://localhost:9090/api/get/hello
    public String Hello() {
        return "Hello";
    }

    // 옛날 방식
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get http://localhost:9090/api/get/hi
    public String Hi() {
        return "hi";
    }

    @GetMapping("/path-variable/{name}") // http://localhost:9090/api/get/path-variable/{name}
    // {} 안에 있는 이름과  @PathVariable 에 변수과 같아야 한다.
    // 만약 변수명을 다른걸로 써야 한다면 @PathVariable(name = "name") 을 써준다.
    public String pathVariable(@PathVariable String name) {
        System.out.println("PathVariable : " + name);
        return name;
    }

    // 쿼리 파라미터 주소값에 (?) 뒤에 부터 쿼리 파라미터라고 한다.
    // ? key = value 로 되어 있다.
    // 다음 key = value 는  & (and) 로 붙여서 사용 할수 있다.

    // 쿼리 파라미터 받는 방법 1.
    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    // 쿼리 파라미터 받는 방법 2.
    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    // 쿼리 파라미터 받는 방법 3.
    // 제일 많이 쓰는 방법이다.
    @GetMapping("query-param03")
    public String queryParam03(GetUserRequestDto getUserRequestDto) {
        System.out.println(getUserRequestDto.getName());
        System.out.println(getUserRequestDto.getEmail());
        System.out.println(getUserRequestDto.getAge());

        return getUserRequestDto.toString();
    }
}
