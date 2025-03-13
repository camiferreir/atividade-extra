package personagem.de.jogo;

abstract class Personagem {

    protected int energia;

    public Personagem(int energia) {
        this.energia = energia;
    }

    public abstract void atacar();
}
