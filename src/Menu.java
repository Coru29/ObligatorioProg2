import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Listar los 10 pilotos más mencionados");
            System.out.println("2. Top 15 usuarios con más tweets");
            System.out.println("3. Cantidad de hashtags distintos para un día dado");
            System.out.println("4. Hashtag más usado para un día dado");
            System.out.println("5. Top 7 cuentas con más favoritos");
            System.out.println("6. Cantidad de tweets con una palabra o frase específica");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el mes (MM):");
                    int mes = scanner.nextInt();
                    System.out.println("Ingrese el año (YYYY):");
                    int ano = scanner.nextInt();
                    //la función para ver la lista de 10 pilotos más mencionados

                    break;
                case 2:
                    // la función para mostrar el top de usuarios con más tweets
                    break;
                case 3:
                    System.out.println("Ingrese la fecha (en formato YYYY-MM-DD):");
                    String fecha = scanner.next();
                    // la función para mostrar la cantidad de hashtags distintos
                    break;
                case 4:
                    System.out.println("Ingrese la fecha (en formato YYYY-MM-DD):");
                    String fechaHash = scanner.next();
                    // la función para mostrar el hashtag más usado
                    break;
                case 5:
                    // la función para mostrar las top cuentas con más favoritos
                    break;
                case 6:
                    System.out.println("Ingrese la palabra o frase a buscar:");
                    String busqueda = scanner.next();
                    // la función para contar tweets con una frase específica
                    break;
                case 7:
                    System.out.println("Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no reconocida");
            }
        }
    }



    public static void main(String[] args){
        Menu elMenu = new Menu();

        elMenu.start();
    }


}


