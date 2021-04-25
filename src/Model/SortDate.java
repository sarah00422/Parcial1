package Model;
import java.util.Comparator;


public class SortDate implements Comparator<Pets> {
	@Override
	public int compare(Pets o1, Pets o2) {
	
		return o1.getBirthday().compareTo(o2.getBirthday());
	}

}
