package usuarioscesde;

public class Estudiante  extends  Usuario{
    private String carrera;

    // Constructores
    public Estudiante(){

    }

    public Estudiante(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono, String carrera) {
        super(id, nombre, apellido, correo, contraseña, direccion, telefono);
        this.carrera = carrera;
    }
    //gett and settl


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    //metodos
}
