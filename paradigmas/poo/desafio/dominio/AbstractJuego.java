package paradigmas.poo.desafio.dominio;

public abstract class AbstractJuego {

    private Jugador jugador;

    public AbstractJuego(Jugador jugador) {
        this.jugador = jugador;
    }

    public abstract void evaluar();


    public Jugador getJugador() {
        return jugador;
    }
}
