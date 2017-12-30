package geometria;

public class Cuadrado extends FiguraG
{
    double lado;
    PuntoInicial punto;
    int orden;
    String tipoFigura;   
    
    public FiguraG Cuadrado(double lado) {
        this.lado = lado;
        tipoFigura = "Cuadrado";
        return new Cuadrado();      
    }
    
    @Override
    public int Orden() {
        return 2;
    }
    
    @Override
    public String toString() {
        return "Orden: "+Orden()+" Soy un: "+tipoFigura+" mis lados son de: "+lado+" y mis coordenados son:"+punto;
    }   
    
}