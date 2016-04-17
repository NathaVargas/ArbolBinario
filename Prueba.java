package TallerArboles;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class Prueba {

	private static final int X = 0;

	public static void main(String[] args) {
		// * 2.1 leer el archivo plano
		// * 2.2 Cargar los datos en un arreglo

		Estudiante[] archivo = new Estudiante[19];
		try {
			// Abrimos el archivo
			FileInputStream fstream = new FileInputStream("C:/Users/DELL/Desktop/Parcial/Btree/src/ArchivoPlano.csv");
			// Creamos el objeto de entrada
			DataInputStream entrada = new DataInputStream(fstream);
			// Creamos el Buffer de Lectura
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			String strLinea;
			// Leer el archivo linea por linea
			int contador = 0;
			while ((strLinea = buffer.readLine()) != null) {
				// Imprimimos la línea por pantalla
				// System.out.println (strLinea);
				String[] tmp = strLinea.split(";"); // partir la cadena
				archivo[contador++] = new Estudiante(tmp[0], tmp[1]); 
				// crear un objeto y lo mete dentro del arreglo
			}
			// Cerramos el archivo
			entrada.close();
		} catch (Exception e) { // Catch de excepciones
			System.err.println("Ocurrio un error: " + e.getMessage());
		}

		// ordenarlo
		Arrays.sort(archivo);

		for (int i = 0; i < archivo.length; i++) {
			System.out.println(archivo[i]);
			insertar(archivo[i]);
		}
		// Crear la Raíz del árbol
		Nodo raiz = new Nodo(archivo[0]);

	}
	// Insertar Nodo

	static Nodo raiz;

	public static void insertar(Estudiante est) {
		Nodo nuevo;
		nuevo = new Nodo(est);
		// nuevo.info = info;
		nuevo.izq = null;
		nuevo.der = null;
		// Object raiz = null;
		if (raiz == null) {
			raiz = nuevo;
		} else {
			Nodo anterior = null, reco;
			reco = (Nodo) raiz;
			while (reco != null) {
				anterior = reco;
				if (est.cedula.compareTo(reco.estudiante.cedula) < 0) {
					reco = reco.izq;
				} else {
					reco = reco.der;
				}
			}
			if (est.cedula.compareTo(anterior.estudiante.cedula) < 0) {
				anterior.izq = nuevo;
			} else {
				anterior.der = nuevo;
			}
		}
	}
	//EL METODO DE BUSQUEDA AUN NO FUNCIONA CORRECTAMENTE
	public String Busqueda(int[]Estudiante, Estudiante est){
		//Preguntar al estudiante por la cc, leer la cc, buscar la cc, imprimir cc y nombre
		Scanner t=new Scanner(System.in);
		System.out.println("Digite CC a buscar: ");
		String c=t.nextLine();
		for(int i=0; i<=Estudiante.length-1; i++){
			System.out.println("ciclo");
			if (c.equals(est.cedula))
			{
				System.out.println("Estudiante");
				System.out.println("Nombre: "+est.nombre);
				System.out.println("Cédula: "+est.cedula);
			}else if(i==Estudiante.length-1){
				System.out.println("Estudiante no ecncontrado");
			}
		}
		return c;
	}

}