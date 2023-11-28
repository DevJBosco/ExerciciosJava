import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(+num+  "é positivo");
        } else if (num < 0) {
            System.out.println(+num +  "é negativo");
        }else{
            System.out.println("0 é neutro.");
        }
    }
}