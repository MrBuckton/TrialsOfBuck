import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        retornaAreaQuadrado(scanner);
        cmToM(scanner);
        calculoBimestral(scanner);
        somaDeDois(scanner);
        raioDoCirculo(scanner);
        calculoSalarial(scanner);
        fahrenheitParaCelsius(scanner);
        celsiusParaFahrenheit(scanner);
        matematicaDoida(scanner);
        calculoPesoIdeal(scanner);
        scanner.close();
    }

    private static void retornaAreaQuadrado(Scanner scanner) {
        System.out.println("Olá! Tudo bom? Vamos calcular a área de um quadrado juntos.");
        System.out.print("Digite o valor de um dos lados do quadrado: "); // Pede que o usuário insira o valor.

        double lado = scanner.nextDouble(); // Lê o valor digitado pelo usuário.
        double area = lado * lado; // Calcula a área do quadrado multiplicando lado por lado.
        System.out.println("A área do quadrado é: " + area); // Mostra a área.
    }

    public static void cmToM(Scanner scanner) { // Método.
        System.out.println("Agora vamos converter um valor de centímetros para metros!");
        System.out.print("Digite o tamanho em centímetros: "); // Gerar input pro usuário.
        double number1 = scanner.nextDouble(); // Lê o valor digitado pelo usuário como double.
        double metros = number1 / 100; // Aqui se faz o cálculo.
        System.out.println("Em metros isso é: " + metros); // Aqui exibe o resultado.
    }

    public static void calculoBimestral(Scanner scanner) { // Método.
        System.out.println("Agora vamos fazer um cálculo da média bimestral.");
        System.out.print("Digite a nota do primeiro bimestre: "); // Gerar input pro usuário.
        double number1 = scanner.nextDouble(); // Parte 2 de "Gerar input pro usuário".
        System.out.print("Digite a nota do segundo bimestre: "); // Gerar mais um input pro usuário.
        double number2 = scanner.nextDouble(); // Parte 2 de "Gerar mais um input pro usuário".
        System.out.print("Digite a nota do terceiro bimestre: "); // Gerar input pro usuário.
        double number3 = scanner.nextDouble(); // Parte 2 de "Gerar input pro usuário".
        System.out.print("Digite a nota do quarto bimestre: "); // Gerar mais um input pro usuário.
        double number4 = scanner.nextDouble(); // Parte 2 de "Gerar mais um input pro usuário".
        double soma = (number1 + number2 + number3 + number4) / 4; // Aqui se faz o cálculo.
        System.out.println("A média bimestral é: " + soma); // Aqui exibe o resultado.
    }

    public static void somaDeDois(Scanner scanner) { // Método.
        System.out.println("Que tal algo bem simples? Vamos somar dois números!");
        System.out.print("Digite o primeiro número: "); // Gerar input pro usuário.
        double number1 = scanner.nextDouble(); // Parte 2 de "Gerar input pro usuário".
        System.out.print("Digite outro número: "); // Gerar mais um input pro usuário.
        double number2 = scanner.nextDouble(); // Parte 2 de "Gerar mais um input pro usuário".
        double soma = number1 + number2; // Aqui se faz o cálculo.
        System.out.println("A soma destes dois números é: " + soma); // Aqui exibe o resultado.
    }

    public static void raioDoCirculo(Scanner scanner) { // Método.
        System.out.println("Agora vamos calcular o raio de um círculo.");
        System.out.print("Digite o valor do diâmetro/circunferência do círculo: "); // Pede que o usuário insira o valor.
        double diametro = scanner.nextDouble(); // Lê o valor digitado pelo usuário.
        double raio = diametro / 2; // Calcula o raio dividindo o diâmetro por 2.
        // Calcula a área usando a fórmula pi * raio^2.
        double area = 3.14 * raio * raio; // 3.14 é o valor aproximado de pi.
        System.out.println("O raio do círculo é: " + raio); // Mostra o raio.
        System.out.println("A área do círculo é: " + area); // Mostra a área.
    }

    public static void calculoSalarial(Scanner scanner) {
        System.out.println("Vamos calcular qual seu salário mensal?");
            System.out.print("Digite quanto você ganha por hora: ");
            double valorPorHora = scanner.nextDouble();
            System.out.print("Digite quantas horas você trabalha por mês: ");
            double horasPorMes = scanner.nextDouble();
            double salarioMensal = valorPorHora * horasPorMes;
            System.out.println("O total do seu salário no referido mês é de: R$ " + salarioMensal);

    }

    public static void fahrenheitParaCelsius(Scanner scanner) {
        System.out.println("Agora iremos calcular de Fahrenheit para Celsius!");
            System.out.print("Digite a temperatura em Farenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.println("Isto em Celcius é: " + celsius);

    }

    public static void celsiusParaFahrenheit(Scanner scanner) {
        System.out.println("Dessa vez é o contrário, de Celsius para Fahrenheit!");
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println("Isto em Fahrenheit é: " + fahrenheit);

    }

    public static void matematicaDoida(Scanner scanner) {
        System.out.println("Isso dá um nó na cabeça, mas vamos calcular o seguinte: ");
        System.out.println("Vamos calcular três valores a partir de números que você fornecer: ");
            System.out.print("Digite o primeiro número inteiro: ");
            int numInt1 = scanner.nextInt();
            System.out.print("Digite o segundo número inteiro: ");
            int numInt2 = scanner.nextInt();
            System.out.print("Digite um número real: ");
            double numReal = scanner.nextDouble();
            int produto = (2 * numInt1)*(numInt2/2);
            System.out.println("Hora dos resultados!");
            System.out.println("O produto do dobro do primeiro com metade do segundo é de: " + produto);
            double soma = (3 * numInt1) * (numReal);
            System.out.println("A soma do triplo do primeiro com o terceiro é " + soma);
            double cubo = numReal * numReal * numReal;
            System.out.println("O terceiro elevado ao cubo é: " + cubo);

    }

    public static void calculoPesoIdeal(Scanner scanner){
        System.out.println("Agora vamos descobrir o seu peso ideal! ");
            System.out.print("Digite a altura em metros (Ex.: 1,75): ");
            double altura = scanner.nextDouble();
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Pra sua altura de " + altura + ", seu peso ideal deve ser: " + pesoIdeal);
    }

}
