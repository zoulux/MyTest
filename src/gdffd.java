import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class gdffd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(i);
		System.out.println(list.toString());
		Comparator<Integer>  comparator=Collections.reverseOrder();
		Collections.sort(list,comparator);
		
		System.out.println(list.toString());

	}

}
