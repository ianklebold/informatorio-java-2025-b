package com.informatorio.chadgame.service.lector;


import com.informatorio.chadgame.dominio.Mision;

import java.util.List;

public interface LectorMisionesService {
    List<Mision> leerMisiones(int cantidadDeMisiones);
}
