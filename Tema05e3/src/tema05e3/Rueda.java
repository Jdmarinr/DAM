
package tema05e3;

/**
 *
 * @author Aritz y Juan David
 */
public class Rueda {
    
    private String material;
    private int pulgadas;
    
    public void establecerMaterial(String _material){
        material = _material;
    }
    public void establecerPulgadas(int _pulgadas){
        pulgadas = _pulgadas;
    }
    public String obtenerMaterial(){
       return material; 
    }
    public int obtenerPulgadas(){
        return pulgadas;
    }
}
