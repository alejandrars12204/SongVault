public class Cancion {
    private String titulo;
    private double duracion;
    private String autor;
    private String album;
    public Cancion (String titulo, double duracion, String autor, String album){
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = autor;
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }
    public double getDuracion(){
        return duracion;
    }
    public String getAutor(){
        return autor;
    }
    public String getAlbum(){
        return album;
    }
    public String toString(){
        return "\n Título: " + titulo + "\n" + "Duración: " + duracion + "minutos \n" + "Autor: " + autor + "\n" + "Album: " + album;
    }
}
