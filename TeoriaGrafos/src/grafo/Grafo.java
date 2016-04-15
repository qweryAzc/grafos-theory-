import java.util.ArrayList;
/**
 *
 * @author qwery.azc
 */
public class Grafo{
    private ArrayList<Nodo> listaNodo;

    public Grafo(){
        listaNodo = new ArrayList<Nodo>();
    }
    public void adjuntarNodo(Nodo nodo){
        listaNodo.add(nodo);
    }
    public void mapear(int [][] matrix){
    ArrayList<Integer> adyacencia=new ArrayList<Integer>();
    
    for(int i=0; i<matrix.length; i++){ //insertamos los vertices
        adjuntarNodo(new Nodo(i));
    }
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix.length; j++){
          if(matrix[i][j]==1){
              crearEnlaces(i, j);
          }   
      }
    }
    }
    
    public void crearEnlaces(Object nombreNodoPadre,Object nombreNodoHijo){
        Nodo padre = buscarNodo(nombreNodoPadre);      
        Nodo hijo = buscarNodo(nombreNodoHijo);
        if(padre != null && hijo != null){
            padre.setNodo(hijo);
        }
    }
    
    public void hijos(Object nombreNodoPadre){
        Nodo padre = buscarNodo(nombreNodoPadre);
        ArrayList<Nodo> enlaces=padre.getHijos();
       for(Nodo e:enlaces){
           System.out.println(e.getDato());
       }
    }
    
    public Nodo buscarNodo(Object nombreNodo){
        Nodo temp = null;
        for(int i = 0;i < listaNodo.size(); i++){
            if(nombreNodo==listaNodo.get(i).getDato()){
                return listaNodo.get(i);
            }
        }
        return temp;
    }

}
