public class Mula implements Comparendos {

    private int limiteInferior = 95;

    private int limiteMedio = 96;

    private int limiteSuperior = 110;

    public Mula() {}

    public Mula(int limiteInferior, int limiteMedio, int limiteSuperior) {

        this.limiteInferior = limiteInferior;
        this.limiteMedio = limiteMedio;
        this.limiteSuperior = limiteSuperior;

    }

    @Override
    public void contruirFotoMulta(int velocidad) {

        int nivelMulta = calcularComparendo(velocidad);
        String infoMulta = enviarCorreoFotomulta();

        System.out.println("---- El tipo de comparendo es: " + nivelMulta + " ---- Cuerpo del correo" + infoMulta);

    }

    @Override
    public int calcularComparendo(int velocidad) {

            if(velocidad<=limiteInferior) {
                return 0;
            }else if (velocidad >= limiteMedio && velocidad <= limiteSuperior) {
                return 1;
            }
            return 2;

    }

    @Override
    public String enviarCorreoFotomulta() {

        String cuerpoMensaje = " //enviando correo para el tipo mula.";
        String asunto = " //asunto: comparendo mula";
        return asunto + cuerpoMensaje;

    }

}