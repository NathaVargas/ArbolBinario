                                                                                        package TallerArboles;
/*Dado un archivo plano que contiene los nombres y las cédulas de los etudiantes del poli.
 * Contruya un índice que permita buscar  rápidamente entre la lista el nombre de un estudiante dada la cc.
 * 
 * 1. Crear un archivo de ejemplo OK
 * 2. Construir el índice de búsqueda (cc) 
 * 2.1 leer el archivo plano OK
 * 2.2 Cargar los datos en un arreglo OK
 * 2.3 Orednar el arreglo del archivo plano OK
 * 2.4 Crear la raíz del árbol OK
 * 2.5 Insertar nuevos estudiantes en el árbol DIFícil OK
 * 3. Realizar una busqueda de estudiante
 * 3.1. Preguntar al estudiante por la cc
 * 3.2. Leer la cc
 * 3.3. Buscar la cc
 * 3.4. Imprimir cc y nombre
 * 
 * Adaptar función para que reciba objeto persona y no enteros*********
 */

/*public class TallerA1 {
	public static void main(String[] args) {
		Nodo n1 = new Nodo(new Persona(80724929, "Julian Olarte"));
		Nodo n5 = new Nodo(new Persona(1012402926, "Jessica Rodriguez"));
		Nodo n6 = new Nodo(new Persona(1014211008, "Diana Carreño"));
		Nodo n2 = new Nodo(new Persona(1023886215, "David Eduardo"));
		Nodo n4 = new Nodo(new Persona(1033742936, "william Patarroyo"));
		Nodo n7 = new Nodo(new Persona(1127533696, "Natalia Laserna"));
		Nodo n3 = new Nodo(new Persona(1233288734, "Natalia Vargas"));
		Nodo raiz = n2;
		n2.izq = n5;
		n5.izq = n1;
		n5.der = n6;
		n2.der = n7;
		n7.izq = n4;
		n7.der = n3;
		System.out.println(raiz);
	}
}*/
/*
class Nodo {
	Nodo izq;
	Nodo der;
	Persona persona;

	public Nodo(Persona p) {
		persona = p;
	}

	public String toString() {
		return persona + "[" + izq + "," + der + "]";
	}
}

class Persona {
	long cedula;
	String nombre;

	public Persona(long c, String n) {
		nombre = n;
		cedula = c;
	}

	public String toString() {
		return cedula + ":" + nombre;
	}
}
*/