public class Camion implements Comparendos {

    private int limiteInferior = 75;

    private int limiteMedio = 76;

    private int limiteSuperior = 95;

    public Camion() {}

    public Camion(int limiteInferior, int limiteMedio, int limiteSuperior) {

        this.limiteInferior = limiteInferior;
        this.limiteMedio = limiteMedio;
        this.limiteSuperior = limiteSuperior;

    }

    @Override
    public void contruirFotoMulta(int velocidad) {

        int nivelMulta = calcularComparendo(velocidad);
        String infoMulta = enviarCorreoFotomulta();

        System.out.println("---- El tipo de comparendo es: " + nivelMulta + " ---- Cuerpo del correo:" + infoMulta);

    }

    @Override
    public int calcularComparendo(int velocidad) {

        if(velocidad <= limiteInferior) {
            return 0;
        }else if (velocidad >= limiteMedio && velocidad <= limiteSuperior) {
            return 1;
        } else {
            return 2;
        }

    }

    @Override
    public String enviarCorreoFotomulta() {

        String cuerpoMensaje = " //enviando correo para el tipo camion.";
        String asunto = " //asunto: comparendo camion";
        return asunto + cuerpoMensaje;

    }

}