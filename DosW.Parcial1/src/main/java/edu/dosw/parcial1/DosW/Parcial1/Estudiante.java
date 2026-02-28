package edu.dosw.parcial1.DosW.Parcial1;

class Estudiante implements UsuarioInterface {
    private String nombre;
    private String correo;

    public Estudiante(String rawData) {
        String[] parts = rawData.split("_");
        if (parts.length == 4 && parts[2].endsWith("@mail.escuelaing.edu.co")) {
            this.nombre = parts[1];
            this.correo = parts[2];
        }
    }
    @Override public String getNombre() { return nombre; }
    @Override public String getCorreo() { return correo; }
}
