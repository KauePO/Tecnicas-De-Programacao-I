import java.util.Scanner;
class Ex02{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, x1, x2;
        
        System.out.println("Insira o valor de A: ");
        A= teclado.nextInt();
        System.out.println("Insira o valor de B: ");
        B= teclado.nextInt();
        System.out.println("Insira o valor de C: ");
        C= teclado.nextInt();
        
        x1= (-B+Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;
        x2= (-B-Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;
        
        System.out.println("As raízes são: "+ x1+" e "+ x2);
    }
}