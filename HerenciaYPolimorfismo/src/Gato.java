public class Gato extends Animal {
    //Extends = Define la herencia
    public Gato (String name){
        super(name);
    }
    @Override
    public void hacerSonido(){
        System.out.println(name+" hace Miau o Rawrl");
    }
}
