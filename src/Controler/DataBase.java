package Controler;
import processing.core.PApplet;
import java.util.LinkedList;
import Model.Logic; 
import Model.Pets; 

	public class DataBase {
	private PApplet app;
	private Logic logic;

	public DataBase(PApplet app) {
		
		this.app = app;
		logic = new Logic(app);
	}

	public void sortList(char key) {

		logic.sortList(key);
	}

	public LinkedList<Pets> pets() {

		return logic.getPets();
	}
}
