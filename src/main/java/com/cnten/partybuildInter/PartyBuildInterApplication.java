package com.cnten.partybuildInter;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan(basePackages = "com.cnten.**.*.dao")
public class PartyBuildInterApplication {
	public static void main(String[] args) {
		SpringApplication.run(PartyBuildInterApplication.class, args);
	}

}

