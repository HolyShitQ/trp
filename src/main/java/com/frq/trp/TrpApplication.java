package com.frq.trp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.frq.trp.mapper")
public class TrpApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrpApplication.class, args);
    }

}
