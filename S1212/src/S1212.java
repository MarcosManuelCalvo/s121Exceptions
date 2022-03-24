
public class S1212 {
	/*Exercici 2. Defineix una referència a un objecte i inicialitza-la amb null.
	 * Tracta d'invocar un mètode a través d'aquesta referència.
	 * Ara envolta el codi amb una clàusula try-catch per a capturar l'excepció.
	 * Mostra el missatge i el tipus d'excepció.*/
	public static void main(String[] args) {
		String alt = null;
		 try{  
	            System.out.println("Try");
	            alt.charAt(0) ; 
	      }  
	      catch(NullPointerException e){
	    	  System.out.println("Catch");
	    	  System.out.println("NullPointerException");
	    	  System.out.println(e);
	      }   
	      finally{
	          System.out.println("Finally");
	      }  
		
		
	}
}
