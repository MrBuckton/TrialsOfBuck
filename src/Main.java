import java.util.Scanner;

import static Programs1.ElevenToFifteen.*;
import static Programs1.FiveToTen.*;
import static Programs1.OneToFive.*;
import static Programs1.SixteenToTwenty.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha um exercício para executar:");
            System.out.println("1.  Calcular a área de um quadrado");
            System.out.println("2.  Converter centímetros para metros");
            System.out.println("3.  Calcular a média de notas bimestrais");
            System.out.println("4.  Somar dois números fornecidos pelo usuário");
            System.out.println("5.  Calcular o raio e a área de um círculo a partir do diâmetro");
            System.out.println("6.  Calcular o salário bruto mensal com base na hora trabalhada");
            System.out.println("7.  Converter temperatura de Fahrenheit para Celsius");
            System.out.println("8.  Converter temperatura de Celsius para Fahrenheit");
            System.out.println("9.  Realizar operações matemáticas com números inteiros e reais");
            System.out.println("10. Calcular o peso ideal com base na altura");
            System.out.println("11. Calcular o peso ideal por gênero com base na altura");
            System.out.println("12. Calcular a multa por excesso de peso de peixe");
            System.out.println("13. Calcular o salário líquido após descontos de impostos");
            System.out.println("14. Calcular a quantidade de latas de tinta necessárias por M² e o custo total");
            System.out.println("15. Calcular a quantidade de latas e galões de tinta necessários por M² e o custo total");
            System.out.println("17. Descobrir qual o maior número dentre os dois digitados");
            System.out.println("18. Este número é positivo ou negativo?");
            System.out.println("19. Verificador de Feminino ou Masculino");
            System.out.println("20. Verificador de Vogais");

            System.out.println("0.  Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    retornaAreaQuadrado(scanner);
                    break;
                case 2:
                    cmToM(scanner);
                    break;
                case 3:
                    calculoBimestral(scanner);
                    break;
                case 4:
                    somaDeDois(scanner);
                    break;
                case 5:
                    raioDoCirculo(scanner);
                    break;
                case 6:
                    calculoSalarial(scanner);
                    break;
                case 7:
                    fahrenheitParaCelsius(scanner);
                    break;
                case 8:
                    celsiusParaFahrenheit(scanner);
                    break;
                case 9:
                    matematicaDoida(scanner);
                    break;
                case 10:
                    calculoPesoIdeal(scanner);
                    break;
                case 11:
                    calculoPesoIdealParaHomemOuMulher(scanner);
                    break;
                case 12:
                    calculoDeMultaDePeixe(scanner);
                    break;
                case 13:
                    calculoDeSalarioLiquido(scanner);
                    break;
                case 14:
                    calculadoraDeLatasDeTinta(scanner);
                    break;
                case 15:
                    calculadoraDeLatasDeTintaEgalao(scanner);
                    break;
                case 17:
                    oMaiorValorDeDois(scanner);
                    break;
                case 18:
                    positivoOuNegativo(scanner);
                    break;
                case 19:
                    verificaSexo(scanner);
                    break;
                case 20:
                    verificaVogal (scanner);
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            if (continuar) {
                System.out.println("\nDeseja escolher outro exercício? (s/n)");
                String resposta = scanner.next();
                continuar = resposta.equalsIgnoreCase("s");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}