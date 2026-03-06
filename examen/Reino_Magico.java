public class Reino_Magico{

     private String nombre;
    private int edad;
    private String raza;
    private int nivel;

    //vacio
    public static int totalPersonajes = 0;
    public Personaje() {
    }

    // parametros
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

     public void saludar() {
        System.out.println("El personaje " +this.nombre + " saluda al reino magico");
    }
    public void subirNivel(){
        this.nivel++;

    }
    public void entrenar(){
        this.nivel+=2;
    }
    
     // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
