
public class Main {

	public static void main(String[] args) {
		
		//LCInstituciones a = new LCInstituciones();
		//a.leer2(2);
		//a.mostrar();
		//Mostrar Salas que visito la persona x 
		//MostrarX(a , "v1");
		//Instituciones con MayorNumerodeSalas
		//MayorNumero(a);
		//Mostrar Intituciones donde x Visito todos sus Salas y Eventos
		//SearchX(a, "x");
		/*
		LCInstituciones a = new LCInstituciones();
		a.leer2(3);
		
		a.mostrar();
		
		System.out.println("    -             -");
		Meeting(a, "I2");
		*/
		
		//Sisitantes
		/*
		LSVisitas a = new LSVisitas();
		a.leer2(4);
		
		a.mostrarRec(a.getP());
		System.out.println("    -             -");
		//Cuantos tienen Edad X Recursivamente
		//System.out.println(Edadx(a.getP(), 2));
		//Verificar si esta el visitante con nombre x
		if(ver(a.getP(), "Name")){
			System.out.println("Esta ");
		}else{
			System.out.println("Nope ");
		}
		
		//Mayor edad
		ShowMaior(a.getP(), Maior(a.getP()));
		*/
		/*LSalas a = new LSalas();
		System.out.println("Insertar numero de Salas ");
		a.leer2(Leer.datoInt());
		a.mostrarRec(a.getP());*/
		//mostrarRec(a.getP());
		
		//Cuantos visitantes con edad x
		//numVis(a.getP(), 4);
		
		//Cuantos visitantes con x hay en todas las salas
		//System.out.println(numTotal(a.getP(), 4));
		
		//Mostrar Salas que visito x
		//visX(a.getP(), "v4");
		
		
		//Defensa Recursividad
		
		
		System.out.println("---------------- Defensa Recursividad -----------------------");
		LInstituciones a = new LInstituciones();
		a.leer2(2);
		//Cuidado con los datos int !!!!
		a.mostrar();
		//Question 1
			//"av" Es lo que debemos buscar
		NameR(a.getP(), "av");
		//Question 2
			//"i2" Es en donde debemos buscar y 2 es el numero n
				//Decidi mostrar todos los atributos de los eventos (Excepto las listas de Asistentes) por que no tenemos un atributo "Nombre" en la clase evento
		InstitucionXR(a.getP(), 2, "i2");
		
		
	}
	
	
	//2 Mostrar Nombres de las Salas y eventos de la Institucion x con mas de n personas
	public static void InstitucionXR(NodoI a, int n, String x)
	{
		if(a!=null){
			if(a.getNombre().equals(x)){
				System.out.println(" En la Institucion " + a.getNombre() + " -----");
				Record(a.getS().getP(), n);
				Record(a.getE().getP(), n);
			}
			InstitucionXR(a.getSig(), n, x);
		}
	}
	
	public static void Record(NodoS a, int n)
	{
		if(a!=null){
			if(NroElem(a.getV().getP())>n){
				System.out.println(" En la Sala " + a.getNombre() + " " + a.getTipo() + " hay mas de " + n + " visitantes");
			}
			Record(a.getSig(), n);
		}
	}
	
	public static void Record(NodoEventos a, int n)
	{
		if(a!=null){
			if(NroElem(a.getV().getP())>n){
				System.out.println(" En el Evento " + a.getTipo() + " " + a.getHorario() + " " + a.getLugar() + " hay mas de " + n + " asistentes");
			}
			Record(a.getSig(), n);
		}
	}
	
	
	public static int NroElem(NodoV a)
	{
		if(a!=null){
			int w = NroElem(a.getSig());
			w = w+1;
			return w;
		}else{
			return 0;
		}
	}
	
	public static int NroElem(NodoAsistentes a)
	{
		if(a!=null){
			int w = NroElem(a.getSig());
			w = w+1;
			return w;
		}else{
			return 0;
		}
	}
	
	
	
	//1 Numero de eventos y Salas donde asistio X
	public static void NameR(NodoI a, String x)
	{
		if(a!=null){			
			System.out.println("La persona " + x + " Estuvo en " + NameER(a.getE().getP(), x) + " Eventos, y en " + NameER(a.getS().getP(), x) + " Salas De la Institucion " + a.getNombre());
			NameR(a.getSig(), x);
		}
	}
	
	
	public static int NameER(NodoS a, String x)
	{
		if(a!=null){
			
			int e = NameER(a.getSig(), x);
			
			if(SearchAs(a.getV().getP(), x)){
				e = e+1;
			}
			return e;	
		}else{
			return 0;
		}
	}
	
	
	public static int NameER(NodoEventos a, String x)
	{
		if(a!=null){
			
			int e = NameER(a.getSig(), x);
			
			if(SearchAs(a.getV().getP(), x)){
				e = e+1;
			}
			return e;	
		}else{
			return 0;
		}
	}
	
	
	public static boolean SearchAs(NodoAsistentes a, String x)
	{
		boolean asdf = false;
		
		if(a!=null){
			if(a.getNom().equals(x)){
				asdf = true;
			}else{
				return SearchAs(a.getSig(), x);
			}
		}
		if(asdf){
			return true;
		}else{
			return false;
		}
	}
	
	
	public static boolean SearchAs(NodoV a, String x)
	{
		boolean asdf = false;
		
		if(a!=null){
			if(a.getNombre().equals(x)){
				asdf = true;
			}else{
				return SearchAs(a.getSig(), x);
			}
		}
		if(asdf){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	////////////////////////////////Anteriores Defensas y Ejercicios////////////////////////////////////////	
	
	
	//Mostrar Instituciones //It's needed a simple list
	public static void show(NodoI a){
		if(a!=null){
			
			System.out.println("Name " + a.getNombre() + " Dir " + a.getDir() + " Schedule " + a.getHorario());
			mostrarRec(a.getS().getP());
			
			show(a.getSig());
		}
	}
	
	public static void visX(NodoS a , String x)
	{
		if(a!=null){
			if(ver(a.getV().getP(),x)){
				System.out.println("El visitante " + x + " se encuentra en la sala " + a.getNombre());
			}
			visX(a.getSig(), x);
		}
	}
	
	
	public static int numTotal(NodoS a, int x)
	{
		if(a!=null){
			
			int t = numTotal(a.getSig(), x);
			t =  Edadx(a.getV().getP(), x) + t;
			
			return t;
		}else{
			return 0;
		}
	}
	
	public static void numVis(NodoS a, int x)
	{
		if(a!=null){
			System.out.println("En la sala " + a.getNombre() +" hay ");
			System.out.println(Edadx(a.getV().getP(), x) + " personas con la edad " + x);
			System.out.println("    -             -");
			numVis(a.getSig(), x);
		}
	}
	
	
	public static void mostrarRec(NodoS a)
	{
		
		if(a!=null){
			System.out.println("Sala " + a.getNombre() + " Tipo " + a.getTipo());
			
			a.getV().mostrarRec(a.getV().getP());
			mostrarRec(a.getSig());
		}
	}
	
	public static int Maior(NodoV a)
	{
		if(a!=null){
			int m = Maior(a.getSig());
			if(m>a.getEdad()){
				return m;
			}else{
				return a.getEdad();
			}
			
		}else{
			return -1;
		}
	}
	
	
	public static void ShowMaior(NodoV a, int x)
	{
		if(a!=null){
			
			if(a.getEdad()==x){
				System.out.println(" Tiene una mayor edad " + a.getNombre());
			}
			ShowMaior(a.getSig(), x);
		}
	}
	
	
	public static boolean ver(NodoV a, String x)
	{
		if(a!=null){
			
			if(a.getNombre().equals(x)){
				return true;
			}
			return ver(a.getSig(), x);
			
		}else{
			return false;
		}
	}
	
	public static int Edadx(NodoV a, int x){
		
		if(a!=null){
			
			int e = Edadx(a.getSig(), x);
			
			if(a.getEdad()==x){
				e=e+1;
			}
			return e;
			
		}else{
			return 0;
		}
	}
	
	public static void mostrarRec(NodoV a) 
	{
		if(a!=null){
			
			//System.out.println("Carnet " + a.getCi() + " Nombre " + a.getNombre() + " Edad " + a.getEdad() + " Opinion " + a.getOpinion());
			
			mostrarRec(a.getSig());
			System.out.println("Carnet " + a.getCi() + " Nombre " + a.getNombre() + " Edad " + a.getEdad() + " Opinion " + a.getOpinion());
			
		}
	}
	
	public static void Meeting(LCInstituciones a, String x){
		NodoI q = a.getP();
		
		while(q.getSig()!=a.getP()){
			
			if(q.getNombre().equals(x)){
				meeting(q.getE());
				deleteUltim(q.getE());
			}
			q = q.getSig();
		}
		if(q.getNombre().equals(x)){
			meeting(q.getE());
			deleteUltim(q.getE());
		}
		
		System.out.println(" --Modificando " + x);
		a.mostrar();
	}
	
	public static void meeting(LDEventos a){
		NodoEventos w = a.getP();
		NodoEventos q = a.getP();

		w = w.getSig();
		
		while(w!=null){
			
			NodoAsistentes z = w.getV().getP();
			NodoAsistentes r = q.getV().getP();
			
			while(r.getSig()!=null){
				r =r.getSig();
			}
			
			z.setAnt(r);
			r.setSig(z);
			
			w = w.getSig();
			q = q.getSig();
			
		}
	}
	
	
	public static void deleteUltim(LDEventos a){
		NodoEventos w = a.getP();
		
		w.setSig(null);
	}
	
	
	
	public static void Dont(LCInstituciones a ,String x)
	{
		NodoI q = a.getP();
		
		while(q.getSig()!=a.getP()){
			
			if(DontEventos(q.getE(), x) && DontSalas(q.getS(), x)){
				System.out.println("La persona " + x + " No estuvo en la Institucion " + q.getNombre());
			}
			q = q.getSig();
		}
		
		if(DontEventos(q.getE(), x) && DontSalas(q.getS(), x)){
			System.out.println("La persona " + x + " No estuvo en la Institucion " + q.getNombre());
		}
	}
	
	
	
	public static boolean DontSalas(LSalas a ,String x)
	{
		NodoS q = a.getP();
		int z = 0;
		while(q!=null){ 
			if(DontVisitas(q.getV(), x)){
				z = z+1;
			}
			q = q.getSig();
		}
		
		if(z==a.nroElem()){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean DontVisitas(LSVisitas a, String x)
	{
		NodoV q = a.getP();
		int z = 0;
		
		while(q!=null){
			
			if(q.getNombre().equals(x)){
				
			}else{
				z = z+1;
			}
			q = q.getSig();
		}
		if(z==a.nroElem()){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	public static boolean DontEventos(LDEventos a ,String x)
	{
		NodoEventos q = a.getP();
		int z = 0;
		while(q!=null){ 
			if(DontAsistente(q.getV(), x)){
				z = z+1;
			}
			q = q.getSig();
		}
		
		if(z==a.nroElem()){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean DontAsistente(LDAsistentes a, String x)
	{
		NodoAsistentes q = a.getP();
		int z = 0;
		
		while(q!=null){
			
			if(q.getNom().equals(x)){
				
			}else{
				z = z+1;
			}
			q = q.getSig();
		}
		if(z==a.nroElem()){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	public static void SearchX(LCInstituciones a , String x)
	{
		NodoI w = a.getP();
		
		while(w.getSig()!=a.getP()){
			
			if(SearchX2(w.getS(), x) && SearchX2(w.getE(), x)){
				System.out.println("Institucion");
				System.out.println("  " + w.getNombre());
				
			}else{
				System.out.println("What happened in this " + w.getNombre());
			}
			w = w.getSig();
		}
		if(SearchX2(w.getS(), x) && SearchX2(w.getE(), x)){
			System.out.println("Institucion");
			System.out.println("  " + w.getNombre());
			
		}else{
			System.out.println("What happened in this " + w.getNombre());
		}
		
	}
	
	
	public static boolean SearchX2(LSalas a, String x)
	{
		int z = 0;
		NodoS s = a.getP();
		if(a.nroElem()!=0){
			for (int i = 0; i < a.nroElem(); i++) {
				if(RevengeoftheSearch(s.getV(), x)){
					z++;
				}
				s=s.getSig();
			}
		}else{
			z = 1;
		}
		
		if(z==a.nroElem())
		{
			return true;
		}else{
			return false;
		}
	}
	
	


	public static boolean SearchX2(LDEventos a, String x)
	{
		int z = 0;
		NodoEventos s = a.getP();
		
		if(a.nroElem()!=0){
			for (int i = 0; i < a.nroElem(); i++) {
				if(RevengeoftheSearch(s.getV(), x)){
					z++;
				}
				s=s.getSig();
			}
		}else{
			z = 1;
		}
		
		if(z==a.nroElem())
		{
			return true;
		}else{
			return false;
		}
	}

	public static boolean RevengeoftheSearch(LSVisitas a, String x)
	{
		NodoV q = a.getP();
		boolean asdf = false;
		while(q!=null){
			if(q.getNombre().equals(x)){
				asdf = true;
			}
			q = q.getSig();
		}
		if(asdf){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean RevengeoftheSearch(LDAsistentes a, String x)
	{
		NodoAsistentes q = a.getP();
		boolean asdf = false;
		while(q!=null){
			if(q.getNom().equals(x)){
				asdf = true;
			}
			q = q.getSig();
		}
		if(asdf){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	 public static void MayorNumero(LCInstituciones a)
	 {
		 NodoI r = a.getP();
		 
		 while(r.getSig() != a.getP()){
			 
		 }
	 }
	
	public static void MostrarX(LCInstituciones a, String x)
	{
		NodoI r = a.getP();
		
		while(r.getSig()!=a.getP())
		{
			
			boolean s = false;
			NodoS q = r.getS().getP();
			
			while(q!=null)
			{
				
				if(verifica(q.getV(),x)){
					System.out.println("Aparece en ");
					System.out.println(q.getNombre() + " " + q.getTipo());
					s = true;
				}
				q=q.getSig();
			}
			if(s){
				System.out.println("institucion " + r.getNombre());
			}
			r =r.getSig();
		}
		boolean s = false;
		NodoS q = r.getS().getP();
		
		while(q!=null)
		{
			
			if(verifica(q.getV(),x)){
				System.out.println("Aparece en ");
				System.out.println(q.getNombre() + " " + q.getTipo());
				s = true;
			}
			q=q.getSig();
		}
		if(s){
			System.out.println("institucion " + r.getNombre());
		}
	}
	
	public static boolean verifica (LSVisitas a , String x)
	{
		NodoV w = a.getP();
		while(w!=null)
		{
			if(w.getNombre().equals(x)){
				return true;
			}
			w = w.getSig();
		}
		return false;
	}
}
