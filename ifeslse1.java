import java.util.Scanner;

public class ifeslse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float notas = 0,media;

        System.out.println("informe 3 notas");
        for(int i=1; i<=3; i++){
            System.out.println("digite nota "+i+":");
            notas = notas + scan.nextFloat();

        }

        media = notas / 3;
        System.out.println("A média do aluno é de: " + media);
       if (media>5.0){
           System.out.println("A média é maior que 5.0, APROVADO!!!!");
       }else{
           System.out.println("A média é menor que 5.0, REPROVADO!!!!'");
       }

        scan.close();
    }
}
