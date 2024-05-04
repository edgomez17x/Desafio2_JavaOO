package mx.com.aluraclases.desafio2;

import mx.com.aluraclases.desafio2.modelos.Cancion;
import mx.com.aluraclases.desafio2.modelos.MisFavoritos;
import mx.com.aluraclases.desafio2.modelos.Podcast;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.setTitulo("Forever");
        cancion.setCantante("Kiss");

        Podcast podcast = new Podcast();
        podcast.setPresentador("Eder Gomez");
        podcast.setTitulo("Clases de programación");
        for (int i = 0; i < 100000; i++) {
            int seReprodujo = new Random().nextInt(10);
            if(seReprodujo%5==0){
                cancion.reproducir();
            }
        }

        for (int i = 0; i < cancion.getTotalDeReproducciones(); i++) {
            int leGusto = new Random().nextInt(cancion.getTotalDeReproducciones());
            if(leGusto%5==0) {
                cancion.meGusta();
            }
        }

        for (int i = 0; i < 100000; i++) {
            int seReprodujo = new Random().nextInt(10);
            if(seReprodujo%5==0){
                podcast.reproducir();
            }
        }

        for (int i = 0; i < podcast.getTotalDeReproducciones(); i++) {
            int leGusto = new Random().nextInt(podcast.getTotalDeReproducciones());
            if(leGusto%5==0) {
                podcast.meGusta();
            }
        }

        System.out.println(cancion.getTitulo());
        System.out.println("Total de reproducciones: " + cancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + cancion.getTotalDeMeGusta());

        System.out.println(podcast.getTitulo());
        System.out.println("Total de reproducciones: " + podcast.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + podcast.getTotalDeMeGusta());

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.adicione(cancion);
        misFavoritos.adicione(podcast);
    }
}
