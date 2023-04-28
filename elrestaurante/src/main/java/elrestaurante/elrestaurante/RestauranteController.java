package elrestaurante.elrestaurante;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestauranteController<PedidoService, ProveedorService, CamareroService, MesaService, PlatoService> {
    private final CamareroService camareroService;
    private final ProveedorService proveedorService;
    private final MesaService mesaService;
    private final PedidoService pedidoService;
    private final PlatoService platoService;

    public RestauranteController(CamareroService camareroService, ProveedorService proveedorService,
                                 MesaService mesaService, PedidoService pedidoService, PlatoService platoService) {
        this.camareroService = camareroService;
        this.proveedorService = proveedorService;
        this.mesaService = mesaService;
        this.pedidoService = pedidoService;
        this.platoService = platoService;
    }

    // Endpoints para Camarero
    @GetMapping("/camareros")
    public List<Camarero> obtenerTodosLosCamareros() {
        return ((Object) camareroService).obtenerTodosLosCamareros();
    }

    @GetMapping("/camareros/{id}")
    public Camarero obtenerCamareroPorId(@PathVariable Long id) {
        return camareroService.obtenerCamareroPorId(id);
    }

    @PostMapping("/camareros")
    public Camarero crearCamarero(@RequestBody Camarero camarero) {
        return ((Object) camareroService).crearCamarero(camarero);
    }

    // Endpoints para Proveedor
    @GetMapping("/proveedores")
    public List<Proveedor> obtenerTodosLosProveedores() {
        return ((Object) proveedorService).obtenerTodosLosProveedores();
    }

    @GetMapping("/proveedores/{id}")
    public Proveedor obtenerProveedorPorId(@PathVariable Long id) {
        return ((Object) proveedorService).obtenerProveedorPorId(id);
    }

    @PostMapping("/proveedores")
    public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
        return ((Object) proveedorService).crearProveedor(proveedor);
    }

    // Endpoints para Mesa
    @GetMapping("/mesas")
    public List<Mesa> obtenerTodasLasMesas() {
        return ((Object) mesaService).obtenerTodasLasMesas();
    }

    @GetMapping("/mesas/{id}")
    public Mesa obtenerMesaPorId(@PathVariable Long id) {
        return mesaService.obtenerMesaPorId(id);
    }

    @PostMapping("/mesas")
    public Mesa crearMesa(@RequestBody Mesa mesa) {
        return ((Object) mesaService).crearMesa(mesa);
    }

    // Endpoints para Pedido
    @GetMapping("/pedidos")
    public List<Pedido> obtenerTodosLosPedidos() {
        return pedidoService.obtenerTodosLosPedidos();
    }

    @GetMapping("/pedidos/{id}")
    public Pedido obtenerPedidoPorId(@PathVariable Long id) {
        return pedidoService.obtenerPedidoPorId(id);
    }

    @PostMapping("/pedidos")
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        return pedidoService.crearPedido(pedido);
    }

    // Endpoints para Plato
    @GetMapping("/platos")
    public List<Plato> obtenerTodosLosPlatos() {
        return platoService.obtenerTodosLosPlatos();
    }

    @GetMapping("/platos/{id}")
    public Plato obtenerPlatoPorId(@PathVariable Long id) {
        return platoService.obtenerPlatoPorId(id);
    }

    @PostMapping("/platos")
    public Plato crearPlato(@RequestBody Plato plato) {
        return platoService.crearPlato

    }
}