package tipos.de.transporte;

class Avião extends Transporte {

    private int altitudeMaxima;

    public Avião(int capacidade, int altitudeMaxima) {

        this.altitudeMaxima = altitudeMaxima;
    }

    public void definirAltitude(int altitude) {
        this.altitudeMaxima = altitude;
    }

    @Override
    public void mover() {
        System.out.println("O Avião está voando a uma altitude máxima de " + altitudeMaxima + " metros.");
    }
}
