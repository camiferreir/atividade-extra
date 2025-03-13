package tipos.de.transporte;

public class TiposDeTransporte {

    public static void main(String[] args) {
        Navio navio = new Navio(200, 12000.0);
        navio.mover();
        navio.definirTonelagem(15500);
        navio.mover();

        Avião aviao = new Avião(250, 12000);
        aviao.mover();
        aviao.definirAltitude(15000);
        aviao.mover();
    }
}
