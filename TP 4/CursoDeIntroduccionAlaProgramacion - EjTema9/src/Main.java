public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Nicolás");
        cliente.setEdad(25);
        cliente.setTelefono(156459072);
        cliente.setCredito(3500);

        System.out.println("- Mi nombre es " + cliente.getNombre());
        System.out.println("- Tengo " + cliente.getEdad() + " años de edad");
        System.out.println("- Mi numero de telefono es " + cliente.getTelefono());
        System.out.println("- Mi credito es de " + cliente.getCredito());



        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Ignacio");
        trabajador.setEdad(23);
        trabajador.setTelefono(153375055);
        trabajador.setSalario(90000);

        System.out.println("- Mi nombre es " + trabajador.getNombre());
        System.out.println("- Tengo " + trabajador.getEdad() + " años de edad");
        System.out.println("- Mi numero de telefono es " + trabajador.getTelefono());
        System.out.println("- Mi salario es de $" + trabajador.getSalario());
    }

    static class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad (int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
        public int getTelefono(){
            return this.telefono;
        }

    }



    static class Cliente extends Persona{

        public Cliente() {
            System.out.println("Hola soy el Cliente:");
        }
        public int credito;

        public void setCredito (int credito) {
            this.credito = credito;
        }
        public int getCredito() {
            return this.credito;
        }
    }



    static class Trabajador extends Persona{
        public Trabajador () {
            System.out.println("Hola soy el Trabajador:");
        }
        public int salario;

        public void setSalario (int salario) {
            this.salario = salario;
        }
        public int getSalario() {
            return this.salario;
        }
    }
}