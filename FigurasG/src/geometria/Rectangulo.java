/*
 * Rectangulo
 */
package geometria;

/**
 * @author www.ajpdsoft.com
 */
public class Rectangulo extends FiguraG
{
    double base, altura;
    PuntoInicial punto;

    public Rectangulo() {
        tipoFigura = "Rectágulo";
    }

    @Override
    public String toString() {
        return "Orden: "+Orden()+" Soy un: "+tipoFigura+" mi base es: "+base+" y mi altura es: "+altura+" y mis coordenados son:"+punto;
    }

    @Override
    public  int Orden() {
        return 3;
    }

}
