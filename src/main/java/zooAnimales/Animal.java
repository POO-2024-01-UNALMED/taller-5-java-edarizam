package zooAnimales;

import gestion.Zona;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	//Constructor
	public Animal() {
		this(null,0,null,null);
	}
	public Animal(String nombre, int edad, String habitat, String genero) {
		Animal.totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = null;
	}
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		Animal.totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
	//Getters y Setters
	public static int getTotalAnimales() {
		return Animal.totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	//Methods
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
				"Aves: " + Ave.cantidadAves() + "\n" +
				"Reptiles: " + Reptil.cantidadReptiles() + "\n" +
				"Peces: " + Pez.cantidadPeces() + "\n" +
				"Anfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		if (zona == null) {
			return "Mi nombre es " + this.nombre + 
				", tengo una edad de " + this.edad + 
				", habito en " + this.habitat + 
				" y mi genero es " + this.genero;
			}else {
				return "Mi nombre es " + this.nombre + 
						", tengo una edad de " + this.edad + 
						", habito en " + this.habitat + 
						" y mi genero es " + this.genero + 
						", la zona en la que me ubico " + this.zona +
						" en el " + this.zona.getZoo();
			}
	}
	

}
