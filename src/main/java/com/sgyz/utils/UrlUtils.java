package com.sgyz.utils;

import java.net.URLEncoder;

public class UrlUtils {
	 public static String getUrl(String param) throws Exception{
		 
		 
			return URLEncoder.encode(param,"UTF-8"); 
		 }
}
