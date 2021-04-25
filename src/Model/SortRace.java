package Model;
import java.util.Comparator;


public class SortRace implements Comparator<Pets> {
	@Override
	public int compare(Pets o1, Pets o2) {
		
		return o1.getRace().compareTo(o2.getRace());
	}

}
