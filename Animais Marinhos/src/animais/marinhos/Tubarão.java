package animais.marinhos;

class Tubarão extends AnimalMarinho {

    private int dentes;

    public Tubarão(String habitat, int dentes) {
        super(habitat);
        this.dentes = dentes;
    }

    public void definirDentes(int dentes) {
        this.dentes = dentes;
    }

    @Override
    public void fazerSom() {
        System.out.println("Tubarão faz som: ... (silencioso)");
    }

    @Override
    public String toString() {
        return "Tubarão - Habitat: " + habitat + ", Dentes: " + dentes;
    }
}
