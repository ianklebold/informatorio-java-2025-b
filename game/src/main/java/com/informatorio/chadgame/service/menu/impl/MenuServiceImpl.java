package com.informatorio.chadgame.service.menu.impl;

import com.informatorio.chadgame.dominio.Jugador;
import com.informatorio.chadgame.repository.jugador.JugadorRepository;
import com.informatorio.chadgame.repository.misiones.MisionRepository;
import com.informatorio.chadgame.service.archivos.ArchivosMisionesService;
import com.informatorio.chadgame.service.juegorpg.JuegoRPGService;
import com.informatorio.chadgame.service.menu.MenuService;
import com.informatorio.chadgame.utils.ImpresoraUtils;

import java.util.List;
import java.util.Scanner;

public class MenuServiceImpl implements MenuService {

    private JuegoRPGService juegoRPGService;
    private ArchivosMisionesService archivosMisionesService;
    private JugadorRepository jugadorRepository;

    public MenuServiceImpl(JuegoRPGService juegoRPGService, ArchivosMisionesService archivosMisionesService, JugadorRepository jugadorRepository) {
        this.juegoRPGService = juegoRPGService;
        this.archivosMisionesService = archivosMisionesService;
        this.jugadorRepository = jugadorRepository;
    }

    @Override
    public void seleccionar(Scanner scanner) {
        int opcion = 0;
        System.out.println(" Bienvenido a ChadQuest RPG ");

        do{
            System.out.println("INDIQUE UNA OPCION : ");
            System.out.println("1. IMPRIMIR MENSAJE EVALUACION : ");
            System.out.println("2. VER CONSTANCIA ");
            System.out.println("3. VER FALLOS ");
            System.out.println("4. GENERAR ARCHIVO DE MISIONES ");
            System.out.println("5. SALIR ");

            opcion = scanner.nextInt();
            this.ejecutar( opcion );
        }while(opcion != 5);
    }

    private void ejecutar(int opcion) {
        Jugador jugador = jugadorRepository.obtenerJugador();

        switch (opcion) {
            case 1:
                System.out.println("\n");
                String mensajeTieneFallos = juegoRPGService.tieneFallos(jugador);
                String mensajeConstancia =  juegoRPGService.mensajeDeConstancia(jugador);
                String mensajeEvaluacion =  juegoRPGService.evaluar(jugador);

                ImpresoraUtils.imprimirEvaluacion( List.of(
                        mensajeTieneFallos,
                        mensajeConstancia,
                        mensajeEvaluacion
                ) );
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\n");
                System.out.println( juegoRPGService.mensajeDeConstancia(jugador) );
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                System.out.println( juegoRPGService.tieneFallos(jugador) );
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                archivosMisionesService.exportarMisionesCSV( jugador.getMisiones() );
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                System.out.println("HASTA LUEGO!");
                System.out.println("\n");
                break;
            default:
                break;
        }
    }


}
