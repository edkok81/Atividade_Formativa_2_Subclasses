package util;

import java.util.Scanner;

public class InterfaceUsuario {
    // Atributos
    double valorImovel = 0;
    int prazoFinanciamento = 0;
    double taxaJuros = 0;

    //Métodos

    // Método para pedir para o usuário o VALOR DO IMÓVEL
    public double pedirValorImovel() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do imóvel (Em Reais). [Valor entre 1 e 500000] ");
        valorImovel = scanner.nextDouble();
        while (valorImovel < 1 || valorImovel > 500000) {
            System.out.println("Por favor, digite um valor válido.");
            System.out.println("Digite o valor do imóvel: R$ ");
            valorImovel = scanner.nextDouble();
        }
        return valorImovel;
    }

    // Método para pedir para o usuário o PRAZO DO FINANCIAMENTO EM ANOS
    public int pedirPrazoFinanciamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o prazo do financiamento (em anos). [Valor entre 1 e 50]");
        prazoFinanciamento = scanner.nextInt();
        while (prazoFinanciamento < 1 || prazoFinanciamento > 50) {
            System.out.println("Por favor, digite um valor válido.");
            System.out.println("Digite o prazo do financiamento (em anos): ");
            prazoFinanciamento = scanner.nextInt();
        }
        return prazoFinanciamento;
    }

    // Método para pedir para o usuário A TAXA DE JUROS EM ANOS
    public double pedirTaxaJuros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a taxa de juros (anual). [Valor entre 1 e 300]");
        taxaJuros = scanner.nextInt();
        while (taxaJuros < 1 || taxaJuros > 300) {
            System.out.println("Por favor, digite um valor válido.");
            System.out.println("Digite a taxa de juros (anual): ");
            taxaJuros = scanner.nextInt();
        }
        return taxaJuros;
    }
}