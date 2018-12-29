package com.jerryl;

import com.jerryl.common.Emp;
import com.jerryl.common.HelloworldBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWithActivitiApplicationTests {

	@Autowired
	HelloworldBean helloworldBean ;
	@Test
	public void contextLoads() {
		Emp emp = new Emp();
		emp.setName("1");
		helloworldBean.a(emp);
	}

}
