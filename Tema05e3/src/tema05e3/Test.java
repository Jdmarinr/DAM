
package tema05e3;

/**
 *
 * @author Aritz y Juan David
 */
public class Test {

    public static void main(String[] args) {
        
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        rueda1.establecerMaterial("Madera");
        rueda1.establecerPulgadas(20);
        rueda2.establecerMaterial("Caucho");
        rueda2.establecerPulgadas(15);
        
        System.out.println("\n---- Rueda 1 ----");
        System.out.println("Material: " + rueda1.obtenerMaterial());
        System.out.println("Tamaño : " + rueda1.obtenerPulgadas() + "\"");
        System.out.println("\n---- Rueda 2 ----");
        System.out.println("Material: " + rueda2.obtenerMaterial());
        System.out.println("Tamaño : " + rueda2.obtenerPulgadas() + "\"");
        
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        coche1.establecerMarca("Renault");
        coche1.establecerModelo("Megane");
        coche2.establecerMarca("Peugeot");
        coche2.establecerModelo("307");
        coche3.establecerMarca("Toyota");
        coche3.establecerModelo("Auris");
        
        coche1.establecerRueda(rueda1);
        coche2.establecerRueda(rueda1);
        coche3.establecerRueda(rueda2);
        
        System.out.println("\n-------- Coche 1 --------");
        System.out.println("Marca: " + coche1.obtenerMarca());
        System.out.println("Modelo: " + coche1.obtenerModelo());
        System.out.println("Ruedas: ");
        System.out.println("\tMaterial :" + coche1.obtenerRueda().obtenerMaterial());
        System.out.println("\tTamaño :" + coche1.obtenerRueda().obtenerPulgadas());
        System.out.println("\n-------- Coche 2 --------");
        System.out.println("Marca: " + coche2.obtenerMarca());
        System.out.println("Modelo: " + coche2.obtenerModelo());
        System.out.println("Ruedas: ");
        System.out.println("\tMaterial :" + coche2.obtenerRueda().obtenerMaterial());
        System.out.println("\tTamaño :" + coche2.obtenerRueda().obtenerPulgadas());
        System.out.println("\n-------- Coche 3 --------");
        System.out.println("Marca: " + coche3.obtenerMarca());
        System.out.println("Modelo: " + coche3.obtenerModelo());
        System.out.println("Ruedas: ");
        System.out.println("\tMaterial :" + coche3.obtenerRueda().obtenerMaterial());
        System.out.println("\tTamaño :" + coche3.obtenerRueda().obtenerPulgadas());      
    }
    
}
