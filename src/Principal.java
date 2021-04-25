import Controler.DataBase;
import processing.core.PApplet;



public class Principal extends PApplet {
	DataBase controler;

	public static void main(String[] args) {
		PApplet.main(Principal.class.getName());
	}

	@Override
	public void settings() {
		size(1880, 450);
	}

	

	@Override
	public void setup() {
		controler= new DataBase(this);
	}

	@Override
	public void draw() {
		background(0);
		
		drawText();
		
		for (int i = 0; i < controler.pets().size(); i++) {

			textSize(13);
			controler.pets().get(i).drawData(23+(185*i),300); 
		}
		
	}
	public void drawText() {
		
		textSize(20);
		text("Fundacion Peludos Sin Hogar", 25, 50);
		text("Para organizar la información, presione las teclas indicadas:", 25, 50+40);
		text("Q = ID", 25, 100+20);
		text("W = Name", 25, 100+40);
		text("R = Race", 25, 100+80);
		text("T = Birthday", 25, 100+100);
		
	}
	public void keyPressed(){
		controler.sortList(key);
	}
	
	

	public void mousePressed() {

	}
}
