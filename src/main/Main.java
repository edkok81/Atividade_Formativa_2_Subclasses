package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.InterfaceUsuario;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciar InterfaceUsuario
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        ArrayList<Financiamento> listaDeFinanciamentos = new ArrayList<Financiamento>();

        //Instanciar Métodos de InterfaceUsuario
        System.out.println("** FINANCIAMENTO 1 - TERRENO **");
        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJuros = interfaceUsuario.pedirTaxaJuros();

        // Instanciar Financiamento para Terreno
        Terreno financiamentoTerreno = new Terreno(valorImovel, prazoFinanciamento, taxaJuros);

        System.out.printf("o valor mensal da parcela ficará em R$ %.2f\n", financiamentoTerreno.PagamentoMensal());
        System.out.printf("O valor total do financiamento será de R$ %.2f\n", financiamentoTerreno.totalPagamento());

        // Adicionar o financiamento do Terreno na lista
        listaDeFinanciamentos.add(new modelo.Terreno(valorImovel, prazoFinanciamento, taxaJuros));

        // Criar os financiamentos pedidos sem solicitar dados para o usuário

        //Criar e Instanciar Métodos das Casas 1 e 2
        System.out.println("\n** FINANCIAMENTO 2 - CASA 1 **");
        Casa financiamentoCasa1 = new Casa(500000, 10, 10);

        System.out.printf("o valor mensal da parcela ficará em R$ %.2f\n", financiamentoCasa1.PagamentoMensal());
        System.out.printf("O valor total do financiamento será de R$ %.2f\n", financiamentoCasa1.totalPagamento());

        // Adicionar o financiamento da Casa 1 na lista
        listaDeFinanciamentos.add(financiamentoCasa1);

        System.out.println("\n** FINANCIAMENTO 3 - CASA 2 **");
        Casa financiamentoCasa2 = new Casa(250000, 10, 10);

        System.out.printf("o valor mensal da parcela ficará em R$ %.2f\n", financiamentoCasa2.PagamentoMensal());
        System.out.printf("O valor total do financiamento será de R$ %.2f\n", financiamentoCasa2.totalPagamento());

        // Adicionar o financiamento da Casa 2 na lista
        listaDeFinanciamentos.add(financiamentoCasa2);

        //Criar e Instanciar Métodos dos Apartamentos 1 e 2
        System.out.println("\n** FINANCIAMENTO 4 - APARTAMENTO 1 **");
        Apartamento financiamentoApartamento1 = new Apartamento(500000, 10, 10);

        System.out.printf("o valor mensal da parcela ficará em R$ %.2f\n", financiamentoApartamento1.PagamentoMensal());
        System.out.printf("O valor total do financiamento será de R$ %.2f\n", financiamentoApartamento1.totalPagamento());

        // Adicionar o financiamento da Apartamento 1 na lista
        listaDeFinanciamentos.add(financiamentoApartamento1);

        System.out.println("\n** FINANCIAMENTO 5 - APARTAMENTO 2 **");
        Apartamento financiamentoApartamento2 = new Apartamento(250000, 10, 10);

        System.out.printf("o valor mensal da parcela ficará em R$ %.2f\n", financiamentoApartamento2.PagamentoMensal());
        System.out.printf("O valor total do financiamento será de R$ %.2f\n", financiamentoApartamento2.totalPagamento());

        // Adicionar o financiamento da Apartamento 2 na lista
        listaDeFinanciamentos.add(financiamentoApartamento2);

        System.out.println("\n----------\n");
        double totalGeralImoveis = 0;
        double totalGeralFinanciamento = 0;
        System.out.println("Total dos dados informados: ");
        for (Financiamento f : listaDeFinanciamentos) {
            totalGeralImoveis += f.getValorImovel();
            totalGeralFinanciamento += f.totalPagamento();
        }

        System.out.printf("Valor total de todos os imóveis: R$ %.2f\n", totalGeralImoveis);
        System.out.printf("Valor total de todos os financiamentos: R$ %.2f\n", totalGeralFinanciamento);
    }
}