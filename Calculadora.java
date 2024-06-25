import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);

        int subtracao = num1 - num2;
        System.out.println("A subtração é: " + subtracao);

        int multiplicacao = num1 * num2;
        System.out.println("A multiplicação é: " + multiplicacao);

        int divisao = num1 / num2;
        System.out.println("A divisão é: " + divisao);

        int resto = num1 % num2;
        System.out.println("O resto é: " + resto);
    }
}