package animais.marinhos;

abstract class AnimalMarinho {

    protected String habitat;

    public AnimalMarinho(String habitat) {
        this.habitat = habitat;
    }

    public abstract void fazerSom();
}
