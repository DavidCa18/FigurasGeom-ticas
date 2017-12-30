
package geometria;

public class Circulo extends FiguraG{
    private double radio;
    PuntoInicial punto;
    
    public Circulo(){
        tipoFigura = "Círculo";
    }

    @Override
    public int Orden() {
        return 6;    
    }

    @Override
    public String toString() {
        return "Orden: "+Orden()+" Soy un: "+tipoFigura+" mis lados son de: "+radio+" y mis coordenados son:"+punto;
    }

}
