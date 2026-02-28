package edu.dosw.parcial1.DosW.Parcial1;

class EventoFactory {
    public static Evento crear(String tipo, String titulo, String fecha, int cupo, UsuarioInterface creador) {
        System.out.println("Evento creado: " + tipo + " estado PENDIENTE");
        switch (tipo.toLowerCase()) {
            case "conferencia": return new Conferencia(titulo, fecha, cupo, creador);
            case "taller": return new Taller(titulo, fecha, cupo);
            case "hackathon": return new Hackathon(titulo, fecha);
            default: return null;
        }

    }
}