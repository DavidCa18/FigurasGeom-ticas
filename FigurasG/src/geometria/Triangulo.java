package geometria;

public class Triangulo extends FiguraG{
    private double lado;
    PuntoInicial punto;
    
    public Triangulo() {
        tipoFigura = "Triangulo";
    }
    @Override
    public int Orden() {
        return 1;
    }

    @Override
    public String toString() {
        return "Orden: "+Orden()+" Soy un: "+tipoFigura+" mis lados son de: "+lado+" y mis coordenados son:"+punto;
    }
    
}