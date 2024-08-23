package Programs1;

import java.util.Scanner;

public class ElevenToFifteen {


    public static void calculoPesoIdealParaHomemOuMulher(Scanner scanner) {
        System.out.println("Dependendo do seu gênero, seu peso ideal pode ser diferente.");
        //perguntar o gênero do usuário
        System.out.println("Escreva o que você é, homem ou mulher. ");
        String genero = scanner.next();

        double pesoIdealPorGenero;

        if (genero.equalsIgnoreCase("masculino") || genero.equalsIgnoreCase("homem")) {
            // Cálculo para homens
            System.out.println("Certo, você nasceu com genes XY, então você é homem.");
            System.out.print("Digite sua altura em metros (Ex.: 1,75): ");
            double altura = scanner.nextDouble();
            pesoIdealPorGenero = (72.7 * altura) - 58;
            System.out.print("Seu peso ideal é de: " + pesoIdealPorGenero + " KG");

        } else if (genero.equalsIgnoreCase("feminino") || genero.equalsIgnoreCase("mulher")) {
            System.out.println("Certo, você nasceu com os genes XX, então você é mulher.");
            System.out.print("Digite sua altura em metros (Ex.: 1,65): ");
            double altura = scanner.nextDouble();
            pesoIdealPorGenero = (62.1 * altura) - 44.7;
            System.out.print("Seu peso ideal é de: " + pesoIdealPorGenero + " KG");

        } else {
            System.out.println("Esse gênero que você escreveu não existe, escreva um que exista.");
        }

    }
    //Exercicio 012
    //João Papo-de-Pescador, homem de bem, comprou um microcomputador
    //para controlar o rendimento diário de seu trabalho.
    //Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento
    // de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
    //João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
    //Gravar na variável excesso a quantidade de quilos além do limite e na variável multa
    // o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

    public static void calculoDeMultaDePeixe(Scanner scanner) {
        final double LIMITE_PESO = 50.0;
        final double MULTA_POR_KG = 4.0;

        //pedindo peso dos peixes como uma String
        System.out.print("Digite o peso dos peixes em KG: ");
        String pesoStrig = scanner.next().replace(",", ".");

        try {
            double pesoDosPeixes = Double.parseDouble(pesoStrig);

            //Calculando o excesso da multa
            double excesso = pesoDosPeixes > LIMITE_PESO ? pesoDosPeixes - LIMITE_PESO : 0;
            double multa = excesso * MULTA_POR_KG;

            //Mostrando o resultado
            System.out.printf("Peso dos peixes: %.2f kg%n", pesoDosPeixes);
            System.out.printf("Excesso de peso: %.2f kg%n", excesso);
            System.out.printf("Multa a pagar: R$ %.2f%n", multa);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número válido.");
        }
    }

    //Exercicio 013
    //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    //Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11%
    // para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê: salário bruto.
    // Quanto pagou ao INSS. quanto pagou ao sindicato. o salário líquido. calcule os descontos e o salário líquido,
    // conforme a tabela abaixo:
    //+ Salário Bruto : R$
    //- IR (11%) : R$
    //- INSS (8%) : R$
    //- Sindicato ( 5%) : R$
    //= Salário Liquido : R$
    //Obs.: Salário Bruto - Descontos = Salário Líquido.

    public static void calculoDeSalarioLiquido(Scanner scanner) {

        System.out.print("Digite quanto a pessoa ganha por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Digite quantas horas a pessoa trabalha por mês: ");
        double horasPorMes = scanner.nextDouble();

        //calculo do salário por mês
        double salarioBruto = valorPorHora * horasPorMes;

        //calculando descontos
        double inss = salarioBruto * 0.08; // 8% de roubo pelo INSS
        double sindicato = salarioBruto * 0.05; // 5% pra sustentar vagabundo sindicalista
        double ir = salarioBruto * 0.11; // 11% pra Janja comprar avião novo com Imposto de Renda alheio.

        //Calculando salário líquido
        double salarioLiquido = salarioBruto - inss - sindicato - ir;

        System.out.printf("+ Salário Bruto:   R$ %.2f%n", salarioBruto);
        System.out.printf("- IR        (11%%): R$ %.2f%n", ir);
        System.out.printf("- INSS      (8%%):  R$ %.2f%n", inss);
        System.out.printf("- Sindicato (5%%):  R$ %.2f%n", sindicato);
        System.out.printf("= Salário Líquido: R$ %.2f%n", salarioLiquido);
    }

//Exercicio 014
//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
//
//Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
//
//Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

    public static void calculadoraDeLatasDeTinta(Scanner scanner) {

        //informações do problema
        final double COBERTURA_POR_LITRO = 3.0; // 1 litro para cada 3 metros quadrados
        final int TAMANHO_LATA = 18; // Tinta vendida em latas de 18 litros
        final double PRECO_LATA = 80.00; // R$ 80,00 por lata

        // Pede o tamanho da área a ser pintada
        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados ");
        double area = scanner.nextDouble();

        //Calculando o total de litros necessários
        double litrosNecessarios = area / COBERTURA_POR_LITRO;

        //Calculando o número de latas necessárias (arredondando pra cima)
        int latasnecesarias = (int) Math.ceil(litrosNecessarios / TAMANHO_LATA);

        //Calculando o preço total
        double precoTotal = latasnecesarias * PRECO_LATA;

        //Mostrando o resultado
        System.out.println("Você vai precisar de " + latasnecesarias + " lata(s) de tinta.");
        System.out.printf("O preço total será R$ %.2f%n ", precoTotal);

    }

    //Exercicio 015
    //Faça um Programa para uma loja de tintas.
    //
    //O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    //
    //Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
    // e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
    //
    //Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
    //
    //comprar apenas latas de 18 litros;
    //comprar apenas galões de 3,6 litros;
    //misturar latas e galões, de forma que o preço seja o menor.
    //    Acrescente 10% de folga e sempre arredonde os valores para cima,
    //    isto é, considere latas cheias.

    public static void calculadoraDeLatasDeTintaEgalao(Scanner scanner) {

        // Informações do problema
        final double COBERTURA_POR_LITRO = 6.0; // 1 litro para cada 6 metros quadrados
        final double TAMANHO_LATA = 18.00; // Tinta vendida em latas de 18 litros
        final double PRECO_LATA = 80.00; // R$ 80,00 por lata
        final double TAMANHO_GALAO = 3.6; // 3.6 Litros o galão
        final double PRECO_GALAO = 25.00; // R$ 25,00 por galão.

        // Entrada de input do usuário
        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double area = scanner.nextDouble();

        // Acrescentando 10% de folga
        double areaComFolga = area * 1.10;

        // Calculando a quantidade de tinta necessária
        double litrosNecessarios = areaComFolga / COBERTURA_POR_LITRO;

        // Situação A: Comprar Apenas latas
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / TAMANHO_LATA); // Math.ceil retorna o menor inteiro maior ou igual o número fornecido
        double precoLatas = latasNecessarias * PRECO_LATA;

        // Situação B: Comprar apenas galões
        int galoesNecessarios = (int) Math.ceil(litrosNecessarios / TAMANHO_GALAO);
        double precoGalao = galoesNecessarios * PRECO_GALAO;

        // Situação C: Misturando latas e galões pra ter um custo menor
        int melhorLatas = 0;
        int melhorGaloes = 0;
        double menorPreco = Double.MAX_VALUE; //Double.MAX_VALUE é um tipo de "double" que o valor é muito alto.
        //Foi melhor usar pra definir limites superiores em calculos e evitar estouros de valor.

        for (int latas = 0; latas <= (int) Math.ceil(litrosNecessarios / TAMANHO_LATA); latas++) {
            //O loop "for" é usado pra repetir um blodo de código X vezes.
            //INICIALIZAÇÃO: a variável "latas" começa em 0.
            //CONDIÇÃO: (int latas = 0; latas <= (int) Math.ceil(litrosNecessarios / TAMANHO_LATA);.
            //O loop continua enquanto "latas" for menor ou igual o resultado do "Math.ceil".
            //ATUALIZAÇÃO: (latas++) após cada iteração, a variável "latas" é incrementada em 1. (folga)
            //RESUMO: O loop é executado de 0 até o número arredondado de latas necessárias, incluindo esse número.
            //É usado para processar ou realizar ações para cada lata necessária,
            //garantindo que todas as latas sejam consideradas, mesmo se a divisão não resultar em um número inteiro exato.

            double litrosRestantes = litrosNecessarios - (latas * TAMANHO_LATA);
            //Essa variável subtrai o volume coberto pelas latas d ovolume total necessário pra encontrar quantos
            //litros ainda precisam ser cobertos com galões.

            int galoes = (int) Math.ceil(litrosRestantes / TAMANHO_GALAO);
            //Essa variável teremina o número de galões necessários pra cobrir os litros restantes, arredondando eles pra cima.

            if (galoes < 0) {
                continue; // Ignora essa iteração se a quantidade de galões for negativa
            }
            //Aqui se ignora a iteração se o número de galões calculado for negativo,
            //o que pode ocorrer se não houver litros restantes.

            double preco = (latas * PRECO_LATA) + (galoes * PRECO_GALAO);
            //calcula-se o custo total usando preço por lata e galão.

            if (preco < menorPreco) {
                menorPreco = preco;
                melhorLatas = latas;
                melhorGaloes = galoes;
                //Se o preço calculado for menor que o preço mínimo encontrado até então, ele atualiza o preço
                //e registra a quantidade de latas e galões que resulta nesse preço.
            }
        }

        // Mostrando resultados
        System.out.println("Compra apenas latas: ");
        System.out.println("Quantidade de latas: " + latasNecessarias);
        System.out.printf("Preço total: R$ %.2f%n", precoLatas);

        System.out.println("\nCompra apenas galões:");
        System.out.println("Quantidade de galões: " + galoesNecessarios);
        System.out.printf("Preço total: R$ %.2f%n", precoGalao);

        System.out.println("\nMistura de latas e galões:");
        System.out.println("Quantidade de latas: " + melhorLatas);
        System.out.println("Quantidade de galões: " + melhorGaloes);
        System.out.printf("Preço total: R$ %.2f%n", menorPreco);
        //usa-se "\n" pra começar uma nova linha de texto.

    }

}
