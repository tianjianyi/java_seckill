package com.yifeng.java_seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yifeng.java_seckill.mapper")
public class JavaSeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSeckillApplication.class, args);
    }

}
