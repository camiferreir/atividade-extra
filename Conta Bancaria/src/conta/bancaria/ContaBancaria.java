package conta.bancaria;

public class ContaBancaria {

    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca(100.0, 0.05);
        cp.calcularJuros();

        cp.definirTaxa(6);
        cp.calcularJuros();

        ContaCorrente cc = new ContaCorrente(2020.0, 550.0);
        cc.calcularJuros();

        cc.definirLimite(1200.0);
        System.out.println("Novo limite da Conta Corrente: " + cc.limite);
    }
}
