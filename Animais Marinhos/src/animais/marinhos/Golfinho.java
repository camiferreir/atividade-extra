package animais.marinhos;

class Golfinho extends AnimalMarinho {

    private int saltos;

    public Golfinho(String habitat, int saltos) {
        super(habitat);
        this.saltos = saltos;
    }

    public void definirSaltos(int saltos) {
        this.saltos = saltos;
    }

    public void definirSaltos(double saltos) {
        this.saltos = (int) saltos;
    }

    @Override
    public void fazerSom() {
        System.out.println("Golfinho faz som: Clique Clique!");
    }

    @Override
    public String toString() {
        return "Golfinho - Habitat: " + habitat + ", Saltos: " + saltos;
    }
}
