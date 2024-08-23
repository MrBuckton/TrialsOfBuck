package Programs1;

import java.util.Scanner;

public class OneToFive

{

    // Métodos dos exercícios...

    public static void retornaAreaQuadrado(Scanner scanner) {
        System.out.println("Vamos calcular a área de um quadrado juntos.");
        System.out.print("Digite o valor de um dos lados do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
    }

    public static void cmToM(Scanner scanner) {
        System.out.println("Vamos converter um valor de centímetros para metros!");
        System.out.print("Digite o tamanho em centímetros: ");
        double number1 = scanner.nextDouble();
        double metros = number1 / 100;
        System.out.println("Em metros isso é: " + metros);
    }

    public static void calculoBimestral(Scanner scanner) {
        System.out.println("Vamos fazer um cálculo da média bimestral.");
        System.out.print("Digite a nota do primeiro bimestre: ");
        double number1 = scanner.nextDouble();
        System.out.print("Digite a nota do segundo bimestre: ");
        double number2 = scanner.nextDouble();
        System.out.print("Digite a nota do terceiro bimestre: ");
        double number3 = scanner.nextDouble();
        System.out.print("Digite a nota do quarto bimestre: ");
        double number4 = scanner.nextDouble();
        double media = (number1 + number2 + number3 + number4) / 4; // Nome alterado para 'media'
        System.out.println("A média bimestral é: " + media);
    }

    public static void somaDeDois(Scanner scanner) {
        System.out.println("Vamos somar dois números!");
        System.out.print("Digite o primeiro número: ");
        double number1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double number2 = scanner.nextDouble();
        double soma = number1 + number2;
        System.out.println("A soma destes dois números é: " + soma);
    }

    public static void raioDoCirculo(Scanner scanner) {
        System.out.println("Vamos calcular o raio de um círculo.");
        System.out.print("Digite o valor do diâmetro/circunferência do círculo: ");
        double diametro = scanner.nextDouble();
        double raio = diametro / 2;
        double area = 3.14 * raio * raio;
        System.out.println("O raio do círculo é: " + raio);
        System.out.println("A área do círculo é: " + area);
    }


}
