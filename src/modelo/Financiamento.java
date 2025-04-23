package modelo;

public abstract class Financiamento {
    // Atributos
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;

    // Métodos
    // Método Construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual / 100;
    }

    // Método para descobrir o pagamento MENSAL
    public double PagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    // Método para descobrir o pagamento TOTAL
    public double totalPagamento() {
        return this.PagamentoMensal() * this.prazoFinanciamento * 12;
    }

    //Getters para os atributos privados
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Método público para mostrar na tela uma mensagem contendo os dados do financiamento,
    // como o valor total do financiamento e o valor do imóvel.
    public double valorFinanciamento() {
        return this.valorImovel;
    }
}