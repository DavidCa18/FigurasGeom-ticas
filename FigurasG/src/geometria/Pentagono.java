package geometria;

public class Pentagono extends FiguraG{
    double lado;
    PuntoInicial punto;
    
    public Pentagono() {
        tipoFigura = "Pentágono";
    }

    @Override
    public int Orden() {
        return 4;
    }

    @Override
    public String toString() {
        return "Orden: "+Orden()+" Soy un: "+tipoFigura+" mis lados son de: "+lado+" y mis coordenados son:"+punto;
    }
    
    
    
}
