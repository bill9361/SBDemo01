package com.bill.sbdemo01;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.bill.sbdemo01.controller.admin.DemoController;
/**
 * 
 * Description: SpringBoot单元测试,SpringBoot打包的时候会自动测试所有单元测试是否通过<br/>
 * Date:2018年8月1日 下午3:31:17 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootApplication(scanBasePackages={"com.bill.sbdemo01.controller.*","com.bill.sbdemo01.application"})
public class SbDemo01ApplicationTests {
	
	private MockMvc mockMvc;
	
	@Before
	public void before()
	{
		mockMvc = MockMvcBuilders.standaloneSetup(new DemoController()).build();
	}

	@Test
	public void contextLoads() throws Exception {
		//System.out.println("执行单元测试");
		//执行一个请求
		mockMvc.perform(get("/demo/test1"))
		//添加执行之后的断言
		.andExpect(status().isOk())
		.andExpect(content().string("Hello World1"));
	}

}
