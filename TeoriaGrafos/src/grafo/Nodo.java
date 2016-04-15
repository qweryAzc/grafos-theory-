import java.util.ArrayList;
/**
 *
 * @author qwery.azc
 */
public class Nodo
{
    private Object dato;
    private ArrayList<Nodo> nodo;

    public Nodo(){
        this(new Object());
    }
    public Nodo(Object dato){
        this.dato = dato;
        nodo = new ArrayList<Nodo>();
    }
    public void setDato(Object dato){
        this.dato = dato;
    }
    public Object getDato(){
        return this.dato;
    }
    public void setNodo(Nodo nodo){
        this.nodo.add(nodo);
    }
    public ArrayList<Nodo> getHijos(){
        return nodo;
    }
}