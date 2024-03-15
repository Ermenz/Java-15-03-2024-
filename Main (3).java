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
    float [] num = new float[2];

     for (int i = 0; i < 2; i ++) {
         System.out.println("Digite:");
         num[i] = sc.nextFloat();
     }

    float soma = num[0] + num[1]; 

    float multiplicacao = num[0] * num[1]; 

    float divisao = num[0] / num[1]; 


   System.out.println(String.format("Soma %.2f", soma));
   System.out.println(String.format("multiplicação %.2f", multiplicacao));
   System.out.println(String.format("divisão %.2f", divisao));

	}
}
