import java.util.Scanner;

public class Teclado {
	Scanner tc = new Scanner(System.in);
	public int lerint(){
		System.out.println("Digite um inteiro: ");
		return tc.nextInt();
	}
	
	public void lerint(int b){
		System.out.println("Digite um inteiro: ");
		b=tc.nextInt();
	}
	
	public void lerint(String a, int b){
		System.out.println(a);
		b= tc.nextInt();
	}
	
	
	public int lerint(String a){
		System.out.println(a);
		return tc.nextInt();
	}
	
	public float lerfloat(){
		System.out.println("Digite um tipo float: ");
		return tc.nextFloat();	
	}
	
	public void lerfloat(float b){
		System.out.println("Digite um tipo de float: ");
		b= tc.nextFloat();
	}
	
	public void lerfloat(String a, float b){
		System.out.println(a);
		b=tc.nextFloat();
	}
	
	public float lerfloat(String a){
		System.out.println(a);
		return tc.nextFloat();
	}
	
	public String lerchar(){
		System.out.println("Digite um tipo caracter: ");
		return tc.next();
	}
	
	public void lerchar(String b){
		System.out.println("Digite um tipo caracter: ");
		b=tc.next();
		
	}
	
	public void lerchar(String a, String b){
		System.out.println(a);
		b=tc.next();
	}
	
	public String lerchar1(String a){
		System.out.println(a);
		return tc.next();
	}
	
	public double lerdouble(){
		System.out.println("Digite um tipo double: ");
		return tc.nextDouble();
	}
	
	public void lerdouble(double b){
		System.out.println("Digite um tipo double: ");
		b=tc.nextDouble();
	}
	
	public void lerdouble(String a, double b){
		System.out.println(a);
		b=tc.nextDouble();
	}
	
	public double lerdouble(String a){
		System.out.println(a);
		return tc.nextDouble();
	}
	

}
