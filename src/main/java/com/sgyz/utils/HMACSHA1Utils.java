package com.sgyz.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class HMACSHA1Utils {
	public static String getHMACSHA1(String param,String my) throws Exception{
		  Mac mac = Mac.getInstance("HmacSHA1");
		     SecretKeySpec secret_key = new SecretKeySpec(my.getBytes(), "HmacSHA1");
		     mac.init(secret_key);

		     String hash = Base64.encodeBase64String(mac.doFinal(param.getBytes()));
		    
		return hash;
	}

}
