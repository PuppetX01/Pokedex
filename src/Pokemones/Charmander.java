package Pokemones;

import Interface.IFuego;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
        numPokedex = 4;
        nombre = "Charmander";
        generacion = 1;
        tipo = "Fuego";
        peso = 8.5;
    }

    public void DatosChar() {
        System.out.println("Num de pokedex: "+numPokedex+"\nNombre: "+nombre+"\nTipo: "+tipo+"\nGeneracion: "+generacion+"\nPeso: "+peso);
    }


    //Extiende de Pokemon ataques generales
    @Override
    public void atacarPlacaje() {
        System.out.println("Charmander usa ataque Placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Charmander usa ataque Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Charmander usa ataque Mordisco");
    }


    //Implementa interfaz de IFuego
    @Override
    public void atacarPunoFuego() {
        System.out.println("Charmander usa ataque Puño Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander usa ataque Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usa ataque Ascuas");
    }
}
