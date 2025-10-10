package paradigmas.poo.principios.herencia;

public class Paloma extends Mensajero{

    public Paloma(String destino) {
        super(destino);
    }

    @Override
    public void enviarMensaje(String contenido){

        super.enviarMensaje(contenido);

        System.out.println("La paloma vuela hacia destino : " +
                super.getDestino() + " Diciendo " + contenido);
    }

}
