package main.java.com.smatyjas.service;

import java.util.ArrayList;
import java.util.List;
import main.java.com.smatyjas.domain.Klient;
import main.java.com.smatyjas.domain.Bilet;
import main.java.com.smatyjas.domain.Sprzedaz;

public class KlientManager {
	private List<Klient> klienci = new ArrayList<Klient>();
	private List<Sprzedaz> sprzedaze = new ArrayList<Sprzedaz>();
	private int id_klient = 0;
	private int id_przedstawienie = 0;
	
	public void dodajKlienta(Klient klient) {
		Klient nowyKlient = new Klient(klient.getImie(), klient.getNazwisko(), klient.getNumertelefonu() );
		id_klient++;
		nowyKlient.setId_klient(id_klient);
		klienci.add(nowyKlient);
	}
}
