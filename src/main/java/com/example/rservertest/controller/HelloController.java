package com.example.rservertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.rosuda.REngine.Rserve.RConnection;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    public static void main(String[] args) throws Exception {
        RConnection conn = new RConnection();
        // 경로 지정을 R 서버 기준으로 작성해주어야함.
        conn.eval("source('/Users/gimdaehyeon/wiseinc/R_server_test/myAdd.R')");

        int num1 = 10;
        int num2 = 20;

        int sum = conn.eval("myAdd(" + num1 + "," + num2 + ")").asInteger();
        System.out.println("합계 : " + sum);

    }
}