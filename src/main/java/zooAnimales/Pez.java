package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal{
	
	//Attributes
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	//Constructor
	public Pez() {}
	public Pez(String colorEscamas, int cantidadAletas) {
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero,zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	//Getters and Setters
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	public static int getSalmones() {
		return salmones;
	}
	public static void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}
	public static int getBacalaos() {
		return bacalaos;
	}
	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	//Methods
	public static int cantidadPeces() {
		return getListado().size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero, Zona zona) {
		setSalmones(salmones + 1);
		Pez salmon = new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
		getListado().add(salmon);
		return salmon;
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		setSalmones(salmones + 1);
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		getListado().add(salmon);
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero, Zona zona) {
		setBacalaos(bacalaos + 1);
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
		getListado().add(bacalao);
		return bacalao;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		setBacalaos(bacalaos + 1);
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		getListado().add(bacalao);
		return bacalao;
	}
}
