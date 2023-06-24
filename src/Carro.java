public class Carro implements Comparendos {

    private int limiteInferior = 65;

    private int limiteMedio = 66;

    private int limiteSuperior = 85;

    public Carro() {}

    public Carro(int limiteInferior, int limiteMedio, int limiteSuperior) {

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

        String cuerpoMensaje = " //Enviando correo para el tipo carro.";
        String asunto = " //Asunto: comparendo carro";
        return asunto + cuerpoMensaje;

    }

}