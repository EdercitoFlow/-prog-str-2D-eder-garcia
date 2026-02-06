import java.util.Scanner;
public class Main{
    public static void main(String [] args) throws Exception{
        Scanner scanner= new Scanner (System.in);
        InputDataValidator inputDataValidator = new InputDataValidator();
        double peso = inputDataValidator.leerDoubleEnRango(scanner,"Ingresa el peso en kilogramos",0.1,50);
        int distanciaKm= inputDataValidator.leerIntEnRango(scanner,"Ingresa la distancia en kilometros",1,200);
        int tipoServicio=inputDataValidator.leerIntEnRango(scanner,"Ingresa el tipo de servicio");
        boolean esZonaRemota=inputDataValidator.leerBoolean(scanner,"¿Es zona remota?");

        System.out.println("pesoKg: "+pesoKg);
        System.out.println("distanciaKm: "+distanciaKm);
        System.out.println("tipoServicio: "+tipoServicio);
        System.out.println("esZonaRemota: "+esZonaRemota);
            }
        }

    }
}