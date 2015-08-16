/**
 * StringUtil.java,created on 2015Äê8ÔÂ8ÈÕ
 * Copyright lh,All right reserved.
 * @author by lh
 *
 */
package com.lh.test;

import java.util.StringTokenizer;

public class StringUtil {
	public static String[] split(String mainarg)
	{
		if (null==mainarg)
			throw new IllegalArgumentException("Wrong args");
		StringTokenizer  s = new StringTokenizer(mainarg,",");
		int count = s.countTokens();
		String [] rets=new String [count];
		for (int i = 0; i < rets.length; i++) {
			rets[i]=s.nextToken();
		}
		return rets;
	}

}
