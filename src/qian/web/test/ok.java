/**
 * 
 */
/**
 * @author Administrator
 * @date 2019年8月1日
 * @version
 */

package qian.web.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ok{
	@Test
	@Before
	public void say() {

		System.out.println("Ok");
	}

	String string = "ok";

	@Test
	public void testEquals() {
		assertNotSame("oko", string);//類似于引用的 !=  ==
		assertEquals("ok","h");//判斷內容是否相等
		assertNull(string);//查看对象是否为空
		//assertTrue(String message, boolean condition) 
		//assertArrayEquals(String message, XXX[] expecteds,XXX [] actuals) 要求expected.equalsArray(actual)，即查看两个数组是否相等。
        //assertThat(String reason, T actual, Matcher matcher) ：要求matcher.matches(actual) == true，使用Matcher做自定义的校验。
		
	}

	@After
	public void ok() {

		System.out.println("h");
	}

}

