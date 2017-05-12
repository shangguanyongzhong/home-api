package com.sgyz.test;

import com.sgyz.base.BaseUrl;
import com.sgyz.utils.ChangeUrlUtils;
import com.sgyz.utils.HMACSHA1Utils;
import com.sgyz.utils.UrlUtils;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;



public class TestSlb {
	String slb = null;
	/**
	 *SecretId : AKIDKaebNyScfWAcsvvRuBHCvRmvseEcxmZA
	 *SecretKey: kKiuvxqX1JRN7f1E4nRuhKqZ96wfHhw1
	 *
	 *
	 *maps:
	 *{GETlb.api.qcloud.com/v2/index.php?Action=InquiryLBPrice&Nonce=11886&Region=gz&SecretId=AKIDKaebNyScfWAcsvvRuBHCvRmvseEcxmZA&Timestamp=1465185768&loadBalancerType=2}

	 * @throws Exception
	 */
 @Before
 public void test() throws Exception{
	 TreeMap<String,String> maps=new TreeMap<String, String>();
	 Timestamp d = new Timestamp(System.currentTimeMillis());

	 maps.put("Action","InquiryLBPrice");
	 maps.put("Nonce", String.valueOf(new Random().nextInt(1000000)));
	 maps.put("Region", "gz");
	 maps.put("SecretId","AKIDKaebNyScfWAcsvvRuBHCvRmvseEcxmZA");
	 maps.put("Timestamp", String.valueOf(d.getTime()/1000));
	 maps.put("loadBalancerType", "2");


	 
	slb = ChangeUrlUtils.getChangeUrl(maps.toString());
	 //System.out.println(slb);
 }
 /**
  * PSWUwVv4TfW2sQP1FT9KbbLjIZ9bmK8f1cL6fbpf3KI%3D
  * PSWUwVv4TfW2sQP1FT9KbbLjIZ9bmK8f1cL6fbpf3KI%3D
  * @throws Exception
  */
	@Test
 public void test2()throws Exception{
	//String param="GETlb.api.qcloud.com/v2/index.php?Action=InquiryLBPrice&Nonce=25055&Region=gz&SecretId=AKIDKaebNyScfWAcsvvRuBHCvRmvseEcxmZA&Timestamp=1494511852&loadBalancerType=2";

		String param= BaseUrl.SLBURL+slb;

	String SecretKey="kKiuvxqX1JRN7f1E4nRuhKqZ96wfHhw1";
	String hash= HMACSHA1Utils.getHMACSHA1(param, SecretKey);
	String url= UrlUtils.getUrl(hash);

	System.out.println(BaseUrl.BASESLBURL+slb+"&Signature="+url);
	
	
 }

}
