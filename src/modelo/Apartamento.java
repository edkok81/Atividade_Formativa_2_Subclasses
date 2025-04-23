package modelo;

public class Apartamento extends Financiamento {
    private int numVagasGaragem;
    private int numAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int numVagasGaragem, int numAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numVagasGaragem = numVagasGaragem;
        this.numAndar = numAndar;
    }

    public int getNumVagasGaragem() {
        return numVagasGaragem;
    }

    public int getNumAndar() {
        return numAndar;
    }

    public double PagamentoMensal() {
        double taxaMensal = taxaJurosAnual / 12;
        double meses = prazoFinanciamento * 12;
        double termo = Math.pow(1 + taxaMensal, meses);
        double price = this.valorImovel * (taxaMensal * termo) / (termo - 1);
        //double price = (valorImovel * (Math.pow(1 + taxaMensal, meses))) / (Math.pow(1 + taxaMensal, meses)) - 1;
        return price;
    }
}
