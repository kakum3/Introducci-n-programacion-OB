package Tema9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Jesús";
        cliente.edad = 46;
        cliente.telefono= 650183559;
        cliente.credito = 180.77;
        System.out.println ("Mi nombre es " + cliente.nombre +" mi edad es "+ cliente.edad + " mi telefono es "+ cliente.telefono + " mi credito es "+ cliente.credito);

        trabajador.nombre = "Jose";
        trabajador.edad = 47;
        trabajador.telefono = 650183557;
        trabajador.salario = 1800;
        System.out.println ("Soy " + trabajador.nombre + ", tengo " + trabajador.edad +" años mi teléfono es "+trabajador.telefono +" mi salario es "+trabajador.salario);

    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}
class Cliente extends Persona{
    double credito;

}
class Trabajador extends Persona{
    double salario;
}