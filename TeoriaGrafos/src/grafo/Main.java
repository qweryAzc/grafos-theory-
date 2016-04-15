/**
 *
 * @author qwery.azc
 */
public class Main{
    static Grafo grafo;
    
    public static void llenandoGrafo(){
        grafo = new Grafo();
        int [][]m = {{0,1,0,0,1},
                     {1,0,1,1,0},
                     {0,1,0,1,0},
                     {0,1,1,0,1},
                     {1,0,0,1,0}};
        grafo.mapear(m);
        grafo.hijos(3);
    }
   
    public static void main(String []args){             
        llenandoGrafo();       
    }
}
