public class ShippingCalculator{

    public double pesoKg;
    public int distanciaKm;
    public int tipoServicio;
    public boolean esZonaRemota;
    private final double IVA=0.16;
    private final double PREICO_ESTANDAR=
    private final double PRECIO_EXPRESS=90;



    double calcularSubtotal(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota){
        return 0;
    }

    double calcularIVA(double subtotal){
        return 0;
    }

    double calcularTotal(double subtotal, double iva){
        return subtotal+calcularIVA();
    }

}