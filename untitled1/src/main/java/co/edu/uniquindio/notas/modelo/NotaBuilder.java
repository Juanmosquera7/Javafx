package co.edu.uniquindio.notas.modelo;

public class NotaBuilder {
    private String titulo;
    private String descripcion;
    private String categoria;

    public NotaBuilder(){}

    public NotaBuilder titulo (String titulo){
        this.titulo = titulo;
        return this;
    }
    public NotaBuilder descripcion (String descripcion){
        this.descripcion = descripcion;
        return this;
    }
     public  NotaBuilder categoria (String categoria){
        this.categoria = categoria;
        return this;
     }
     public Nota build(){
        return new Nota(titulo, descripcion, categoria);
     }


}
