
package tipos.de.pagamento;

import tipos.de.pagamento.pagamento.Pagamento;

class CartaoCredito extends Pagamento {
    private double limite;

    public CartaoCredito(double valor, double limite) {
        super(valor);
        this.limite = limite;
    }

    // Sobrecarga do método definirLimite()
    public void definirLimite(double limite) {
        this.limite = limite;
    }

    public void definirLimite(int limite) {
        this.limite = (double) limite;
    }

    @Override
    public void processarPagamento() {
        if (valor <= limite) {
            System.out.println("Pagamento de R$" + valor + " processado no Cartão de Crédito.");
            limite -= valor;
        } else {
            System.out.println("Pagamento falhou: limite insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Cartão de Crédito - Valor: R$" + valor + ", Limite disponível: R$" + limite;
    }
}
