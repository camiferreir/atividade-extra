package conta.bancaria;

class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(double saldo, double taxaRendimento) {
        super(saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void definirTaxa(int taxa) {
        this.taxaRendimento = taxa / 100.0;
    }

    public void definirTaxa(double taxa) {
        this.taxaRendimento = taxa;
    }

    @Override
    public void calcularJuros() {
        saldo += saldo * taxaRendimento;
        System.out.println("Novo saldo após juros (Conta Poupança): " + saldo);
    }
}
