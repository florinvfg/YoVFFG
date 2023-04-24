

public class Mesa {
    
    // Atributos de Mesa
    private int numMesa;
    private int capacidad;
    private boolean ocupada;
    private String tipo;
    
    // Constructor de Mesa
    public Mesa(int numMesa, int capacidad, boolean ocupada) {
        this.numMesa = numMesa;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
        this.tipo = tipo;
    }
    
    // Métodos Getter y Setter de Mesa
    public int getNumMesa() {
        return numMesa;
    }
    
    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
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
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // Método para ocupar una mesa
    public void ocuparMesa() {
        this.ocupada = true;
    }
    
    // Método para liberar una mesa
    public void liberarMesa() {
        this.ocupada = false;
    }
    
}