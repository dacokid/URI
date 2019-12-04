import java.util.Scanner;

public class lista_ocorr {
	
    public static void main(String[] args) {
	int n;
	int m;
	Scanner entrada = new Scanner(System.in);
        do{
            int tam = 0;
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
		int k = entrada.nextInt(); // ocorr
		int v = entrada.nextInt(); //valor
		for(int x = 0; x < n; x++) {
                    if(dados[x] == v) {
                        aux++;
                        if(aux == k) {
                            indice = x+1;
                            break;
			} 
                    }
		}
			
		if(aux != k) {
                    System.out.println("0");
		} else System.out.println(indice);
            }
        } while(entrada.hasNextLine());
    }
}
