import java.util.Scanner;
class Funcao15{
    public static void main (String arg[]){
        String A = "Estudante";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite alguma coisa estudante: ");
        String texto = teclado.nextLine();
        if(A.equals(texto))
        System.out.println("Você digitou Estudante!");
        else System.out.println("Você não digitou Estudante!");
    }
}