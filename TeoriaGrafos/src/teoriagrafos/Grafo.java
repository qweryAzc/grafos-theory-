package teoriagrafos;
/**
 *
 * @author qwery.azc
 */
import java.util.*;

 class Grafo {

  private Map<Integer, Node> diccionario;
  
  public Grafo() {
    this.diccionario = new HashMap<Integer, Node>();
   
  }
  public void mapear(int [][] matrix){
  ArrayList<Integer> adyacencia=new ArrayList<Integer>();
  for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix.length; j++){
          if(matrix[i][j]==1){
             adyacencia.add(j);
          }   
      }
   this.addNode(i, adyacencia);
   adyacencia.clear();
  }
  }

  public void addNode(int id, ArrayList<Integer> Adyacentes) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int adyacente : Adyacentes){
         list.add(adyacente);
    }
    Node node = new Node(id);
    node.setAdyacentes(list);
    diccionario.put(id, node);
  }
  public ArrayList<Integer> getAdyacencias(int vertice){
      Node n=diccionario.get(vertice);
      ArrayList<Integer> adyacentes=n.getAdyacentes();
      return adyacentes;
  }
  
  public static void main(String[] args) {
    Grafo grafo = new Grafo();
    int [][] m=     {{0,1,0,1,1},
                     {1,0,1,1,0},
                     {0,1,0,1,0},
                     {1,1,1,0,1},
                     {1,0,0,1,0}};
    grafo.mapear(m);
    System.out.println(grafo.getAdyacencias(0));

  }

}
