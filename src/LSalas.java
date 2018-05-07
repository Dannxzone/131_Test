
public class LSalas {
	private NodoS p;
	
	public NodoS getP() {
		return p;
	}

	public void setP(NodoS p) {
		this.p = p;
	}

	LSalas(){
		p = null;
	}
	
	public void AdFinal(String n, String t, LSVisitas x)
	{
		NodoS nue = new NodoS();
		nue.setNombre(n);
		nue.setTipo(t);
		nue.setV(x);
		
		if(getP() == null){
			setP(nue);
		}else{
			NodoS r = getP();
			while(r.getSig()!=null){
				r = r.getSig();
			}
			r.setSig(nue);
		}
	}
	
	public void leer2(int n){
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Sala");
			String no = Leer.dato();
			String t = Leer.dato();
			LSVisitas x = new LSVisitas();
			System.out.println("Num Visitas");
			x.leer2(Leer.datoInt());
			AdFinal(no, t, x);
		}
	}
	
	public void mostrar()
	{
		NodoS w = getP();
		
		while (w!=null) {
			System.out.println("\n"+ w.getNombre() + " " + w.getTipo()+ " -- ");
			w.getV().mostrar();
			w = w.getSig();
		}
	}
	public int nroElem()
	{
		int nro = 0;
		NodoS q = getP();
		
		while(q!=null){
			nro++;
			q = q.getSig();
		}
		
		return nro;
	}
	
	public static void mostrarRec(NodoS a)
	{
		
		if(a!=null){
			System.out.println("Sala " + a.getNombre() + " Tipo " + a.getTipo());
			
			a.getV().mostrarRec(a.getV().getP());
			mostrarRec(a.getSig());
		}
	}
	
}
