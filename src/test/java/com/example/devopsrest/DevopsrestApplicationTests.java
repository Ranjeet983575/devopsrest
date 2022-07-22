package com.example.devopsrest;

import com.example.devopsrest.controller.Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DevopsrestApplicationTests {

	@Autowired
	private Controller controller;

	@Test
	void hello() {
		Assert.notNull(controller.hello());
	}
	@Test
	void hi() {
		Assert.isNull(controller.hi());
	}


}
