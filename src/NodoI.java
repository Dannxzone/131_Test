
public class NodoI {
	private String Nombre;
	private String Dir;
	private String Horario;
	private LSalas s;
	private LDEventos e;
	private NodoI sig;
	
	public LDEventos getE() {
		return e;
	}

	public void setE(LDEventos e) {
		this.e = e;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDir() {
		return Dir;
	}

	public void setDir(String dir) {
		Dir = dir;
	}

	public String getHorario() {
		return Horario;
	}

	public void setHorario(String horario) {
		Horario = horario;
	}

	public LSalas getS() {
		return s;
	}

	public void setS(LSalas s) {
		this.s = s;
	}

	public NodoI getSig() {
		return sig;
	}

	public void setSig(NodoI sig) {
		this.sig = sig;
	}

	
	NodoI(){
		sig=null;
	}
}
