package modelo;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double areaTerreno;

    public Casa(double valorImovel, double areaConstruida, double areaTerreno,int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;

    }

    public double PagamentoMensal() {
        return super.PagamentoMensal() + 80;
    }
}
