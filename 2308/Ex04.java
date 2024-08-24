import java.util.Scanner;
class Ex04{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        String nome;
        
        System.out.println("Insira seu nome completo:");
        nome = teclado.nextLine();
        
        String[] sN = nome.split(" ");
        
        System.out.println("Nome: " +sN[0]);
        
        if (sN.length > 1){
            System.out.println("Sobrenome(s): ");
            for (int i = 1; i < sN.length; i++){
                System.out.println(sN[i]);
            }
        }else {
            System.out.println("Sobrenome(s): Não inseridos");
        }
    }
}