package myproyecto.myproyecto;

public class Camarero {
    private boolean tienePropinas;
    private String nombre;
    private int id;
    private String puesto;
    private String direccion;
    private String telefono;
    // Atributos de Camarero
    private int numMesasAsignadas;
    public Camarero(int numMesasAsignadas, boolean tienePropinas, String nombre, int id, String puesto,
            String direccion, String telefono) {
        this.numMesasAsignadas = numMesasAsignadas;
        this.tienePropinas = tienePropinas;
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.direccion = direccion;
        this.telefono = telefono;
    }

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

   

    // Constructor de Camarero
    public Camarero(String nombre, int id, String puesto, String direccion, String telefono, int numMesasAsignadas, boolean tienePropinas) {
        super();
        this.numMesasAsignadas = numMesasAsignadas;
        this.tienePropinas = tienePropinas;
    }
    

    

    public Camarero(int i, String string, String string2, String string3, int j, String string4) {
    }




    // Métodos Getter y Setter de Camarero
    public int getNumMesasAsignadas() {
        return numMesasAsignadas;
    }
    
    public void setNumMesasAsignadas(int numMesasAsignadas) {
        this.numMesasAsignadas = numMesasAsignadas;
    }
    
    public boolean isTienePropinas() {
        return tienePropinas;
    }
    
    public void setTienePropinas(boolean tienePropinas) {
        this.tienePropinas = tienePropinas;
    }
    
    // Implementación del método abstracto de Empleado para calcular el salario de Camarero
   /*  @Override
    public double calcularSalario() {
        double salarioBase = 1000;
        double salarioMesas = this.numMesasAsignadas * 50;
        double salarioPropinas = this.tienePropinas ? 100 : 0;
        return salarioBase + salarioMesas + salarioPropinas;*/
    

    public void tomarPedido(Pedido pedido1) {
    }

    public void servirPlato(Plato plato1) {
    }
    
}