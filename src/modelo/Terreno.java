package modelo;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    public double PagamentoMensal() {
        var valorPorcentagem = super.PagamentoMensal() * 0.02;
        return super.PagamentoMensal() + valorPorcentagem;
    }
}
