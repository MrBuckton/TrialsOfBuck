import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        retornaAreaQuadrado();
    }

    private static void retornaAreaQuadrado() {
        Scanner scanner = new Scanner(System.in); // Ferramenta importada input de usuário.
        System.out.print("Digite o valor de um dos lados do quadrado: "); // Pede que o usuário insira o valor.
        double lado = scanner.nextDouble(); // Lê o valor digitado pelo usuário.
        double area = lado * lado; // Calcula a área do quadrado multiplicando lado por lado.
        System.out.println("a área do quadrado é: " + area); // Mostra a area.

        scanner.close(); //Fecha.
    }
}