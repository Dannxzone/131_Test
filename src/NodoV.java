
public class NodoV {
	private String Ci;
	private String Nombre;
	private String Opinion;
	private int Edad;
	private NodoV sig;
	
	public String getCi() {
		return Ci;
	}

	public void setCi(String ci) {
		Ci = ci;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getOpinion() {
		return Opinion;
	}

	public void setOpinion(String opinion) {
		Opinion = opinion;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public NodoV getSig() {
		return sig;
	}

	public void setSig(NodoV sig) {
		this.sig = sig;
	}

	
	
	public NodoV() {
		sig = null;
	}
}
