
	public  class Que_ace { 
		 
	    int a;// por estar declarada aqu�, fuera de cualquier m�todo; a es un 
	            // atributo de la clase. Por lo tanto, es accesible y visible desde 
	            // todos los m�todos de la clase 
	 
	    void metodo() { 
	        System.out.println(a); // this.a
	        a++; // equivalente --> a = a + 1;// this.a++ 
	    } 
	 
	    public static void main(String args[]) { 
	        Que_ace qh1 = null; 
	        Que_ace qh2 = null; 
	 
	        qh1 = new Que_ace(); 
	 
	        qh1.metodo(); //vale 0
	        qh1.metodo(); //vale 1
	        qh1.a = 33; //le asignamos 33 como si fuese un this 
	        qh1.metodo(); // 33 
	        System.out.println(qh1.a);//vale 34 porque es como si fuera this.a ++ en el metodo
	        qh2=qh1;//no peta porque
	        qh2.metodo(); //muestra 34
	 
	    } 
	 
	}


