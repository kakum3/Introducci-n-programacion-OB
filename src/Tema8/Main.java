package Tema8;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setName("Jesús");
        System.out.println ("Mi Nombre: " + persona.getName());
        persona.setAge (46);
        System.out.println ("Tengo: " + persona.getAge());
        persona.setTelephone(650183559);
        System.out.println ("Mi telephone is: " + persona.getTelephone());
    }
}
class Persona{
    private String name;
    private int age;
    private int telephone;

    public void setName(String name){
    this.name = name;
    }
    public String getName( ){
        return name;

    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge( ){
        return age;
    }
    public void setTelephone(int telephone){
        this.telephone = telephone;
    }
    public int getTelephone( ){
        return telephone;
    }
}
