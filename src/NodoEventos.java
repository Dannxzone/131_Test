
public class NodoEventos {
	private String tipo, horario, lugar;
	private LDAsistentes v = new LDAsistentes();
	private NodoEventos ant, sig;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public LDAsistentes getV() {
		return v;
	}

	public void setV(LDAsistentes v) {
		this.v = v;
	}

	public NodoEventos getAnt() {
		return ant;
	}

	public void setAnt(NodoEventos ant) {
		this.ant = ant;
	}

	public NodoEventos getSig() {
		return sig;
	}

	public void setSig(NodoEventos sig) {
		this.sig = sig;
	}

	
	
	public NodoEventos() {
		ant=sig=null;
	}
}
