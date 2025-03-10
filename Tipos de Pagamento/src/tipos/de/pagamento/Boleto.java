
package tipos.de.pagamento;

import tipos.de.pagamento.pagamento.Pagamento;


class Boleto extends Pagamento {
    private String codigoBarras; 

    public Boleto(double valor, String codigoBarras) {
        super valor;
        this.codigoBarras = codigoBarras;
    }

    public void definirCodigo(String codigo) {
        this.codigoBarras = codigo;
    }

    @Override
    public void processarPagamento() {
        String valor = null;
        System.out.println("Pagamento de R$" + valor + " processado via Boleto. Código: " + codigoBarras);
    }

    @Override
    public String toString() {
        String valor = null;
        return "Boleto - Valor: R$" + valor + ", Código de Barras: " + codigoBarras;
    }
}
