package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;

	SortName sortName;
	SortRace sortRace;
	SortDate sortDate;

	private String[] textOne;
	private String[] textTwo;
	private LinkedList<Pets> pets;

	private String[] saveId, saveName, saveRace, saveDate;

	public Logic(PApplet app) {

		this.app = app;
		textOne = app.loadStrings("../data/data1.txt");
		textTwo = app.loadStrings("../data/data2.txt");
		pets = new LinkedList<Pets>();

		sortName = new SortName();
		sortRace = new SortRace();
		sortDate = new SortDate();

		saveId = new String[10];
		saveName = new String[10];
		saveRace = new String[10];
		saveDate = new String[10];

		for (int i = 0; i < textOne.length; i++) {

			String[] data1 = textOne[i].split(",");

			int id = Integer.parseInt(data1[0]);
			String name = data1[1];

			for (int j = 0; j < textTwo.length; j++) {

				String[] data2 = textTwo[j].split(",");
				String[] raceAndDate = data2[1].trim().split(" ");

				if (id == Integer.parseInt(data2[0])) {

					String race = data2[1];
					String birthday = data2[2];
					Date date = null;
					try {
						date = new SimpleDateFormat("dd-MM-yyyy").parse(birthday);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					pets.add(new Pets(app, id, name, race, date));
				}
			}

		}
	}

	public void sortList(char key) {
				
				switch (key) {
				
				//Ordenamiento (natural) por ID
				case 'q':
					
					Collections.sort(pets);
					
					for (int i = 0; i < pets.size(); i++) {

						String id = Integer.toString(pets.get(i).getId());
						String name = pets.get(i).getName().toLowerCase();
						String race = pets.get(i).getRace().toLowerCase();
						
					
						
						Date date = pets.get(i).getBirthday();
						SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
						String fecha2 = formato.format(date);
						
						String line = id + "," + name + "," + race + "," + fecha2;

						saveId[i] = line;
						
						String prueba = saveId[i];
						System.out.println(prueba);
						
						app.saveStrings("OrganizadoPorId.txt", saveId);
					}
					
					break;

				//Ordenamiento por nombre
				case 'w':
					
					Collections.sort(pets, sortName);
					
					for (int i = 0; i < pets.size(); i++) {

						String id = Integer.toString(pets.get(i).getId());
						String name = pets.get(i).getName().toLowerCase();
						String race = pets.get(i).getRace().toLowerCase();
						
						Date fecha = pets.get(i).getBirthday();
						SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
						String fecha2 = formato.format(fecha);
						
						String line = id + "," + name + "," + race + "," + fecha2;

						saveName[i] = line;
						
						String prueba = saveName[i];
						System.out.println(prueba);

						app.saveStrings("OrganizadoPorNombre.txt", saveName);
					}
					break;
			
				case 'r':
					
					Collections.sort(pets, sortRace);
					
					for (int i = 0; i < pets.size(); i++) {

						String id = Integer.toString(pets.get(i).getId());
						String name = pets.get(i).getName().toLowerCase();
						String race = pets.get(i).getRace().toLowerCase();
						
						Date fecha = pets.get(i).getBirthday();
						SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
						String fecha2 = formato.format(fecha);
						
						String line = id + "," + name + "," + race + "," + fecha2;

						saveRace[i] = line;
						
						String prueba = saveRace[i];
						System.out.println(prueba);

						app.saveStrings("OrganizadoPorRaza.txt", saveRace);
					}
					break;
					
				case 't':
					
					Collections.sort(pets, sortDate);
					
					for (int i = 0; i < pets.size(); i++) {

						String id = Integer.toString(pets.get(i).getId());
						String name = pets.get(i).getName().toLowerCase();
						String race = pets.get(i).getRace().toLowerCase();
						
						Date date = pets.get(i).getBirthday();
						SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
						String fecha2 = formato.format(date);
						
						String line = id + "," + name + "," + race + "," + fecha2;

						saveDate[i] = line;
						
						String prueba = saveDate[i];
						System.out.println(prueba);

						app.saveStrings("OrganizadoPorFechaNacimiento.txt", saveDate);
					}
					break;
			
				}
	}

	public LinkedList<Pets> getPets() {
		return pets;
	}

}
