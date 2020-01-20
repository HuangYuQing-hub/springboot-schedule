package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *   spring boot 实现 定时任务
 *      依赖 starter 即可
 *         启动类 加上 @EnableScheduling 注解
 */
@SpringBootApplication
@EnableScheduling
public class SpringbootScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootScheduleApplication.class, args);
	}

}
