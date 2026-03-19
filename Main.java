import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    float nota01, nota02, media;

    System.out.println("Digite a primeira nota: ");
    nota01 = sc.nextFloat();

    System.out.println("Digite a segunda nota: ");
    nota02 = sc.nextFloat();

    media = (nota01 + nota02) / 2;

    if(media >= 0 && media <= 10){
        if(media >= 6){
            System.out.println("Sua media e: " + media + " - Esta aprovado");
        } else {
             System.out.println("Sua media e: " + media + " - Esta Reprovado");
        }
    } else {
        System.out.println("Media invalida, cara palida");
    }
      

    }
}
