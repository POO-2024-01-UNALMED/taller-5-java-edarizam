package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
	
	//Attributes
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	//Constructor
	public Ave() {
		this(null,0,null,null,null);
	}
	public Ave(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		super(nombre,edad,habitat,genero,zona);
		this.colorPlumas = colorPlumas;
	}
	
	//Gettters and Setters
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	public static int getHalcones() {
		return halcones;
	}
	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	public static int getAguilas() {
		return aguilas;
	}
	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	//Methods
	public static int cantidadAves() {
		return Ave.getListado().size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		setHalcones(halcones + 1);
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		return halcon;
	}
	public static Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
		setHalcones(halcones + 1);
		Ave halcon = new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
		setAguilas(aguilas + 1);
		Ave aguila = new Ave(nombre, edad, "montanas", genero, zona,"blanco y amarillo");
		return aguila;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		setAguilas(aguilas + 1);
		Ave aguila = new Ave(nombre, edad, "montanas", genero,"blanco y amarillo");
		return aguila;
	}
}
