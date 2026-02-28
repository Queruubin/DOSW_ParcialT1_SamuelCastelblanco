package edu.dosw.parcial1.DosW.Parcial1;

class Conferencia extends Evento {
    public Conferencia(String titulo, String fecha, int cupo, UsuarioInterface creador) {
        if (!(creador instanceof Profesor)) throw new RuntimeException("Solo profesores crean conferencias");
        this.titulo = titulo; this.fecha = fecha; this.cupoMaximo = cupo;
    }

    @Override
    public void inscribir(UsuarioInterface u) {
        if (inscritos.size() >= cupoMaximo) {
            System.out.println("Cupo lleno");
            return;
        }
        inscritos.add(u);
        System.out.println("Inscripción exitosa " + u.getNombre());
    }
}