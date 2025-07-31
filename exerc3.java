import java.util.Scanner;
public class exerc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float reais, CotDolar, converter;


        System.out.println("digite a dinheiro em reais: ");
        reais = scan.nextFloat();
        System.out.println("digite a cotação do dolar: ");
        CotDolar = scan.nextFloat();

        converter = (reais * CotDolar);

        System.out.println("A converção de "+ reais+ "em dolar é: "+ converter);


        scan.close();
    }
}
//3. Desenvolva um programa que peça ao usuário um valor em reais e a
//cotação do dólar. O programa deve converter o valor informado para
//dólares e exibir o resultado formatado com duas casas decimais.