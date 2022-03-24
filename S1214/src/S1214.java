
public class S1214 {
	/*Exercici 4. Crea la teva pròpia classe d'excepcions, heretant de la classe Exception.
	Utilitza el constructor d'aquesta classe per
	emmagatzemar dins Exception, el missatge personalitzat que farà servir aquesta excepció.
	Crea una clàusula try-catch per a provar la nova excepció. Captura i mostra el missatge emmagatzemat.
	Mostra també la classe de l'excepció.*/
	

	public static void main(String[] args)  throws MatesMalException{
		try{ 
	            System.out.println("Try");
	            int num=17;
	            int div =0;
	            if (div == 0) {
	            	throw new MatesMalException("Dividir por 0 es igual a infinito");
	            }
	            System.out.println("Try2");
	            num=num/div;
	            System.out.println(num);  
	     }  
	     catch(MatesMalException e){
	    	  System.out.println("Catch");  
	          System.out.println(e);
	     }     
	     finally{
	          System.out.println("Finally");
	     } 
	}
}

class MatesMalException extends Exception {
	public MatesMalException() {}
	public MatesMalException(String error){
		super(error);
	}
}
