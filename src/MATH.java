
		public class MATH {
			 public static void main(String[] args) throws Exception{
			  java.math.BigDecimal b  =new java.math.BigDecimal("999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
			  b=b.pow(0xFF);
			  String s= b.toString();
			  System.out.println(s);
			 }
		

	

}
