package com.yskj.mater;

import com.yskj.mater.util.Base64Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterApplicationTests {

	@Test
	public void contextLoads() {
		String str="张三";
		/*加密*/
		System.out.println(str+"加密："+Base64Util.encode(str.getBytes()));
		/*解密*/
		String str2="5byg5LiJ";
		System.out.println(str2+"解密:"+Base64Util.decode( str2.getBytes()));

	}

}
