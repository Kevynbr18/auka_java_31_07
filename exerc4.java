import java.util.Scanner;
public class exerc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String estudante;
        double notas = 0, media, calculo;


        System.out.println("digite o nome do estudante: ");
        estudante = scan.nextLine();

        for(int i=1; i<=3; i++){
            System.out.println("digite nota "+i+":");
            notas = notas + scan.nextDouble();

        }

        calculo = notas / 3;
        System.out.println("O "+estudante+" com media: "+ calculo);
        scan.close();
    }
}
//4. Crie um programa que receba o nome de um estudante e três notas
//(valores decimais). O programa deve calcular a média aritmética das notas
//e exibir uma mensagem no console com o nome do estudante e a média
//calculada.