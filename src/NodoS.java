
public class NodoS {
	private String Nombre;
	private String Tipo;
	private LSVisitas v;
	private NodoS sig;
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public LSVisitas getV() {
		return v;
	}

	public void setV(LSVisitas v) {
		this.v = v;
	}

	public NodoS getSig() {
		return sig;
	}

	public void setSig(NodoS sig) {
		this.sig = sig;
	}
	
	NodoS(){
		sig = null;
	}
	
	
}
