import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float [] num = new float[3];

     for (int i = 0; i < 3; i ++) {
         System.out.println("Digite:");
         num[i] = sc.nextFloat();
     }

  float media =  (num[0] + num[1] + num[2])/3;
  
   System.out.println(String.format("Media do aluno: %.2f", media));
   
  if(media >= 7) {
     System.out.println("Aluno aprovado"); 
  } else if (media >= 4) {
      System.out.println("Aluno reprovado com direito a recuperação"); 
  } else{ 
      System.out.println("Aluno reprovado sem direito a recuperação"); 
  }
  
  
   

	}
}