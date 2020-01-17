package com.zeroten.common.util;

/**
 * @author Zr
 * @create 2020-01-17 12:06
 */
public class CheckUtils {

    //判断参数如果字符串为空则返回false,否则返回true
    public static boolean isAnyEmpty(String... strings){
        for(int i = 0; i < strings.length; i++){
            if(strings[i] == null || "".equals(strings[i])){
                return false;
            }
        }

        return true;
    }


    //判断引用类型数组是否为空，为空或null返回true，否则返回false
    public static boolean isEmpty(Object[] arr){
        if(arr == null || arr.length == 0){
            return true;
        }
        return false;
    }

    //判断str1字符串与str2是否相等，相等返回true，否则返回false。
    //当其中一个是null时返回false
    public static boolean equals(String str1, String str2){
        if(str1 == null || str2 == null){
            return false;
        } else {
            if(str1 == str2){
                return true;
            }

            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();

            int n1 = str1.length();
            int n2 = str2.length();
            if(n1 == n2){
                while (n1-- != 0){
                    if(char1[n1] != char2[n1]){
                        return false;
                    }
                    n1++;
                }

                return true;
            }

        }
        return false;
    }

    //判断n1与n2是否相等，相等则返回true，否则返回false。当其中一个为null时返回false
    public static boolean equals(Integer n1, Integer n2){
        if(n1 == null || n2 == null){
            return false;
        }else {
            if(n1.equals(n2)){
                return true;
            }
        }
        return false;
    }


}