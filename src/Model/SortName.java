package Model;
import java.util.Comparator;


public class SortName implements Comparator<Pets> {
	
	@Override
	public int compare(Pets o1, Pets o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}


}
