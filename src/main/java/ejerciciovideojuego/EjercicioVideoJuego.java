package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.List;
import java.util.ArrayList;

public class EjercicioVideoJuego {

    public static void main(String[] args) {

        // 1. Crear un ArrayList de tipo VideoJuego.
        List<VideoJuego> listaTipoVideoJuegos = new ArrayList<VideoJuego>();

        //1.1 Crear 5 videojuegos y guardarlos en la collection.
        VideoJuego videoJuego1 = new VideoJuego(123, "Mario Kart", "Nintendo 64", 4, "Carreras");
        VideoJuego videoJuego2 = new VideoJuego(456, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
        VideoJuego videoJuego3 = new VideoJuego(789, "Metal Gear Solid 3", "PS3", 1, "Supervivencia");
        VideoJuego videoJuego4 = new VideoJuego(101, "Resident Evil 4 2005", "PS4", 1, "Terror");
        VideoJuego videoJuego5 = new VideoJuego(121, "Grand Theft Auto San Andreas", "PS2", 500, "Acción");

        listaTipoVideoJuegos.add(videoJuego1);
        listaTipoVideoJuegos.add(videoJuego2);
        listaTipoVideoJuegos.add(videoJuego3);
        listaTipoVideoJuegos.add(videoJuego4);
        listaTipoVideoJuegos.add(videoJuego5);

        //2. Recorrer la ArrayList creada y mostrar por pantalla el título, consola y cantidad de juegadores de los videjuegos almacenados.
        for (VideoJuego videoJuego : listaTipoVideoJuegos) {
            System.out.println("Título del video juego: " + videoJuego.getTitulo());
            System.out.println("Consola disponible para juegar el video juego: " + videoJuego.getConsola());
            System.out.println("Cantidad de jugadores del video juego: " + videoJuego.getCantidadJugadores());
            System.out.println("--------------------------------------");
        }

        //3. Cambiar el nombre y cantidad de jugadores de dos video juegos.
        videoJuego1.setTitulo("Super Mario Kart 64");
        videoJuego1.setCantidadJugadores(2);
        
        videoJuego2.setTitulo("Banjo Kazooie II");
        videoJuego2.setCantidadJugadores(1);

        //3.1 Mostrar por pantalla los datos de todos los video juegos luegos del cambio.
        for (VideoJuego videoJuego : listaTipoVideoJuegos) {
            System.out.println("Código del video juego: " + videoJuego.getCodigo());
            System.out.println("Título del video juego: " + videoJuego.getConsola());
            System.out.println("Consola del video juego: " + videoJuego.getCantidadJugadores());
            System.out.println("Cantidad de jugadores del video juego: " + videoJuego.getTitulo());
            System.out.println("Categoría del video juego: " + videoJuego.getConsola());
            System.out.println("--------------------------------------");
        }

        //4. Recorrer la ArrayList y mostrar por pantalla únicamente a los video juegos que sean de la consola "Nintendo 64"
        for (VideoJuego videoJuego : listaTipoVideoJuegos) {
            if (videoJuego.getConsola().equals("Nintendo 64")) {
                System.out.println(videoJuego.toString());
            } 
        }
    }
}
