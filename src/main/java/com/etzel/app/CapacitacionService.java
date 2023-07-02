package com.etzel.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CapacitacionService {

    private List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();

    public void agregarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public List<Capacitacion> obtenerTodasLasCapacitaciones() {
        return capacitaciones;
    }
}