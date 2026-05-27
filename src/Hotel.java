import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    private Gui gui = new Gui();

    private boolean running = true;
    private ArrayList<Room> rooms;

    Hotel() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }
    Scanner input = new Scanner(System.in);
    public void makeRoom() {

        IO.println("Please enter the number of rooms you would like to make: ");
        int roomNumber = input.nextInt();
        for (int i = 0; i < roomNumber; i++) {
            int roomNumber1 = i + 1;
            IO.println("Please enter room price: ");
            int roomPrice = input.nextInt();
            Room room = new Room(roomNumber1, roomPrice, true);
            addRoom(room);
            continua();
            // hacen falta mejoras en logica solo se puede añadir en primer vez despues sobreescriben
        }
    }
    public void showRooms() {
        if (rooms.isEmpty()) {
            IO.println("No hay habitaciones.");
            return;
        }
        for (Room room : rooms) {
            IO.println(room.toString());
        }
        continua();
    }
    void continua(){
        IO.println("quieres continuar?");
        if (input.next().equals("n")) {
            running = false;
        }
    }
    public void start() {
        while (running) {
            int option = Gui.gui();
            switch(option){
                case 1:
                    IO.println("pepe");
                    makeRoom();

                    break;
                case 2:
                    showRooms();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
        }
        }
    }}





 /*

        }
*/