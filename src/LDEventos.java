
public class LDEventos {
	private NodoEventos p = new NodoEventos();

	public NodoEventos getP() {
		return p;
	}

	public void setP(NodoEventos p) {
		this.p = p;
	}
	
	public LDEventos() {
		p = null;
	}
	
	
	public void AddIni(String tipo, String horario, String lug, LDAsistentes x)
	{
		NodoEventos nuev = new NodoEventos();
		
		nuev.setTipo(tipo);
		nuev.setHorario(horario);
		nuev.setLugar(lug);
		nuev.setV(x);
		
		if(getP()==null){
			setP(nuev);
		}else{
			NodoEventos q = getP();
			q.setAnt(nuev);
			nuev.setSig(q);
			setP(nuev);
		}
	}
	public void AddFin(String tipo, String horario, String lug, LDAsistentes x)
	{
		NodoEventos nuev = new NodoEventos();
		
		nuev.setTipo(tipo);
		nuev.setHorario(horario);
		nuev.setLugar(lug);
		nuev.setV(x);
		
		if(getP()==null){
			setP(nuev);
		}else{
			NodoEventos q = getP();
			while(q.getSig()!=null){
				 q = q.getSig();
			}
			q.setSig(nuev);
			nuev.setAnt(q);
		}
	}
	
	public void leer1(int n)
	{
		for (int i = 0; i < n; i++) {	
			System.out.println(" |Evento|");
			LDAsistentes x = new LDAsistentes();
			String tipo = Leer.dato();
			String horario = Leer.dato();
			String lug = Leer.dato();
			System.out.println("Numero de Asistentes");
			x.leer1(Leer.datoInt());
			AddFin(tipo, horario, lug, x);
		}
	}
	
	public void leer2(int n)
	{
		for (int i = 0; i < n; i++) {
			System.out.println(" |Evento|");
			LDAsistentes x = new LDAsistentes();
			String tipo = Leer.dato();
			String horario = Leer.dato();
			String lug = Leer.dato();
			System.out.println("Numero de Asistentes");
			x.leer1(Leer.datoInt());
			AddIni(tipo, horario, lug, x);
		}
	}

	
	public void mostrar()
	{
		NodoEventos w = getP();
		
		while(w!=null)
		{
			System.out.println("Tipo " + w.getTipo() + " Horario " + w.getHorario() + " Lugar " + w.getLugar());
			
			System.out.println(" --Asistentes");
			w.getV().mostrar();
			
			w = w.getSig();
		}
	}
	public int nroElem()
	{
		int nro = 0;
		NodoEventos q = getP();
		
		while(q!=null){
			nro++;
			q = q.getSig();
		}
		
		return nro;
	}
	
	
}
