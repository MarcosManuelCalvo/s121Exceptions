
public class S1211 {
/*
Exercici 1. Crea una classe amb un main() que generi un objecte de la classe Exception dins d'un bloc try-catch.
Proporciona al constructor de l'excepció un missatge especific. Captura l'excepció dins d'una clàusula catch i
imprimeix el seu missatge.
Afegeix una clàusula finally i imprimeix un missatge per a demostrar que va passar per allí.
*/
	public static void main(String[] args) {
		 try{  
	            System.out.println("Try");
	            int num=6/0;  
	            System.out.println(num);  
	      }  
	      catch(ArithmeticException e){
	    	  System.out.println("Catch");
	    	  System.out.println("ArithmeticException: nombre dividido por 0");
	      }  
	      finally{
	          System.out.println("Finally");
	      } 
	}

}
