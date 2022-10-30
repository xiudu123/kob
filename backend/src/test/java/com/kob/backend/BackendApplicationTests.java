package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123"));
        System.out.println(passwordEncoder.encode("pc"));
        System.out.println(passwordEncoder.encode("pb"));
        System.out.println(passwordEncoder.encode("pd"));
//        System.out.println(passwordEncoder.encode("xiudu"));
//        System.out.println(passwordEncoder.matches("xiudu123", "$2a$10$/cJdeeBgNdsUVKGsYOaQW.p6kVyVv8u7aFUX8NvUlYXcCFwwb0AD2"));
    }

}
