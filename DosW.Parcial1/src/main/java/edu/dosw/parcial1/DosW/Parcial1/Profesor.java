package edu.dosw.parcial1.DosW.Parcial1;

class Profesor implements UsuarioInterface {
    private String nombre;
    private String correo;
    private String code;

    public Profesor(String rawData) {
        String[] parts = rawData.split(",");
        
        if (parts.length == 3 && parts[2].endsWith("@escuelaing.edu.co")) {
            this.code = parts[0];
            this.nombre = parts[1];
            this.correo = parts[2];
        } else {
            System.out.println("Mala estructura del usuario creador");
        }
    }
    @Override public String getNombre() { return nombre; }
    @Override public String getCorreo() { return correo; }
    public String getCode() { return code; }
}