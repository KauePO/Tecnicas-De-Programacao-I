import java.util.Scanner;
class Ex01{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double per;
        double dia;
        double raio;
        System.out.println("Digite o raio para calcular o perímetro e o diâmetro: ");
        raio = teclado.nextFloat();
        dia = 2*raio;
        per = 2*Math.PI*raio;
        System.out.println("Raio inserido: "+raio);
        System.out.println("Diâmetro: "+dia);
        System.out.println("Perímetro: "+per);
    }
}