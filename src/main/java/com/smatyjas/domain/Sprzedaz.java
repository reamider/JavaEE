package main.java.com.smatyjas.domain;

public class Sprzedaz {
	private int id_sprzedaz;
	private int id_klient;
	private int id_bilet;
	
	public Sprzedaz(){}
	
	public Sprzedaz(int id_klient, int id_bilet){
		super();
		this.id_klient = id_klient;
		this.id_bilet = id_bilet;
	}
	
	public int getId_sprzedaz(){
		return id_sprzedaz;
	}
	
	public void setId_sprzedaz(int id_sprzedaz){
		this.id_sprzedaz = id_sprzedaz;
	}
	
	public int getId_klient(){
		return id_klient;
	}
	
	public void setId_klient(int id_klient){
		this.id_klient = id_klient;
	}
	
	public int getId_bilet(){
		return id_bilet;
	}
	
	public void setId_bilet(int id_bilet){
		this.id_bilet = id_bilet;
	}
}
