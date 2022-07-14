import Pokemones.*;

public class Main {

    public static void main(String[] args) {

        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charm = new Charmander();
        Squirtle squirtle = new Squirtle();


        bulbasaur.DatosBulba();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarParalizar();
        bulbasaur.atacarPlacaje();
        bulbasaur.atacarAranazo();
        bulbasaur.atacarMordisco();


        charm.DatosChar();
        charm.atacarAscuas();
        charm.atacarLanzallamas();
        charm.atacarPunoFuego();
        charm.atacarPlacaje();
        charm.atacarAranazo();
        charm.atacarMordisco();


        squirtle.DatosSquir();
        squirtle.atacarBurbuja();
        squirtle.atacarPistolaAgua();
        squirtle.atacarHidrobomba();
        squirtle.atacarAranazo();
        squirtle.atacarMordisco();


        pikachu.DatosPika();
        pikachu.atacarImpactrueno();
        pikachu.atacarPunoTrueno();
        pikachu.atacarPlacaje();
        pikachu.atacarAranazo();
        pikachu.atacarMordisco();


    }

}
