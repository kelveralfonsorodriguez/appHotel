import java.util.ArrayList;

public class Hotel {
    Gui gui = new Gui();
    Room room1 = new Room(1,1,true);

    Boolean running = true;
    Hotel() {
        this.rooms = new ArrayList();
    }
    private ArrayList<Room> rooms;
    public void addRoom(Room room){
        rooms.add(room);
    }
    public void removeRoom(Room room){
        rooms.remove(room);

    }
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    public Object showRooms(){

        if(rooms.isEmpty()){
            IO.println("No hay habitaciones.");
            return null;
        }

        for(Room room : rooms){
            IO.println(room.toString());
            IO.println("test");
        }
        return null;
    }
    public void start(){
        int option = Gui.gui();
        addRoom(room1);
        IO.println(showRooms());
        IO.println("()");
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
    }




}
