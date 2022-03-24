
public class S1213 {
/*Exercici 3. Escriu el codi per a generar i capturar una excepció
 * de tipus ArrayIndexOutOfBoundsException.  */
	public static void main(String[] args) {
		try{    
            System.out.println("try");  
            int myArray[]=new int[5];    
            myArray[5]=10/10;    
        } 
	    catch(ArrayIndexOutOfBoundsException e){
	        System.out.println(e);
	    }
	}

}
