package geometria;

import Manejadores.Dibujante;
import java.util.ArrayList;

public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println(cuadrado.Cuadrado(6));
        
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Hexagono hexagono = new Hexagono();
        Rectangulo rectangulo = new Rectangulo();
        Pentagono pentagono = new Pentagono();
        /*      
        ArrayList<FiguraG> figuras = new ArrayList<>();
        figuras.add(cuadrado);
        figuras.add(hexagono);
        figuras.add(circulo);
        figuras.add(triangulo);
        figuras.add(rectangulo);
        figuras.add(pentagono);
        
        Dibujante dibujante = new Dibujante();
        */
        
        
        //dibujante.Dibujar(figuras);
        
        //dibujante.Dibujarte(figuras);
    }
}
