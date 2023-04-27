
package myproyecto.myproyecto;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args, char[] provedor1, char[] Plato) {
        
       
        
    
        // Creación de objetos de la clase Camarero
        Camarero camarero1 = new Camarero(7, "Carlos", "Ramírez", "45678901G", 800, "zona1");
        Camarero camarero2 = new Camarero(8, "Lucía", "Gómez", "21098765H", 750, "zona2");
        
        // Creación de objetos de la clase Mesa
        Mesa mesa1 = new Mesa(1, 4, true);
        Mesa mesa2 = new Mesa(2, 6, false);
        
        // Creación de objetos de la clase Plato
        ArrayList<Plato> platos = new ArrayList<>();
        platos.add(new Plato(1, "Hamburguesa", "Carne, lechuga, tomate, queso y bacon", 8.5));
        platos.add(new Plato(2, "Pizza Margarita", "Masa de pizza, tomate y mozzarella", 10));
        platos.add(new Plato(3, "Ensalada César", "Pollo, lechuga, croutones, queso parmesano y salsa César", 7.5));
        
        // Creación de objetos de la clase Pedido
        Pedido pedido1 = new Pedido(1, mesa1, camarero1, platos);
        Pedido pedido2 = new Pedido(2, mesa2, camarero2, platos);
        
        // Creación de objetos de la clase Proveedor
        Proveedor proveedor1 = new Proveedor(1, "Distribuidora de Alimentos S.L.", "Calle Mayor 10", "911234567");
        Proveedor proveedor2 = new Proveedor(2, "Bebidas y Licores S.A.", "Calle San Juan 5", "910987654");
        
        
      
    }
}