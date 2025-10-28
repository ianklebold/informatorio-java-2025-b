package com.informatorio.chadgame.service.lector.impl;


import com.informatorio.chadgame.dominio.Mision;
import com.informatorio.chadgame.service.lector.LectorMisionesService;
import com.informatorio.chadgame.utils.LectorUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LectorMisionesServiceImpl implements LectorMisionesService {
    @Override
    public List<Mision> leerMisiones(int cantidadDeMisiones) {
        Scanner scanner = new Scanner(System.in);
        List<Mision> listaMisiones = new ArrayList<Mision>();

        for (int i = 0; i < cantidadDeMisiones; i++) {
            int numeroMision = i + 1;

            System.out.println("Ingrese los puntos obtenidos de la mision N " + numeroMision + ": ");

            int puntosObtenidos = LectorUtils.leerEnteroPositivo(scanner);
            listaMisiones.add( new Mision( numeroMision , puntosObtenidos ) );

        }

        scanner.close();
        return listaMisiones;
    }
}
