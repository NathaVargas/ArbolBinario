package TallerArboles;

public class Nodo {

	Nodo izq;
	Nodo der;
	Estudiante estudiante; // Clase Estudiante - Objeto estudiante
	private int info;

	public Nodo(Estudiante p) {
		estudiante = p;
	}

	public String toString() {
		return estudiante + "[" + izq + "," + der + "]";

	}

	}
