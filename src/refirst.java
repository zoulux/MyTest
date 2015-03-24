
public class refirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String word="want";
		char fir = word.charAt(0);
		String Fir = fir + "";
	word=	word.replaceFirst(Fir, Fir.toUpperCase());
		System.out.println(word);
	}

}
