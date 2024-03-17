package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal {
	
	//Attributes
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	//Constructor
	public Mamifero () {}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, Boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero,zona);
		this.pelaje = pelaje;
		this.patas = patas;
	}

	public Mamifero(boolean pelaje, int patas) {
		super();
		this.pelaje = pelaje;
		this.patas = patas;
	}

	//Getters and Setters
	public boolean isPelaje() {
		return pelaje;
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public static int getCaballos() {
		return caballos;
	}

	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}

	public static int getLeones() {
		return leones;
	}

	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	//Methods
	public static int cantidadMamiferos () {
		return Mamifero.getListado().size();
	}
	
	public void crearCaballo(String nombre, int edad, String genero, Zona zona) {
		Mamifero caballo = new Mamifero (nombre, edad, "Pradera", genero, zona, true, 4);
		setCaballos(caballos + 1);
		Mamifero.listado.add(caballo);
	}
	
	public void crearLeon(String nombre, int edad, String genero, Zona zona) {
		Mamifero leon = new Mamifero (nombre, edad, "Selva", genero, zona, true, 4);
	    setLeones(leones + 1);
		Mamifero.listado.add(leon);
	}
	
	
}
