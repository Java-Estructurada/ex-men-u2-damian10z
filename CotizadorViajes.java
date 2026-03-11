public class CotizadorViajes {
    public static void main(String[] args) {
        
    public static double calcularTotalVuelos (int adultos, int ninos, double tarifaNoche){
        double costoAdultosNoche = adultos * tarifaNoche;
        double costoNinosNoche * (tarifaNoche * 0.30);
        return(costoAdultosNoche + costoNinosNoche) * noches;
     }
     public static double calcularTotalHospedaje (int adultos, int ninos, double costoHospedaje){
        double costoAdultosNoche = adultos * tarifaNoche;
        double costoNinosNoche * (tarifaNoche * 0.30);
        return(costoAdultosNoche + costoNinosNoche) * noches;
    }
     public static double calcularComision (double subtotal){
        return subtotal * 0.12;

    }
     public static double calcularGranTotal(double subtotal, double comision) {
        return subtotal + comision ;
        }
        }
    