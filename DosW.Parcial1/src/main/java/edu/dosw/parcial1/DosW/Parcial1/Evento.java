package edu.dosw.parcial1.DosW.Parcial1;

import java.util.ArrayList;
import java.util.List;

abstract class Evento {
    protected String titulo;
    protected String fecha;
    protected int cupoMaximo;
    protected String estado = "PENDIENTE";
    protected List<UsuarioInterface> inscritos = new ArrayList<>();

    public abstract void inscribir(UsuarioInterface u);
    
    public void setFecha(String nuevaFecha) {
        this.fecha = nuevaFecha;
        notificar();
    }

    protected void notificar() {
        for (UsuarioInterface u : inscritos) {
            System.out.println("Notificación enviada a " + u.getNombre());
        }
    }
}