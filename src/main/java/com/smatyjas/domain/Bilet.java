package main.java.com.smatyjas.domain;

public class Bilet {
	private int id_bilet;
	private String rodzaj;
	private int cena;
	private String opis;
	
	public Bilet() {}
	
	public Bilet(String rodzaj, int cena, String opis){
		super();
		this.rodzaj = rodzaj;
		this.cena = cena;
		this.opis = opis;
	}
	
	public int getId_bilet(){
		return id_bilet;
	}
	
	public void setId_bilet(int id_bilet){
		this.id_bilet = id_bilet;
	}
	
	public String getRodzaj(){
		return rodzaj;
	}
	
	public void setRodzaj(String rodzaj){
		this.rodzaj = rodzaj;
	}
	
	public int getCena(){
		return cena;
	}
	
	public void setCena(int cena){
		this.cena = cena;
	}
	
	public String getOpis(){
		return opis;
	}
	
	public void setOpis(String opis){
		this.opis = opis;
	}
}