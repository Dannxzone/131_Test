
public class LDAsistentes {
	private NodoAsistentes p;

	public NodoAsistentes getP() {
		return p;
	}

	public void setP(NodoAsistentes p) {
		this.p = p;
	}
	
	public LDAsistentes() {
		p = null;
	}
	
	
	public void AddFin(String ci, String n, int e )
	{
		NodoAsistentes nue = new NodoAsistentes();
		nue.setNom(n);
		nue.setCi(ci);
		nue.setEdad(e);
		
		if(getP()==null){
			setP(nue);
		}else{
			NodoAsistentes w = getP();
			while(w.getSig()!=null){
				w = w.getSig();
			}
			w.setSig(nue);
			nue.setAnt(w);
		}
	}
	
	
	public void leer1(int n)
	{
		for (int i = 0; i < n; i++) {
			NodoAsistentes q = new NodoAsistentes();
			System.out.println("Datos Asistente ");
			AddFin(Leer.dato(), Leer.dato(), Leer.datoInt());
		}
	}
	
	public void mostrar()
	{
		NodoAsistentes r = getP();
		while(r!=null){
			System.out.println("Ci " + r.getCi() + " Nombre " + r.getNom() + " Edad " + r.getEdad() );
			
			r = r.getSig();
		}
	}
	
	public int nroElem()
	{
		int nro = 0;
		NodoAsistentes q = getP();
		
		while(q!=null){
			nro++;
			q = q.getSig();
		}
		
		return nro;
	}
	
	
	
	public NodoAsistentes ultiElem(){
		
		NodoAsistentes q = new NodoAsistentes();
		
		while (q.getSig()!=null){
			q = q.getSig();
		}
		return q;
	}
	
public void ultiElem(NodoAsistentes e){
		
		NodoAsistentes q = new NodoAsistentes();
		
		while (q.getSig()!=null){
			q = q.getSig();
		}
		e = q;
	}
	
}
