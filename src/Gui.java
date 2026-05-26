import java.util.Scanner;

public class Gui {
    public static Scanner sc = new Scanner(System.in);
    static int gui() {
        System.out.println("==================================");
        System.out.println("         HOTEL MANAGEMENT         ");
        System.out.println("==================================");

        System.out.println("1. Crear habitación");
        System.out.println("2. Listar habitaciones");
        System.out.println("3. Buscar habitación");
        System.out.println("4. Reservar habitación");
        System.out.println("5. Cancelar reserva");
        System.out.println("6. Mostrar info hotel");
        System.out.println("7. Salir");

        System.out.println("==================================");
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

}
