package conta.bancaria;

class ContaCorrente extends Conta {

    double limite;

    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    public void definirLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void calcularJuros() {

        saldo -= saldo * 0.01;
        System.out.println("Novo saldo após taxa (Conta Corrente): " + saldo);
    }
}
