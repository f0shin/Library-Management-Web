package com.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/favicon.ico")
public class FaviconController {

    @GetMapping
    public void handleFaviconRequest(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8"); // 응답 인코딩 설정
        response.setContentType("text/html;charset=UTF-8"); // 응답 타입 설정
        System.out.println("✅ FaviconController - /favicon.ico - GET 요청 정상 처리!");
        
        // 아무 작업 없이 빈 응답을 반환 -> Spring 경고 방지
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }
}
