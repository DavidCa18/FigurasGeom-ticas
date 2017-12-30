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
public class PuntoInicial {
    int CoordenadaX, CoordenadaY;
    public String PuntoInicial(int CoordenadaX, int CoordenadaY){
        this.CoordenadaX = CoordenadaX;
        this.CoordenadaY = CoordenadaY;
        
        return "("+CoordenadaX+","+CoordenadaY+")";
    }
}
