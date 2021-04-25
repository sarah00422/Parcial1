package Model;

import processing.core.PApplet;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Pets implements Comparable<Pets> {
	private PApplet app;

	private int id;
	private String name, race;
	private Date birthday;
	private String date;

	public Pets(PApplet app, int id, String name, String race, Date birthday) {

		this.app = app;
		this.id = id;
		this.name = name;
		this.race = race;
		this.birthday = birthday;

		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		date = formato.format(birthday);
	}
	public void drawData(int x, int y) {

		app.text("Id:" + id, x, y);
		app.text("Name:" + name, x, y + 20);
		app.text("Race:" + race, x, y + 60);
		app.text("Birthay:" + date, x, y + 80);

	}
	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public int compareTo(Pets nextPets) {
		// TODO Auto-generated method stub
		return this.id-nextPets.getId();
	}
	

}
