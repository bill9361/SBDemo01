package com.bill.sbdemo01.controller.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: <br/>
 * Date:2018年8月1日 下午3:18:47 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@RequestMapping("/demo")
@RestController
public class DemoController
{
	//获取application.properties属性文件中的key-value值
	@Value(value="${bill.customer.name}")
	private String customer;
	@Value(value="${bill.customer.address}")
	private String customerAddress;
	
	@RequestMapping("/test1")
	public String test1()
	{
		System.out.println("DemoController....test1()");
		System.out.println("当前customer:"+customer);
		System.out.println("当前customer.address:"+customerAddress);
		return "Hello World1";
	}
}


