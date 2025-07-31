import java.util.Scanner;
public class exerc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double trapezio, Bmaior, Bmenor, altura;

        System.out.println("digite a base maior: ");
        Bmaior = scan.nextDouble();
        System.out.println("digite a base menor: ");
        Bmenor = scan.nextDouble();
        System.out.println("digite a altura: ");
        altura = scan.nextDouble();

        trapezio = (Bmaior+Bmenor) * altura / 2;
        System.out.printf("A area do trapézio é: %.2f",trapezio); // printf formata as muitas casas, %.2f respeita as 2 casas depois da virgula

        scan.close();
    }
}
//2. Faça um programa para calcular a área do trapézio. lembrando que:
//Área do trapézio = (Base Maior + Base Menor) x Altura / 2