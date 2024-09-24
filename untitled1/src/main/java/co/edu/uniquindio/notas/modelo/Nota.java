package co.edu.uniquindio.notas.modelo;

public class Nota {
    private String titulo;
    private String descripcion;
    private String categoria;

    //public Nota(String titulo, String descripcion, String categoria) {

    //}


    public Nota(String titulo, String descripcion, String categoria) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public static NotaBuilder builder (){
       return new NotaBuilder();
   }
}
