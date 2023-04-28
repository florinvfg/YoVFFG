package elrestaurante.elrestaurante;

import javax.annotation.processing.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "mesas")
public class Mesa {
    @Id
    @Generated(value = { "" })
    private Long id;
    
    private int numero;
    
    private int capacidad;
    
    public Mesa(int numero, int capacidad, boolean ocupada) {
        this.id = id;
        this.numero = numero;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
        this.pedido = pedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    private boolean ocupada;
    
    // Relación uno a uno con Pedido
    @OneToMany(mappedBy = "mesa")
    private Pedido pedido;
    
    // Constructor, getters y setters
}

