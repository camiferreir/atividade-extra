package tipos.de.transporte;

class Navio extends Transporte {

    private double tonelagem;

    public Navio(int capacidade, double tonelagem) {
        this.tonelagem = tonelagem;
    }

    public void definirTonelagem(int tonelagem) {
        this.tonelagem = tonelagem;
    }

    public void definirTonelagem(double tonelagem) {
        this.tonelagem = tonelagem;
    }

    public void mover() {
        System.out.println("O Navio está navegando com " + tonelagem + " toneladas de carga.");
    }
}
