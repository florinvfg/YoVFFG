package elrestaurante.elrestaurante;

public interface Proveedor {
    Proveedor proveedor1 = new Proveedor(1, "Distribuidora de Alimentos S.L.", "Calle Mayor 10", "911234567");
    Proveedor proveedor2 = new Proveedor(2, "Bebidas y Licores S.A.", "Calle San Juan 5", "910987654");
    Object clone() throws CloneNotSupportedException;
    @Override
    boolean equals(Object arg0);
    void finalize() throws Throwable;
    @Override
    int hashCode();
    @Override
    String toString();
    
}
