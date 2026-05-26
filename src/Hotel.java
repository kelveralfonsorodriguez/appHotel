import java.util.ArrayList;
import java.util.ArrayList;

public class Hotel {

    private Gui gui = new Gui();
    private Room room1 = new Room(1, 1, true);
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

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void showRooms() {
        if (rooms.isEmpty()) {
            IO.println("No hay habitaciones.");
            return;
        }
        for (Room room : rooms) {
            IO.println(room.toString());
        }
    }

    public void start() {
        int option = Gui.gui();
        addRoom(room1);
        showRooms();
    }
}





 /* switch(option){
            case 1:
                IO.println("pepe");
                break;
                case 2:
                   IO.println(showRooms());
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
*/