package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal {
	
	//Attributes
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	//Constructor
	public Anfibio() {}
	public Anfibio(String colorPiel, boolean venenoso) {
		super();
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero,zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	//Getters and Setters
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public static int getRanas() {
		return ranas;
	}
	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}
	public static int getSalamandras() {
		return salamandras;
	}
	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	//Methods
	public static int cantidadAnfibios() {
		return getListado().size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
		setRanas(ranas + 1);
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
		getListado().add(rana);
		return rana;
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		setRanas(ranas + 1);
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		getListado().add(rana);
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		setSalamandras(salamandras + 1);
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
		getListado().add(salamandra);
		return salamandra;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		setSalamandras(salamandras + 1);
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		getListado().add(salamandra);
		return salamandra;
	}
	
}
