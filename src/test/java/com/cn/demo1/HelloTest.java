package com.cn.demo1;

import org.junit.Test;

public class HelloTest {
	@Test
	public void demo1() {
		Hello hello=new Hello();
		String m = hello.Hello("zhansan");
		System.out.println(m);
	}
}
