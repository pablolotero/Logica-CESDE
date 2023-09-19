package usuarioscesde;

import java.util.Scanner;

public class Usuario {
    static Scanner sc = new Scanner(System.in);
    //Primero creamos los atributos encapsulados con private

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private String direccion;
    private String telefono;

    // Vamos a crear nuestro metodo constructor vacio
    public Usuario(){
    }
    //vamos a crear un constructor con parametros


    public Usuario(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //metodos
    public void registrarUsuario() {

        System.out.println("Ingrese su ID: ");
        this.id = sc.nextInt(); // this es un operador que hace referencia a las variables
        System.out.println("Ingrese su Nombre : ");
        this.nombre = sc.next();
        System.out.println("Ingrese su apellido: ");
        this.apellido= sc.next();
        System.out.println("Ingrese su correo: ");
        this.correo=sc.next();
        System.out.println("Ingrese su contraseña: ");
        this.contraseña=sc.next();
        System.out.println("Ingrese su direccion: ");
        this.direccion= sc.next();
        System.out.println("Ingrese su telefono: ");
        this.telefono= sc.next();
    }
    //construimos los getter and setter para permitir el acceso desde los metodos a las variables privadas

    public void setId(int id ){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setNombre(String nombre ){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido ){
        this.apellido=apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setCorreo(String correo ){
        this.correo=correo;
    }
    public String getCorreo(){
        return this.correo;
    }
    public void setContraseña(String contraseña ){
        this.contraseña=contraseña;
    }
    public String getContraseña(){
        return this.contraseña;
    }
    public void setDireccion(String direccion ){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setTelefono(String telefono ){
        this.telefono=telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
    public void iniciarSesion(){
        System.out.println("Ingrese el correo registrado");
        String correRegistrado = sc.next();
        System.out.println("Ingrese la contraseña registrada");
        String contraseñaRegistrada = sc.next();

        if(contraseña.equals(contraseñaRegistrada)&& correo.equals(correRegistrado) ){
            System.out.println("bienvenido" + nombre);
        }else{
            System.out.println("credenciales no validas");
        }
    }
}
