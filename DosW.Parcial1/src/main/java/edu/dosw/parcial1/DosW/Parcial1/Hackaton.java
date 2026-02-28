package edu.dosw.parcial1.DosW.Parcial1;
import java.util.List;

class Hackathon extends Evento {
    public Hackathon(String titulo, String fecha) {
        this.titulo = titulo; this.fecha = fecha;
    }

    public void inscribirEquipo(List<UsuarioInterface> equipo) {
        if (equipo.size() < 2) {
            System.out.println("Error: El equipo debe tener al menos 2 integrantes.");
            return;
        }
        inscritos.addAll(equipo);
        System.out.println("Equipo inscrito exitosamente.");
    }

    @Override public void inscribir(UsuarioInterface u) { }
}