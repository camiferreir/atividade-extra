package animais.marinhos;

public class AnimaisMarinhos {

    public static void main(String[] args) {
        Golfinho golfinho = new Golfinho("Oceano", 5);
        Tubarão tubarao = new Tubarão("Oceano", 300);

        System.out.println(golfinho);
        System.out.println(tubarao);

        golfinho.fazerSom();
        tubarao.fazerSom();

        golfinho.definirSaltos(8.5);
        System.out.println(golfinho);

        tubarao.definirDentes(350);
        System.out.println(tubarao);
    }
}
