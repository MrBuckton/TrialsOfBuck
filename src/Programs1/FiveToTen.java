package Programs1;

import java.util.Scanner;

public class FiveToTen

{


    public static void calculoSalarial(Scanner scanner) {
        System.out.println("Vamos calcular um salário mensal");
        System.out.print("Digite quanto a pessoa ganha por hora: ");
        double valorPorHora = scanner.nextDouble();
        System.out.print("Digite quantas horas a pessoa trabalha por mês: ");
        double horasPorMes = scanner.nextDouble();
        double salarioMensal = valorPorHora * horasPorMes;
        System.out.println("O total seu salário no mês é de: R$ " + salarioMensal);

    }

    public static void fahrenheitParaCelsius(Scanner scanner) {
        System.out.println("Vamos converter de Fahrenheit para Celsius");
        System.out.print("Digite a temperatura em Farenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.println("Isso em Celcius é: " + celsius);
    }

    public static void celsiusParaFahrenheit(Scanner scanner) {
        System.out.println("Vamos converter de Celsius para Fahrenheit");
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Isto em Fahrenheit é: " + fahrenheit);
    }

    public static void matematicaDoida(Scanner scanner) {
        System.out.println("Isso dá um nó na cabeça, mas vamos fazer o seguinte: ");
        System.out.println("Vamos calcular três valores a partir de números que você fornecer: ");
        System.out.print("Digite o primeiro número inteiro: ");
        int numInt1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numInt2 = scanner.nextInt();
        System.out.print("Digite um número real: ");
        double numReal = scanner.nextDouble();
        int produto = (2 * numInt1) * (numInt2 / 2);
        System.out.println("Hora dos resultados!");
        System.out.println("O produto do dobro do primeiro com metade do segundo é de: " + produto);
        double soma = (3 * numInt1) * (numReal);
        System.out.println("A soma do triplo do primeiro com o terceiro é " + soma);
        double cubo = numReal * numReal * numReal;
        System.out.println("O terceiro elevado ao cubo é: " + cubo);
    }

    public static void calculoPesoIdeal(Scanner scanner) {
        System.out.println("Agora vamos descobrir o peso ideal baseado na altura que você escolher. ");
        System.out.print("Digite a altura em metros (Ex.: 1,75): ");
        double altura = scanner.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Pra sua altura de " + altura + ", seu peso ideal deve ser: " + pesoIdeal);
    }


}
