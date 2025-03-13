package personagem.de.jogo;

public class PersonagemDeJogo {

    public static void main(String[] args) {
        Mago mago = new Mago(150, 80.0);

        mago.atacar();

        mago.definirMana(50);

        mago.atacar();

        Guerreiro guerreiro = new Guerreiro(160, 80);

        guerreiro.atacar();

        guerreiro.definirForca(200);

        guerreiro.atacar();

    }

}
