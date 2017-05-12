package com.sgyz.utils;

import java.util.TreeMap;

/**
 * Created by P0093203 on 2017/5/12.
 */
public class ChangeUrlUtils {
    public static String getChangeUrl(String param){

      param=  param.replaceAll(", ","&");
      param=param.substring(param.indexOf("{")+1,param.indexOf("}"));

        return param;

    }
}