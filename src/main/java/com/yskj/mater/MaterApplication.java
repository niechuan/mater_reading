package com.yskj.mater;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = "com.yskj.mater.*.*.dao")
public class MaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaterApplication.class, args);
	}

}
