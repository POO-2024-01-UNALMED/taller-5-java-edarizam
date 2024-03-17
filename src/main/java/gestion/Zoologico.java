package gestion;
import java.util.ArrayList;

public class Zoologico {
	
	//Atributes
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	//Constructores
	public Zoologico() {}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	//Methods
	public void agregarZonas(Zona ... zonas) {
		for (Zona zona : zonas) {
			this.zonas.add(zona);
		}
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for (Zona zona : zonas) {
			totalAnimales += zona.getAnimales().size();
		}
		return totalAnimales;
	}
}
