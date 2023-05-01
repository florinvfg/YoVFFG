package bicicleta.bicicleta;

public class Bicicleta {
    private Long id;
    private String marca;
    private String modelo;
    
    public Bicicleta(Long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Bicicleta() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Object getCliente() {
        return null;
    }
    public void setCliente(Object cliente) {
    }
    
    

}