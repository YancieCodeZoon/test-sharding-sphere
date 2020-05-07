package cn.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan({"cn.study.dao"})
public class TestShardingSphereApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestShardingSphereApplication.class, args);
	}

}
