public class Reino_Magico{
     private String nombre;
    private int edad;
    private String raza;
    private int nivel;

    //contructor vacio
    public static int totalPersonajes = 0;
    public Personaje() {
    }

    // Constructor parametros
    public Personaje(String nombre, int edad, String raza, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.nivel = nivel;
    }
       // Métodos
    public void mostrarInfo() {
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Edad: " +this.edad);
        System.out.println("Raza: " +this.raza);
        System.out.println("Nivel: " +this.nivel);
    }


    
}