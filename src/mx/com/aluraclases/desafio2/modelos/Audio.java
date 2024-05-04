package mx.com.aluraclases.desafio2.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificacion;

    public void meGusta(){
        totalDeMeGusta++;
    }

    public void reproducir(){
        totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }
}
