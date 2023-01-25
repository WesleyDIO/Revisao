package sequência;
import java.util.Scanner;
public class sequencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o parâmetro n: ");
		n = entrada.nextInt();
		
		estrutura(n);
		
	}
	static void linha(char c, int n) {
		int i;
	      for (i=1; i<=n; i++) {
	        System.out.printf("%c", c);
	      }
	    }
	 static void estrutura(int n) {
		 int i, j;
		 System.out.printf("*"); linha('=', (4*n)+3); System.out.printf("*\n");
	      for (i=n; i>=0; i--) {
	        System.out.printf("* ");
	        for (j=1; j<=(n-i); j++) {
	          System.out.printf("  ");
	        }
	        for (j=1; j<=i; j++) {
	          System.out.printf("%d ", i);
	        }
	        System.out.printf("* ");
	        for (j=1; j<=i; j++) {
	          System.out.printf("%d ", i);
	        }
	        for (j=1; j<=(n-i); j++) {
	          System.out.printf("  ");
	        }
	        System.out.printf("*\n");
	      }
	      System.out.printf("*"); linha('-', (4*n)+3); System.out.printf("*");
	    }
}

