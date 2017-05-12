package com.sgyz.test;

import com.sgyz.utils.ChangeUrlUtils;
import com.sgyz.utils.HMACSHA1Utils;
import com.sgyz.utils.UrlUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;



public class TestSlb {
	/**
	 *SecretId : AKIDKaebNyScfWAcsvvRuBHCvRmvseEcxmZA
	 *SecretKey: kKiuvxqX1JRN7f1E4nRuhKqZ96wfHhw1
	 *
	 *
	 *maps:
	 *{GETlb.api.qcloud.com/v2/index.php?Action=InquiryLBPrice&Nonce=11886&Region=gz&SecretId=AKIDKaebNyScfWAcsvvRuBHCvRmvseEcxmZA&Timestamp=1465185768&loadBalancerType=2}

	 * @throws Exception
	 */
 @Test
 public void test() throws Exception{
	 TreeMap<String,String> maps=new TreeMap<String, String>();
	 
	 maps.put("Action","InquiryLBPrice");
	 maps.put("Nonce", "11896");
	 maps.put("Region", "gz");
	 maps.put("SecretId","AKIDKaebNyScfWAcsvvRuBHCvRmvseEcxmZA");
	 maps.put("Timestamp", "1494510683862");
	 maps.put("loadBalancerType", "2");


	 
	 System.out.println( ChangeUrlUtils.getChangeUrl(maps.toString()));
 }
 /**
  * PSWUwVv4TfW2sQP1FT9KbbLjIZ9bmK8f1cL6fbpf3KI%3D
  * PSWUwVv4TfW2sQP1FT9KbbLjIZ9bmK8f1cL6fbpf3KI%3D
  * @throws Exception
  */
//@Test
 public void test2()throws Exception{
	String param="GETlb.api.qcloud.com/v2/index.php?Action=InquiryLBPrice&Nonce=25055&Region=gz&SecretId=AKIDKaebNyScfWAcsvvRuBHCvRmvseEcxmZA&Timestamp=1494511852&loadBalancerType=2";
	String SecretKey="kKiuvxqX1JRN7f1E4nRuhKqZ96wfHhw1";
	String hash= HMACSHA1Utils.getHMACSHA1(param, SecretKey);
	String url= UrlUtils.getUrl(hash);
	System.out.println(url);
	
	
 }

}
