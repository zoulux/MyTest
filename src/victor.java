import java.util.Vector;

public class victor {
	public static void main(String[] args) {
		Vector<Double> n = new Vector<Double>();
		for(int i=0;i<10;i++)
			n.add((double) i);
		for(int i=0;i<10;i++)
			System.out.println(n.get(i));
	}

}
