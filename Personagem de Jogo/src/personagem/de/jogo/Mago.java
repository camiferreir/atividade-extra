package personagem.de.jogo;

class Mago extends Personagem {

    private double mana;

    public Mago(int energia, double mana) {
        super(energia);
        this.mana = mana;
    }

    public void definirMana(int mana) {
        this.mana = mana;
    }

    public void definirMana(double mana) {
        this.mana = mana;
    }

    @Override
    public void atacar() {
        if (mana >= 10) {
            energia -= 5;
            mana -= 10;
            System.out.println("O Mago atacou! Energia restante: " + energia + ", Mana restante: " + mana);
        } else {
            System.out.println("Mana insuficiente para atacar.");
        }
    }
}
