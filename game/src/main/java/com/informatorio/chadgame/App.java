package com.informatorio.chadgame;

import com.informatorio.chadgame.dominio.Jugador;
import com.informatorio.chadgame.dominio.Mision;
import com.informatorio.chadgame.service.archivos.ArchivosMisionesService;
import com.informatorio.chadgame.service.archivos.impl.ArchivosMisionesServiceImpl;
import com.informatorio.chadgame.service.juegorpg.JuegoRPGService;
import com.informatorio.chadgame.service.juegorpg.impl.JuegoRPGServiceImpl;
import com.informatorio.chadgame.service.lector.LectorMisionesService;
import com.informatorio.chadgame.service.lector.impl.LectorMisionesServiceImpl;
import com.informatorio.chadgame.utils.ImpresoraUtils;

import java.util.List;

public class App
{
    public static void main( String[] args ){
        JuegoRPGService juegoRPGService = new JuegoRPGServiceImpl();
        LectorMisionesService lectorMisionesService = new LectorMisionesServiceImpl();
        ArchivosMisionesService archivosMisionesService = new ArchivosMisionesServiceImpl();

        System.out.println(" Bienvenido a ChadQuest RPG - Carga los puntajes de tus misiones ");
        List<Mision> misiones = lectorMisionesService.leerMisiones( 5 );

        Jugador jugador = new Jugador(misiones);

        String mensajeTieneFallos = juegoRPGService.tieneFallos(jugador);
        String mensajeConstancia =  juegoRPGService.mensajeDeConstancia(jugador);
        String mensajeEvaluacion =  juegoRPGService.evaluar(jugador);

        ImpresoraUtils.imprimirEvaluacion( List.of( mensajeTieneFallos, mensajeConstancia, mensajeEvaluacion ) );

        archivosMisionesService.exportarMisionesCSV( misiones );
    }
}
