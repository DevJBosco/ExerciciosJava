//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Boa tardi");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double numero1  = entrada.nextDouble();
        System.out.println("Digite o segundo número");
        double numero2 = entrada.nextDouble();
        System.out.println("Deseja realizar qual operação? 1 = soma 2  = subtração 3 = divisão 4 =multiplicação? ");
        int  escolha = entrada.nextInt();
        double resultado = 0;
        if (escolha == 1) {
        resultado = numero1+numero2;
        }
        if (escolha == 2) {
            resultado = numero1 - numero2;
        }
        if (escolha == 3) {
            resultado = numero1/numero2;
        }
        if (escolha == 4) {
            resultado = numero1*numero2;
        }
        System.out.printf("O resultado é igual á:" +resultado);

        }

    }
