package main.java.com.smatyjas.service;

import java.util.ArrayList;
import java.util.List;
import main.java.com.smatyjas.domain.Bilet;

public class BiletManager {
	private List<Bilet> bilety = new ArrayList<Bilet>();
	private int id_bilet = 0;
	
	public void dodajBilet(Bilet bilet) {
		Bilet nowyBilet = new Bilet(bilet.getRodzaj(), bilet.getCena(), bilet.getOpis());
		id_bilet++;
		nowyBilet.setId_bilet(id_bilet);
		bilety.add(nowyBilet);
	}
	
	public List<Bilet> pobierzBilety() {
		return bilety;
	}
}
