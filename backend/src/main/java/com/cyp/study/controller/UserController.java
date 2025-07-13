package com.cyp.study.controller;

import com.cyp.study.dto.requestDTO;
import com.cyp.study.dto.responseDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:3000") // Vue 개발 서버 주소
@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/send")
    public responseDTO receiveUserData(@RequestBody requestDTO user) {

        // 콘솔 출력 (서버 확인용)
        System.out.println("이름: " + user.getName());
        System.out.println("전화번호: " + user.getPhone());
        System.out.println("생일: " + user.getBirth());

        // 받은 데이터로 나이 계산하여 전달
        String birth = user.getBirth(); // 예: "1997-02-10"

        // 날짜 파싱
        LocalDate birthDate = LocalDate.parse(birth, DateTimeFormatter.ISO_DATE);
        LocalDate today = LocalDate.now();

        int birthYear = birthDate.getYear();
        int currentYear = today.getYear();

        // 한국식 나이 계산
        int koreanAge = currentYear - birthYear + 1;

        // 만나이 계산
        int internationalAge = currentYear - birthYear;
        if (today.isBefore(birthDate.withYear(currentYear))) {
            internationalAge -= 1;
        }

        return new responseDTO(user.getName(), user.getPhone(), koreanAge, internationalAge);
    }
}
