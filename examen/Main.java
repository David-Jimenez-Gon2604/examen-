public class Main {

    public static void main(String[] args) {

        PedirDatos pd = new PedirDatos();

        System.out.println("1 Crear Mago");
        System.out.println("2 Crear Guerrero");
        System.out.println("3 Mostrar total de personajes");

        int opcion = pd.pedirInt("Seleccione una opcion");

        if(opcion == 1){

            String nombre = pd.pedirString("Nombre");
            int edad = pd.pedirInt("Edad");
            String raza = pd.pedirString("Raza");
            int nivel = pd.pedirInt("Nivel");
            String tipoMagia = pd.pedirString("Tipo de magia");
            int mana = pd.pedirInt("Mana");

            Mago m = new Mago(nombre, edad, raza, nivel, tipoMagia, mana);

            m.mostrarInfo();
            m.saludar();
            m.lanzarHechizo();
            m.mostrarMana();
        }

        else if(opcion == 2){

            String nombre = pd.pedirString("Nombre");
            int edad = pd.pedirInt("Edad");
            String raza = pd.pedirString("Raza");
            int nivel = pd.pedirInt("Nivel");
            String arma = pd.pedirString("Arma");
            int fuerza = pd.pedirInt("Fuerza");

            Guerrero g = new Guerrero(nombre, edad, raza, nivel, arma, fuerza);

            g.mostrarInfo();
            g.saludar();
            g.atacar();
            g.entrenarFuerza();
            g.mostrarFuerza();
        }

        else if(opcion == 3){
            System.out.println("Total de personajes creados: " + Personaje.totalPersonajes);
        }

    }
}