import java.util.Scanner;

public class DesafioCodigo {
    
        public static void main(String[] args) {
          
         Scanner leitor = new Scanner(System.in);
         
          System.out.println("Digite um valor para A :");
          int A = leitor.nextInt();
          
          System.out.println("Digite um valor para B :");
          int B = leitor.nextInt();
          
          //comparacao
          
          if(A == B)
          System.out.println("São iguais!");
          
          else
          System.out.println("Nao sao iguais!");
          
          
        }
    }
