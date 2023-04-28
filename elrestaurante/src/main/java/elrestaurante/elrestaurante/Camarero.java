package elrestaurante.elrestaurante;

import java.util.List;

import javax.annotation.processing.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "camareros")
public class Camarero {
    @Id
    @Generated(value = { "" })
    private Long id;
    
  

    private String nombre;
    
    // Relación uno a muchos con Pedidos
    @OneToMany(mappedBy = "camarero")
    private List<Pedido> pedidos;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Camarero(final Long id, final String nombre, final List<Pedido> pedidos) {
        this.id = id;
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    public Camarero(int i, String string, String string2, String string3, int j, String string4) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(final List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    // Constructor, getters y setters
}
