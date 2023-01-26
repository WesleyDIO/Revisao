package horario;
import java.util.Scanner;
public class horario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
         
        int hora;
        int minuto;
        
        System.out.println("Digite a hora a ser convertida: ");
        hora = entrada.nextInt();
        
        System.out.println("Digite os minutos a ser convertidos: ");
        minuto = entrada.nextInt();
        
       
         periodos(hora, minuto);
        
      }
	
	public static int periodos (int hora, int minuto) {
	    if(0 < hora && hora < 12) {
	    	
	    	System.out.println("A hora convertida ficará: "+hora+":"+minuto+" A ");
	    }else if( 12 < hora) {
	    	hora-=12;
	    	System.out.println("A hora convertida ficará: "+hora+":"+minuto+" P ");
	    }
	    else if(hora == 00) {
	    	hora+=12;
	    	System.out.println("A hora convertida ficará: "+hora+":"+minuto+" A ");
	    }
	    else if(hora == 12) {
	    	System.out.println("A hora convertida ficará: "+hora+":"+minuto+" P ");
	    }
	     return hora;
	}

}

