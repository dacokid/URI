import java.util.Scanner;


public class lista_ocorr {
	
	public static void main(String[] args) {
		int n;
		int m;
		int tam = 0;
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		m = entrada.nextInt();
		int dados[] = new int[n];
		for(int i = 0; i < n; i++) {
			int valor = entrada.nextInt();
			dados[tam] = valor;
			tam++;
		}
		
		for(int i = 0; i < m; i++) {
			int aux = 0;
			int indice = 0;
			int ocor = entrada.nextInt();
			int val = entrada.nextInt();
			for(int x = 0; x < n; x++) {
				if(dados[x] == val) {
					aux++;
					if(aux == ocor) {
						indice = x+1;
						break;
					} 
				}
			}
			
			if(aux != ocor) {
				System.out.println("0");
			} else System.out.println(indice);
		}
	}
}
