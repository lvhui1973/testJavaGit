/**
 * StringUnitTest.java,created on 2015Äê8ÔÂ8ÈÕ
 * Copyright lh,All right reserved.
 * @author by lh
 *
 */
package com.lh.test;

import junit.framework.TestCase;

public class StringUnitTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testSplit()
	{
		System.out.println("In Testsplit");
		String r[]=StringUtil.split("a,bb,cc,dd");
		assertEquals(4,r.length);
		assertEquals("a",r[0]);
		assertEquals("bb",r[1]);
		assertEquals("cc",r[2]);
		assertEquals("dd",r[3]);
		r=StringUtil.split("");
		assertEquals(0,r.length);
		r=StringUtil.split(" ");
		assertEquals(1,r.length);
		r=StringUtil.split(",");
		assertEquals(0,r.length);
		r=StringUtil.split("d");
		assertEquals(1,r.length);
		assertEquals("d",r[0]);
		
	}
	public void testSplitException()
	{
		
		System.out.println("In testSplitException");
		try
		{
			String s[]=StringUtil.split(null);
			System.out.println(s.length);
			
		}
		catch(Exception e)
		{
			assertTrue(true);
		}
	}

}
