import java.util.Scanner;
class Ex03{
    public static void main (String args[]){
         Scanner teclado = new Scanner(System.in);
         int a, b;
         String c;
         
         System.out.println("Insira uma frase: ");
         c = teclado.nextLine();
         
         System.out.println("Insira a posição inicial do corte: ");
         a = teclado.nextInt();
         
         System.out.println("Insira a posição final do corte: ");
         b = teclado.nextInt();
         
         System.out.println("Resultado: ");
         System.out.println(c.substring(a,b));
         
    }
}