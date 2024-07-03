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
        scanner.close();
    }

    private static void retornaAreaQuadrado(Scanner scanner) {
        System.out.print("Digite o valor de um dos lados do quadrado: "); // Pede que o usuário insira o valor.
        double lado = scanner.nextDouble(); // Lê o valor digitado pelo usuário.
        double area = lado * lado; // Calcula a área do quadrado multiplicando lado por lado.
        System.out.println("A área do quadrado é: " + area); // Mostra a área.
    }

    public static void cmToM(Scanner scanner) { // Método.
        System.out.print("Digite o tamanho em centímetros: "); // Gerar input pro usuário.
        double number1 = scanner.nextDouble(); // Lê o valor digitado pelo usuário como double.
        double metros = number1 / 100; // Aqui se faz o cálculo.
        System.out.println("Em metros isso é: " + metros); // Aqui exibe o resultado.
    }

    public static void calculoBimestral(Scanner scanner) { // Método.
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
        System.out.print("Digite o primeiro número: "); // Gerar input pro usuário.
        int number1 = scanner.nextInt(); // Parte 2 de "Gerar input pro usuário".
        System.out.print("Digite outro número: "); // Gerar mais um input pro usuário.
        int number2 = scanner.nextInt(); // Parte 2 de "Gerar mais um input pro usuário".
        int soma = number1 + number2; // Aqui se faz o cálculo.
        System.out.println("A soma destes dois números é: " + soma); // Aqui exibe o resultado.
    }

    public static void raioDoCirculo(Scanner scanner) { // Método.
        System.out.print("Digite o valor do diâmetro/circunferência: "); // Pede que o usuário insira o valor.
        double diametro = scanner.nextDouble(); // Lê o valor digitado pelo usuário.
        double raio = diametro / 2; // Calcula o raio dividindo o diâmetro por 2.
        // Calcula a área usando a fórmula pi * raio^2.
        double area = 3.14 * raio * raio; // 3.14 é o valor aproximado de pi.
        System.out.println("O raio do círculo é: " + raio); // Mostra o raio.
        System.out.println("A área do círculo é: " + area); // Mostra a área.
    }
}
