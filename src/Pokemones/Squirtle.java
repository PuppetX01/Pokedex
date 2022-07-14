package Pokemones;

import Interface.IAgua;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
        numPokedex = 7;
        nombre = "Squirtle";
        generacion = 1;
        tipo = "Agua";
        peso = 9.0;
    }

    public void DatosSquir() {
        System.out.println("Num de pokedex: "+numPokedex+"\nNombre: "+nombre+"\nTipo: "+tipo+"\nGeneracion: "+generacion+"\nPeso: "+peso);
    }


    //Extiende de Pokemon ataques generales
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle usa ataque Placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Squirtle usa ataque Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Squirtle usa ataque Mordisco");
    }


    //Implementa interfaz de IAgua
    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle usa ataque Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usa ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usa ataque Pistola Agua");
    }
}
