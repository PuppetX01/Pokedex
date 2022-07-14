package Pokemones;

import Interface.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
        numPokedex = 1;
        nombre = "Bulbasaur";
        generacion = 1;
        tipo = "Planta"+"Veneno";
        peso = 6.9;
    }

    public void DatosBulba() {
        System.out.println("Num de pokedex: "+numPokedex+"\nNombre: "+nombre+"\nTipo: "+tipo+"\nGeneracion: "+generacion+"\nPeso: "+peso);
    }


    //Extiende de Pokemon ataques generales
    @Override
    public void atacarPlacaje() {
        System.out.println("Bulbasaur usa ataque Placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Bulbasaur usa ataque Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Bulbasaur usa ataque Mordisco");
    }


    //Implementa interfaz de IPlanta
    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur usa ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usa ataque Paralizar");
    }

}
