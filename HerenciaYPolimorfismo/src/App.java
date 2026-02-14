public class App {
public static void Main (String[]args){
    //Herencia
    Perro dogo=new Perro("Dogo");
    Gato rawrl=new Gato("rawrl");
        dogo.comer();
        dogo.hacerSonido();

        rawrl.comer();
        rawrl.hacerSonido();
        //Polimorfismo
        Animal[] animales= new Animal[3];
        animales[0]= new Perro("Ramonchis");
        animales[1]= new Gato("Salem");
        animales[2]= new Perro("Firulais");
        for(Animal animal : animales){
            animal.hacerSonido();
        }
    System.out.println("----------------------------");
        Animal miercoles = new Perro("miercoles");

        if(miercoles instanceof Perro){
        Perro miercoles1 = (Perro) miercoles;
        miercoles1.marcarTerritorio();
        }
}
}
