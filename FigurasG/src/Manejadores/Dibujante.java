package Manejadores;

import Interfaces.IFigurasG;
import geometria.FiguraG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Dibujante implements IFigurasG<FiguraG> {

    @Override
    public void Dibujar(ArrayList objeto) {
        Iterator<FiguraG> nombreIterator = objeto.iterator();
        while (nombreIterator.hasNext()) {
            FiguraG elemento = nombreIterator.next();
            System.out.print(elemento + " \n");
        }
    }

    public ArrayList Ordenar(ArrayList st, ArrayList us) {
        ArrayList<String> list = new ArrayList<>();
        String s;
        for (int i = 0; i < st.size(); i++) {
            s = st.get(i) + ": " + us.get(i);
            list.add(s);
        }
        HashSet<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    @Override
    public void Dibujarte(ArrayList<FiguraG> figura) {
        Iterator<FiguraG> nombreIterator = figura.iterator();
        while (nombreIterator.hasNext()) {
            FiguraG elemento = nombreIterator.next();
            System.out.print(elemento + " \n");
        }
    }

}
