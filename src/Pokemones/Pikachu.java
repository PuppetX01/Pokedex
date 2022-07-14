package Pokemones;

import Interface.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
        numPokedex = 25;
        nombre = "Pikachu";
        generacion = 1;
        tipo = "Electrico";
        peso = 6.0;
    }

    public void DatosPika() {
        System.out.println("Num de pokedex: "+numPokedex+"\nNombre: "+nombre+"\nTipo: "+tipo+"\nGeneracion: "+generacion+"\nPeso: "+peso);
    }


    //Extiende de Pokemon ataques generales
    @Override
    public void atacarPlacaje() {
        System.out.println("Pikachu usa ataque Placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Pikachu usa ataque Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Pikachu usa ataque Mordisco");
    }


    //Implementa interfaz de IElectrico
    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu usa ataque Impactrueno");
    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println("Pikachu usa ataque PuñoTrueno");
    }
}
