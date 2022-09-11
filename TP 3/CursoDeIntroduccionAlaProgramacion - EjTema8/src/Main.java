public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona ();
        persona.setEdad(25);
        persona.setNombre("Nicolás");
        persona.setTelefono(156459072);


        System.out.println("Tengo " + persona.getEdad() + "años de edad");
        System.out.println("Mi nombre es " + persona.getNombre());
        System.out.println("Mi numero de telefono es " + persona.getTelefono());
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
}
