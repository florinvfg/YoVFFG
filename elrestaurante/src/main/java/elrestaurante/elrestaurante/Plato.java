package elrestaurante.elrestaurante;

import java.util.List;

@Entity
@Table(name = "platos")
public class Plato {
    @Id
    @GeneratedValue(strategy = "")
    private Long id;
    
    private String nombre;
    
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Plato(final Long id, final String nombre, final String descripcion, final double precio, final List<Proveedor> proveedores) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.proveedores = proveedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(final double precio) {
        this.precio = precio;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(final List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    private String descripcion;
    
    private double precio;
    
    // Relación muchos a muchos con Proveedor
    @ManyToMany(mappedBy = "platos")
    private List<Proveedor> proveedores;
    
    // Constructor, getters y setters
}

