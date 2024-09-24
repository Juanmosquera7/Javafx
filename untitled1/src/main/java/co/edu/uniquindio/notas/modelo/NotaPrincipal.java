package co.edu.uniquindio.notas.modelo;

import java.util.ArrayList;

public class NotaPrincipal {
    private ArrayList<Nota> notas;

    public NotaPrincipal(){
        this.notas = new ArrayList<>();
    }
    public void agregarNota (String titulo, String descripcion, String categoria){
        Nota nuevaNota = Nota.builder()
                .titulo(titulo)
                .descripcion(descripcion)
                .categoria(categoria)
                .build();
        notas.add(nuevaNota);
    }
    public ArrayList<Nota> listarNotas(){
        return notas;
    }
}
