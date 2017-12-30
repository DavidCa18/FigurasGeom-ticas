/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author David
 */
public class Hexagono extends FiguraG {
    double lado;
    PuntoInicial punto;
    
    public Hexagono() {
        tipoFigura = "Hexágono";
    }

    @Override
    public int Orden() {
        return 5;
    }

    @Override
    public String toString() {
        return "Orden: "+Orden()+" Soy un: "+tipoFigura+" mis lados son de: "+lado+" y mis coordenados son:"+punto;
    }
    
}
