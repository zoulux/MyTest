package com.zlx.test2;
    import java.util.ArrayList;  
    import java.util.List;  
      
      
    public class NumTest {  
      
        public static void main(String[] args) {  
            String s="123";//ԭ�ַ���  
            List<String> result = list(s, "");//�г��ַ�����ϣ�����result  
              
            System.out.println(result.size());;  
            System.out.println(result);  
        }  
          
        /** 
         * �г������ַ���(base)��������� 
         * @param base �Ը��ַ�����Ϊ�����ַ���������ѡ������ϡ� 
         * @param buff �����ַ�������ʱ��� 
         * @param result ��������� 
         */  
        public static List<String> list(String base,String buff){  
            List<String> result = new ArrayList<String>();//��Ž����Ϣ��  
            if(base.length()<=0){  
                result.add(buff);  
            }  
            for(int i=0;i<base.length();i++){  
                List<String> temp = list(new StringBuilder(base).deleteCharAt(i).toString(),buff+base.charAt(i));  
                result.addAll(temp);  
                  
            }  
              
            return result;  
        }  
    }  