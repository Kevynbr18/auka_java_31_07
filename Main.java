import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int antecesor;
        int sucessor;

        System.out.println("Digite um numero:  ");
        numero = scan.nextInt();

        antecesor = numero - 1;
        sucessor = numero + 1;

        System.out.printf("o sucessor de "+ numero+" é: %d \n ",sucessor);
        System.out.printf("o antecessor de "+ numero+" é: %d \n ",antecesor);
        scan.close();

    }
}