package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal {
	
	//Attributes
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	//Constructor
	public Reptil() {
		this(null,0,null,null,null,0);
	}
	public Reptil(String colorEscamas, int largoCola) {
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola ) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola ) {
		super(nombre,edad,habitat,genero,zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	//Getters and Setters
	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public static int getIguanas() {
		return iguanas;
	}

	public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}

	public static int getSerpientes() {
		return serpientes;
	}

	public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	//Methods
	public static int cantidadReptiles() {
		return Reptil.getListado().size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero, Zona zona) {
		setIguanas(iguanas + 1);
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, zona, "verde",3);
		return iguana;
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		setIguanas(iguanas + 1);
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde",3);
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
		setSerpientes(serpientes + 1);
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, zona, "blanco",1);
		return serpiente;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		setSerpientes(serpientes + 1);
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco",1);
		return serpiente;
	}
}
