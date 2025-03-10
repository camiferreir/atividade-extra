package tipos.de.pagamento;

public class TiposDePagamento {

    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito(500, 1000);
        Boleto boleto = new Boleto(300, "12345678901234567890");

        System.out.println(cartao);
        System.out.println(boleto);

        cartao.processarPagamento();
        boleto.processarPagamento();

        cartao.definirLimite(2000);
        System.out.println(cartao);

        boleto.definirCodigo("98765432109876543210");
        System.out.println(boleto);
    }

}
