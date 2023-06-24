public class Main {

    public static void main(String[] args) {

        //Esto es del codigo original
    /*    Comparendo comparendo =  new Comparendo();
        comparendo.construirFotoMulta(80, "CARRO");
        comparendo.construirFotoMulta(200, "MULA");
        comparendo.construirFotoMulta(40, "CAMION");
        comparendo.construirFotoMulta(40, "AVION");

        System.out.println("");*/

        Carro carro = new Carro();
        Camion camion = new Camion();
        Mula mula = new Mula();

        carro.contruirFotoMulta(80);
        camion.contruirFotoMulta(200);
        mula.contruirFotoMulta(40);

    }

}