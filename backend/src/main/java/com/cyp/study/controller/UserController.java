package com.cyp.study.controller;

import com.cyp.study.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000") // Vue 개발 서버 주소
@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/send")
    public UserDTO receiveUserData(@RequestBody UserDTO user) {

        // 콘솔 출력 (서버 확인용)
        System.out.println("이름: " + user.getName());
        System.out.println("전화번호: " + user.getPhone());
        System.out.println("생일: " + user.getBirth());

        // 받은 데이터를 그대로 다시 응답
        return user;
    }
}
