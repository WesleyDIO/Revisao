import java.util.Scanner;
public class criptografia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner entrada = new Scanner (System.in);
     
     String texto="";
     int n;
      
     System.out.println("Digite o texto a ser criptografado:");
     texto = entrada.nextLine();
     System.out.println("Digite a chave de deslocamento: ");
     n = entrada.nextInt();
     
     criptografia(n, texto);
     
     System.out.println("O texto criptografado é "+ criptografia(n,texto));
	}
	public static String criptografia(int n, String texto) {
		StringBuilder textoCifrado = new StringBuilder();
		int tamanho = texto.length();
		for( int i = 0; i < tamanho; i++) {
			int letraCifrada = ((int ) texto.charAt(i))+n;
			while (letraCifrada > 126) {
				letraCifrada -= 94;
			}
			textoCifrado.append((char)letraCifrada);
		}
		return textoCifrado.toString();
	}

}

