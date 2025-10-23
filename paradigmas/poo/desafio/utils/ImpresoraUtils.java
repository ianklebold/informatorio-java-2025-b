package paradigmas.poo.desafio.utils;

import paradigmas.poo.desafio.dominio.Jugador;

import java.util.List;

public class ImpresoraUtils {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void imprimirEvaluacion(List<String> mensajes) {
        for (String mensaje : mensajes) {
            imprimir(mensaje);
        }
    }


}
