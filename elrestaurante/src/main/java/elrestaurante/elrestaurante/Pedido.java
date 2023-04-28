package elrestaurante.elrestaurante;

import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = "")
    private int id;
    
    // Relación muchos a uno con Camarero
    @ManyToOne
    @JoinColumn(name = "camarero_id")
    private Camarero camarero;
    
    // Relación uno a uno con Mesa
    @OneToOne
    @JoinColumn(name = "mesa_id")
    private Mesa mesa;
    
    public int getId() {
        return id;
    }

    public Pedido(int i, Mesa camarero1, Camarero mesa1, List<Plato> platos) {
        this.id = i;
        this.camarero = mesa1;
        this.mesa = camarero1;
        this.platos = platos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }

    // Relación muchos a muchos con Plato
    @ManyToMany(mappedBy = "")
    @JoinTable(
        name = "pedido_plato",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "plato_id")
    )
    private List<Plato> platos;
    
    // Constructor, getters y setters
}

