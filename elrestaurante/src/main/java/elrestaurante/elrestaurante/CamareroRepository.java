package elrestaurante.elrestaurante;

public interface CamareroRepository {

    Object clone() throws CloneNotSupportedException;

    @Override
    boolean equals(Object arg0);

    void finalize() throws Throwable;

    @Override
    int hashCode();

    @Override
    String toString();

}
