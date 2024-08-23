package Programs1;

import java.util.Scanner;

public class SixteenToTwenty {


    public static void oMaiorValorDeDois(Scanner scanner) {

        System.out.print("Digite um número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite um outro número: ");
        double numero2 = scanner.nextDouble();

        //comparação e impressão do maior número
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Qual a razão de colocar dois números iguais e querer saber qual o maior deles?");
        }
    }

    public static void positivoOuNegativo(Scanner scanner) {

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        //Verificando se o valor é positivo, negativo ou zero
        if (valor > 0) {
            System.out.println("Este número é positivo.");
        } else if (valor < 0) {
            System.out.println("Este número é negativo");
        } else {
            System.out.println("Então... Isso é Zero, né... Não é positivo nem negativo.");
        }
    }

    public static void verificaSexo(Scanner scanner) {
        char sexo;
        boolean entradaValida = false;

        while (!entradaValida) { // no Java o "!" representa negação.
            //Usado para garantir que o loop continue executando enquanto a entrada do usuário não for válida.

            System.out.print("Digite o sexo (F para feminino, M para masculino): ");
            sexo = scanner.next().charAt(0);

            if (sexo == 'F' || sexo == 'f') {
                System.out.println("Feminino");
                entradaValida = true;
            } else if (sexo == 'M' || sexo == 'm') {
                System.out.println("Masculino");
                entradaValida = true;
            } else {
                System.out.println("Só existem 2 gêneros/sexos e este não é um deles.\nTente novamente.");
            }
        }
    }

    public static void verificaVogal (Scanner scanner) {

        // usuário insere uma letra
        System.out.print("Digite uma letra: ");
        char letter = scanner.next().charAt(0);

        // converte a letra pra minúscula
        letter = Character.toLowerCase(letter);

        // verifica se a letra é vogal
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("A letra " + letter + " é uma vogal.");
        } else {
            System.out.println("A letra " + letter + " não é uma vogal.");
        }
    }

}
