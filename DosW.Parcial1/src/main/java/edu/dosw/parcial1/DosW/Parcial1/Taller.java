package edu.dosw.parcial1.DosW.Parcial1;

class Taller extends Evento {
    public Taller(String titulo, String fecha, int cupo) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.cupoMaximo = cupo;
    }

    @Override
    public void inscribir(UsuarioInterface u) {
        if (inscritos.size() < cupoMaximo) {
            inscritos.add(u);
            System.out.println("Inscripción exitosa: " + u.getNombre());
            
            if (inscritos.size() == 10 && estado.equals("PENDIENTE")) {
                estado = "CONFIRMADO";
                System.out.println("Evento CONFIRMADO.");
                notificar();
            }
        } else {
            System.out.println("Mucha people");
        }
    }
}