package edu.dosw.parcial1.DosW.Parcial1;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		UsuarioInterface us = new Profesor("20123,Laura,laura@escuelaing.edu.co");

        Evento taller = EventoFactory.crear("Taller", "Clean Code Avanzado", "2026-03-20", 30, us);

        String[] dataEstudiantes = {
            "12345_Juan Perez_juan.perez@mail.escuelaing.edu.co_SIS",
            "22345243_Ana Ruiz_ana.ruiz@mail.escuelaing.edu.co_SIS",
            "3234_Carlos Lopez_carlos.lopez@mail.escuelaing.edu.co_SIS",
            "4345_Laura Gomez_laura.gomez@mail.escuelaing.edu.co_SIS",
            "4345_Laura Gomez_laura.gomez@mail.escuelaing.edu.co_SIS",
            "4345_Laura Gomez_laura.gomez@mail.escuelaing.edu.co_SIS",
            "4345_Laura Gomez_laura.gomez@mail.escuelaing.edu.co_SIS",
            "4345_Laura Gomez_laura.gomez@mail.escuelaing.edu.co_SIS",
            "4345_Laura Gomez_laura.gomez@mail.escuelaing.edu.co_SIS"
        };

        for (String d : dataEstudiantes) taller.inscribir(new Estudiante(d));
        taller.setFecha("2026-03-22");

        System.out.println("\nSegundo ejemplo");
        Evento conf = EventoFactory.crear("Conferencia", "IA en Educación", "2026-04-10", 2, us);
        conf.inscribir(new Estudiante("11352_Pedro_pedro@mail.escuelaing.edu.co_SIS"));
        conf.inscribir(new Estudiante("12345_Maria_maria@mail.escuelaing.edu.co_SIS"));
        conf.inscribir(new Estudiante("12843_Luis_luis@mail.escuelaing.edu.co_SIS"));
        System.out.println("\nTercer ejemplo con hackaton");
        Hackathon hack = (Hackathon) EventoFactory.crear("Hackathon", "OpenData 2026", "2026-05-01", 0, us);
        List<UsuarioInterface> equipo = Arrays.asList(
            new Estudiante("1567_Dev1_dev1@mail.escuelaing.edu.co_SIS"),
            new Estudiante("5675_Dev2_dev2@mail.escuelaing.edu.co_SIS")
        );
        hack.inscribirEquipo(equipo);
    }

}
