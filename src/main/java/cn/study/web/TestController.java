package cn.study.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import cn.study.service.impl.TestServiceImpl;

@Controller
public class TestController {
	
	@Autowired
	TestServiceImpl testService;
	
	@Scheduled(fixedRate = 500000)
	public void test01() {
		for (int i = 0; i < 10; i++) {
			System.out.println(testService.list());
		}
	}
}
