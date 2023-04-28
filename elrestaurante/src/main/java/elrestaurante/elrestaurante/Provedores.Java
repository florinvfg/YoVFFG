@Entity
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    // Relación muchos a muchos con Plato
    @ManyToMany
    @JoinTable(
        name = "proveedor_plato",
        joinColumns = @JoinColumn(name = "proveedor_id"),
        inverseJoinColumns = @JoinColumn(name = "plato_id")
    )
    private List<Plato> platos;
    
    // Constructor, getters y setters
}
