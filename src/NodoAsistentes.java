
public class NodoAsistentes {
	private String nom,ci;
	private int edad;
	private NodoAsistentes ant,sig;
	
	public NodoAsistentes getAnt() {
		return ant;
	}
	public void setAnt(NodoAsistentes ant) {
		this.ant = ant;
	}
	public NodoAsistentes getSig() {
		return sig;
	}
	public void setSig(NodoAsistentes sig) {
		this.sig = sig;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public NodoAsistentes() {
		ant = sig = null;
	}
}
