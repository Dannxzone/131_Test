
public class LCInstituciones {
private NodoI p;
	
	public NodoI getP() {
		return p;
	}

	public void setP(NodoI p) {
		this.p = p;
	}

	public LCInstituciones() {
		p = null;
	}
	
	
	public void AdFinal(String n, String d, String h, LSalas x, LDEventos y)
	{
		NodoI nue = new NodoI();
		nue.setNombre(n);
		nue.setDir(d);
		nue.setHorario(h);
		nue.setS(x);
		nue.setE(y);
		if(getP() == null){
			setP(nue);
			nue.setSig(nue);
		}else{
			NodoI r = getP();
			while(r.getSig()!=getP()){
				r = r.getSig();
			}
			r.setSig(nue);
			nue.setSig(getP());
		}	
	}
	
	
	public void leer2(int n){
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Institucion");
			String no = Leer.dato();
			String d = Leer.dato();
			String h = Leer.dato();
			LSalas x = new LSalas();
			System.out.println(" |Num Salas| ");
			x.leer2(Leer.datoInt());
			System.out.println(" |Num Eventos| ");
			LDEventos y = new LDEventos();
			y.leer1(Leer.datoInt());
			AdFinal(no, d, h, x, y);
		}
	}
	
	
	public void mostrar()
	{
		NodoI w = getP();
		
		while (w.getSig()!=getP()) {
			System.out.println("\n" + w.getNombre() + " " + w.getDir() + " " + w.getHorario()  +" -- ");
			System.out.println("  --Salas");
			w.getS().mostrar();
			System.out.println("  --Eventos");
			w.getE().mostrar();
			w = w.getSig();
		}
		System.out.println("\n" + w.getNombre() + " " + w.getDir() + " " + w.getHorario()  +" -- ");
		System.out.println("  --Salas");
		w.getS().mostrar();
		System.out.println("  --Eventos");
		w.getE().mostrar();
	}
	
}
