import java.util.Scanner;

public class lista_vetor {
	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		int par[] = new int[5];
		int impar[] = new int[5];
		int tamP = 0;
		int tamI = 0;
	
		for(int i = 0; i < 15; i++) {
			int valor = entrada.nextInt();
			if(valor % 2 == 0) {
				par[tamP] = valor;
				tamP++;
			} else {
				impar[tamI] = valor;
				tamI++;
			}
			
			if(tamP == 5) {
				for(int x = 0; x < 5; x++) {
					System.out.println("par[" + x + "] = " + par[x]);
				}
				
				tamP = 0;
				par = new int[5];
			}
			if(tamI == 5) {
				for(int x = 0; x < 5; x++) {
					System.out.println("impar[" + x + "] = " + impar[x]);
				}
				
				tamI = 0;
				impar = new int[5];
			}
		}
		
		for(int i = 0; i < impar.length; i++) {
			if(impar[i] != 0) {
				System.out.println("impar[" + i + "] = " + impar[i]);
			}
		}
		
		for(int i = 0; i < par.length; i++) {
			if(par[i] != 0) {
				System.out.println("par[" + i + "] = " + par[i]);
			}
		}
	}
}
