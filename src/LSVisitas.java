
public class LSVisitas {
	private NodoV p;
	
	public NodoV getP() {
		return p;
	}

	public void setP(NodoV p) {
		this.p = p;
	}

	public LSVisitas() {
		p = null;
	}
	
	public void AdFinal(String c, String n, int e, String o )
	{
		NodoV nue = new NodoV();
		nue.setCi(c);
		nue.setNombre(n);
		nue.setEdad(e);
		nue.setOpinion(o);
		
		if(getP() == null){
			setP(nue);
		}else{
			NodoV r = getP();
			while(r.getSig()!=null){
				r = r.getSig();
			}
			r.setSig(nue);
		}
	}
	
	public void leer2(int n){
		for (int i = 1; i <= n; i++) {
			System.out.println("Datos Visita");
			String c = Leer.dato();
			String no = Leer.dato();
			int e = Leer.datoInt();
			String o = Leer.dato();
			AdFinal(c, no, e, o);
		}
	}
	
	public void mostrar()
	{
		NodoV w = getP();
		
		while (w!=null) {
			System.out.println(" Ci "+w.getCi() + " Nombre " + w.getNombre() + " Edad " + w.getEdad() + " Opinion " + w.getOpinion() +" -- ");
			w = w.getSig();
		}
	}
	
	public int nroElem()
	{
		int nro = 0;
		NodoV q = getP();
		
		while(q!=null){
			nro++;
			q = q.getSig();
		}
		
		return nro;
	}
	
	public void eliminar(String x)
	{
		while(getP().getNombre().equals(x)){
			setP(getP().getSig());
		}
		
		
		NodoV r = getP();
		NodoV q = r;	
	
		while(r.getSig()!=null){
		
		if(q.getSig().getNombre().equals(x)){
				q = q.getSig();
				r.setSig(q.getSig()); 
				q = r;
				if(q!=null){
					boolean i = true;
					while(q.getNombre().equals(x) && i){
							r.setSig(q.getSig());
							q = r;
							if(q==null){
								i =false;
							}
					}
				}
			}else{
				r = r.getSig();
				q = r;
			}
			
			
		}	
	}
	
	public void mostrarRec(NodoV a) 
	{
		if(a!=null){
			
			System.out.println("Carnet " + a.getCi() + " Nombre " + a.getNombre() + " Edad " + a.getEdad() + " Opinion " + a.getOpinion());
			
			mostrarRec(a.getSig());
		}
	}
	
}
