

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        // Creación de instancias de las clases
        
        // Creación de objetos de la clase Empleado
    
        Empleado empleado1 = new Empleado("Juan",1 , "García", "12345678A", 662457893);
        Empleado empleado2 = new Empleado(2, "María", "López", "87654321B", 1200);
        
        // Creación de objetos de la clase Chef
        Chef chef1 = new Chef(3, "Pedro", "Martínez", "23456789C", 2000, "especialidad1");
        Chef chef2 = new Chef(4, "Ana", "Sánchez", "98765432D", 1800, "especialidad2");
        
        // Creación de objetos de la clase Cocinero
        Cocinero cocinero1 = new Cocinero(5, "David", "González", "34567890E", 1000, "tipo1");
        Cocinero cocinero2 = new Cocinero(6, "Laura", "Fernández", "09876543F", 900, "tipo2");
        
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
        
        // Uso de los objetos
        
        // Imprimir la información de los empleados
        System.out.println("Lista de empleados:");
        System.out.println(empleado1);
        System.out.println(empleado2);
        
        // Imprimir la información de los chefs
        System.out.println("Lista de chefs:");
        System.out.println(chef1);
        System.out.println(chef2);
        
        // Imprimir la información de los cocineros
        System.out.println("Lista de cocineros:");
        System.out.println(cocinero1);
        System.out.println(cocinero2);
        
        // Imprimir la información de los camareros
        System.out.println("Lista de camareros:");
        System.out.println(camarero1);
        System.out.println(camarero2);
    }
}