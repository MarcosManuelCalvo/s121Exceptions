import java.util.Scanner;

public class S1215 {
/*Exercici 5. Defineix un comportament "erroni" utilitzant un bucle
 'while' que es repeteixi fins que es deixi de generar una excepció.*/
	public static void main(String[] args)  throws MatesMalException{
		boolean fi  = true;
		int div =0;
		while(fi) {
		
			try{
				System.out.println("Try");
				int num=17;
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
				fi = preguntaBin("continuar el bucle while? s/n");
			} 
		}
	}
	public static boolean preguntaBin(String frase) {
		System.out.println(frase);
		Scanner sc  =  new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c!='n' && c!='s') {
			System.out.print("error input. \n");
		}
		return 's' == c;
	}
}

class MatesMalException extends Exception {
	public MatesMalException() {}
	public MatesMalException(String error){
		super(error);
	}
}

