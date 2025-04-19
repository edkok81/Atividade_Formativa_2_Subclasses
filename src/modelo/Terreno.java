package modelo;

public class Terreno extends Financiamento {
    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double PagamentoMensal() {
        var valorPorcentagem = super.PagamentoMensal() * 0.02;
        return super.PagamentoMensal() + valorPorcentagem;
    }
}
