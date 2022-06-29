package ejr3;

import java.util.ArrayList;
import java.util.List;

public class SistemaEscuela implements ISistema {
    private String nombre;
    private int capacidad;
    private List<Estudiante> estudiantes;
    private String requisitos;

    private IRedSocial redSocial;

    public SistemaEscuela(String nombre, int capacidad, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisitos = requisitos;
        estudiantes = new ArrayList<>();
    }

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("datos escuela");
        System.out.println("nombre: " + nombre);
        System.out.println("capacidad: " + capacidad);
        System.out.println("estudiantes: ");
        for (Estudiante e:estudiantes) {
            System.out.println("--- " + e.getNombre());
        }
        System.out.println("requisitos: " + requisitos);
        System.out.println();
    }
}