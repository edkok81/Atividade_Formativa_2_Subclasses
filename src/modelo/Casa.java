package modelo;

public class Casa extends Financiamento {
    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double PagamentoMensal() {
        return super.PagamentoMensal() + 80;
    }
}
