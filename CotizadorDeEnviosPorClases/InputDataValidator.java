import java.util.Scanner;
public class InputDataValidator {
    public int getValidInt(Scanner scanner, String msg){
        int value;
        while(true){
            System.out.println(msg);
            if(scanner.hasNextInt()){
                value=scanner.nextInt();
                if(value>0){
                    return value;
                }
                System.out.println("El dato esta fuera de rango (1-N)");
            }else{
                System.out.println("El dato no es numerico");
                scanner.next();
            }
        }
    }

    public double leerDoubleEnRango(Scanner scanner,String msg,double min, double max){
        double value;
        while(true){
            System.out.println(msg);
            if(scanner.hasNextDouble()){
                value=scanner.nextDouble();
                if(value>=min && value <= max){
                    return value;
                }
                System.out.println("El valor esta fuera de rango de "+min+" al "+max);
            }else{
                System.out.println("No es un dato numero");
                scanner.next;
            }
        }
    }

    public int leerDoubleEnRango(Scanner scanner,String msg,double min, double max){
        double value;
        while(true){
            System.out.println(msg);
            if(scanner.hasNextInt()){
                value=scanner.nextInt();
                if(value>=min && value <= max){
                    return value;
                }
                System.out.println("El valor esta fuera de rango de "+min+" al "+max);
            }else{
                System.out.println("No es un dato numero");
                scanner.next;
            }
        }
    }

    public boolean leerBoolean(Scanner scanner, String msg){
        while(true) {
            System.out.println(msg);
            if (scanner.hasNextBoolean()) {
                return scanner.nextBoolean();
            }
        }else{
            System.out.println("El valor ingresado no es boolean, solo aceptamos (True o False)");
            scanner.next();
        }
        }
    }
}
