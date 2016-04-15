package teoriagrafos;
/**
 *
 * @author qwery.azc
 */
import java.util.*;

public class Node {
  
  private final int id;
  private ArrayList<Integer> adyacentes = null;

  
  public Node(int id) {
    this.id = id;
  }
  
  public ArrayList<Integer> getAdyacentes(){
    return this.adyacentes;
  }
  
  public void setAdyacentes(ArrayList<Integer> vertices) {
    this.adyacentes = vertices;
  }
}

