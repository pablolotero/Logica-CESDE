package usuarioscesde;

public class Test {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(); // hemos creado una instancia de la clase Usuario
        Usuario usurioPepito = new Usuario();
        Estudiante estudiante = new Estudiante();
        Usuario nicolas= new Usuario();

       /* String nombre="Nicolas";
        nicolas.setNombre(nombre);


        System.out.println(nicolas.toString());

        String correo="pirata@gmail.com";

        System.out.println(nicolas.getNombre());*/

        nicolas.registrarUsuario();

        System.out.println(nicolas.toString());

        nicolas.iniciarSesion();


        estudiante.setNombre("Pepito");
        System.out.println(estudiante.getNombre());



    }
}
