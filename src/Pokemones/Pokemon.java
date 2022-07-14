package Pokemones;

public abstract class Pokemon {

    protected int numPokedex, generacion;
    protected String nombre, tipo;
    protected double peso;

    abstract void atacarPlacaje();
    abstract void atacarAranazo();
    abstract void atacarMordisco();


}
