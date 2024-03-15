/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

    	
    
    	System.out.println("Informe o valor de x"); 
	  int  x = sc.nextInt();
   

      System.out.println("Informe o valor de y");
	  int  y = sc.nextInt();
	    
	float resultado1 = x - 2*x + 3*x - 4*x; 

	float resultado2 = 2*y + 4*y - 3*y - 8*y - 4/y;
	
	 System.out.println(String.format("Resultado da primeira expressão : %.2f", resultado1));
	  System.out.println(String.format("Resultado da segunda expressão : %.2f", resultado2));
	
	}
}
