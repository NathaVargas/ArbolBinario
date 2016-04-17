package TallerArboles;

public class Estudiante implements Comparable{
	public String cedula;
	public String nombre;

	public Estudiante(String c, String n) {
		nombre = n;
		cedula = c;
	}

	public String toString() {
		return cedula + ":" + nombre;
	}

	@Override
	public int compareTo(Object a) {
		Estudiante otro = (Estudiante)a; //convertir objeto en estudiante
		return cedula.compareTo(otro.cedula);
	}

}
