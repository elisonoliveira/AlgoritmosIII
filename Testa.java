import java.util.Scanner;


public class Testa {
	public static void main(String[] args) {
		Teclado tc = new Teclado();
		int x = 0;
		String y;
		float w = 0;
		double j = 0;
		
		x=tc.lerint();
		System.out.println("O numero digitado é "+x+"");
		
		tc.lerint(5);
		
		tc.lerint("teste int1", 5);
		
		x=tc.lerint("teste int2");
		System.out.println("O numero digitado é "+x+"");
		
		///////
		
		y=tc.lerchar();
		System.out.println("O caracter digitado é: "+y+"");
		
		tc.lerchar("caracter");
		
		tc.lerchar("teste char1", "teste");
		
		y=tc.lerchar1("teste char2");
		System.out.println("O caracter digitado é: "+y+"");
		
		///////
		
		w=tc.lerfloat();
		System.out.println("O float digitado é: "+w+"");
		
		tc.lerfloat(7);
		
		tc.lerfloat("teste float1", 4);
		
		w=tc.lerfloat("teste float2");
		System.out.println("O float digitado é: "+w+"");
		
		j=tc.lerdouble();
		System.out.println("O double digitado é: "+j+"");
		
		tc.lerdouble(78);
		
		tc.lerdouble("Teste double1", 36);
		
		j=tc.lerdouble("teste double2");
		System.out.println("O double digitado é: "+j+"");
	}
	
	

}
