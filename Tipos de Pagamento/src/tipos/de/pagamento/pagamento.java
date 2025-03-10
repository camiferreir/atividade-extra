
package tipos.de.pagamento;


public class pagamento {
  abstract class Pagamento {
    protected double valor; // Atributo protegido

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void processarPagamento();
}  
}
