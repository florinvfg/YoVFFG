package elrestaurante.elrestaurante;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElrestauranteApplication implements CommandLineRunner  {
	

		@Autowired
		private CamareroRepository camareroRepository;
	
		@Autowired
		private ProveedorRepository proveedorRepository;
	
		@Autowired
		private MesaRepository mesaRepository;
	
		public CamareroRepository getCamareroRepository() {
			return camareroRepository;
		}


		public void setCamareroRepository(CamareroRepository camareroRepository) {
			this.camareroRepository = camareroRepository;
		}


		public ProveedorRepository getProveedorRepository() {
			return proveedorRepository;
		}


		public void setProveedorRepository(ProveedorRepository proveedorRepository) {
			this.proveedorRepository = proveedorRepository;
		}


		public MesaRepository getMesaRepository() {
			return mesaRepository;
		}


		public void setMesaRepository(MesaRepository mesaRepository) {
			this.mesaRepository = mesaRepository;
		}


		public PedidoRepository getPedidoRepository() {
			return pedidoRepository;
		}


		public void setPedidoRepository(PedidoRepository pedidoRepository) {
			this.pedidoRepository = pedidoRepository;
		}


		public PlatoRepository getPlatoRepository() {
			return platoRepository;
		}


		public void setPlatoRepository(PlatoRepository platoRepository) {
			this.platoRepository = platoRepository;
		}


		@Autowired
		private PedidoRepository pedidoRepository;
	
		@Autowired
		private PlatoRepository platoRepository;
	
	
		
	
		@Override
		public void run(String... args) throws Exception {
			// Aquí puedes realizar operaciones de prueba o inicialización de datos si deseas
			// Por ejemplo, crear instancias de las entidades y guardarlas en la base de datos
		}
	
	
	public ElrestauranteApplication(CamareroRepository camareroRepository, ProveedorRepository proveedorRepository,
				MesaRepository mesaRepository, PedidoRepository pedidoRepository, PlatoRepository platoRepository) {
			this.camareroRepository = camareroRepository;
			this.proveedorRepository = proveedorRepository;
			this.mesaRepository = mesaRepository;
			this.pedidoRepository = pedidoRepository;
			this.platoRepository = platoRepository;
		}
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
  
  

	public static void main(String[] args) {
		SpringApplication.run(ElrestauranteApplication.class, args);
	}

}
