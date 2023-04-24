
public abstract class Empleado {
    
    // Atributos de Empleado
    private String nombre;
    private int id;
    private String puesto;
    private String direccion;
    private String telefono;
    
    // Constructor de Empleado
    public Empleado(String nombre, int id, String puesto, String direccion, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Empleado(){}
    
    // Métodos Getter y Setter de Empleado
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Método abstracto para calcular el salario de cada tipo de Empleado
    public abstract double calcularSalario();
    
}