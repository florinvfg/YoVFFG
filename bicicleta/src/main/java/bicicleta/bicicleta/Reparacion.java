package bicicleta.bicicleta;

import org.springframework.beans.factory.annotation.Autowired;

public class Reparacion {
    private Bicicleta bicicleta = new Bicicleta();
    private Cliente cliente = new Cliente();
  
    // Propiedades y métodos de la reparacion…
    
        
        // Constructor que acepta las dependencias como argumentos
        @Autowired
        public Reparacion(Bicicleta bicicleta, Cliente cliente) {
          this.bicicleta = bicicleta;
          this.cliente = cliente;
        }
        // Propiedades y métodos de la reparacion…
        
           
           
            // Propiedades y métodos del alquiler
          }
          
      



  

