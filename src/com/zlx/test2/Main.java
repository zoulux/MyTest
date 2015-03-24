package com.zlx.test2;
import java.util.*;
public class Main{
 public static void main(String[] args) {
        System.out.println(Arrays.toString(permutation("1234")));
    }
     
    private static String[] permutation(String orginal){
        ArrayList<String> list = new ArrayList<String>();
        if(orginal.length() == 1){
            return new String[]{orginal};
        } else{
           for (int i = 0; i < orginal.length(); i++) {
             String s = orginal.charAt(i) + "";
             String result = "";
             String resultA = result + s;
     String leftS = orginal.substring(0, i) + orginal.substring(i + 1, orginal.length());
             for (String element : permutation(leftS)) {
                    result = resultA + element; 
                    list.add(result);
                }
            }
            return (String[]) list.toArray(new String[list.size()]);
        }
    }
}