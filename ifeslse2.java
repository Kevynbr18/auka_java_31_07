import java.util.Scanner;

public class ifeslse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade: ");
        idade = scan.nextInt();

        if (idade>=18 && idade<=70){
            System.out.println("Deve votar");
        } else if (idade >=16 && idade<18 || idade>70) {
            System.out.println("Voto facultativo");
        }else {
            System.out.println("Não pode votar");
        }

        scan.close();
    }
}
