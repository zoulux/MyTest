import java.math.BigDecimal;
import java.math.BigInteger;


public class ceshi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal s=new BigDecimal("1");
		s=s.divide(BigDecimal.valueOf(125689.0*55455.0),100,BigDecimal.ROUND_HALF_DOWN);
		System.out.println(s);
	}

}
