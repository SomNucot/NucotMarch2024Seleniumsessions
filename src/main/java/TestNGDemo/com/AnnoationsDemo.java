package TestNGDemo.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnoationsDemo {
	
	
	
	/*
	 * 
	 *Order of invocation in Testng
	 * 	@BeforeSuite-->1
	 * 	@BeforeTest-->2
	 * 	@BeforeClass--->3
	 * 	@BeforeMethod--->4-->7
	 * 		@Test---->5
	 * @Test---->8
	 * 	@AfterMethod--->6--->9
	 * 	@AfterClass---->10
	 * 	@AfterTest---->11
		@AfterSuite --->12
	 * 
	 */
	
	
	
	@BeforeSuite
	void test1()
	{
		System.out.println("Test1");
	}
	
	@BeforeTest
	void test2()
	{
		System.out.println("Test2");
	}
	
	@BeforeClass
	void test3()
	{
		System.out.println("Test3");
	}
	
	@BeforeMethod
	void test4()
	{
		System.out.println("Test4");
	}
	
	@Test
	void zzz()
	{
		System.out.println("zzz");
	}
	
	@Test
	void ggg()
	{
		System.out.println("ggg");
	}
	@Test
	void aaa()
	{
		System.out.println("aaa");
	}
	
	@AfterMethod
	void test6()
	{
		System.out.println("Test6");
		
	}
	
	@AfterClass
	void test7()
	{
		System.out.println("Test7");
	}
	
	@AfterTest
	void test8()
	{
		System.out.println("Test8");
	}
	
	@AfterSuite
	void test9()
	{
		System.out.println("test9");
	}
	
	
	
	
	
	
	

}
