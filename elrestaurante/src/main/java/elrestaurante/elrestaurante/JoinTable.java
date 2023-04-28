package elrestaurante.elrestaurante;

public @interface JoinTable {

    String name();

    JoinColumn joinColumns();

    JoinColumn inverseJoinColumns();

}
