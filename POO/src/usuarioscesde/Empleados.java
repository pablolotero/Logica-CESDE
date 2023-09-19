package usuarioscesde;

public class Empleados extends Usuario{

        private  double salario;
        private String area;


        public Empleados(){

        }


        public Empleados(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono, double salario, String area) {
                super(id, nombre, apellido, correo, contraseña, direccion, telefono);
                this.salario = salario;
                this.area = area;
        }

        public double getSalario() {
                return salario;
        }

        public void setSalario(double salario) {
                this.salario = salario;
        }

        public String getArea() {
                return area;
        }

        public void setArea(String area) {
                this.area = area;
        }
}
