package controller;

import model.Room;
import model.Human;
import model.Booking;
import java.util.ArrayList;

public class HotelManager {
    public HotelManager(ArrayList<Human> userList, ArrayList<Room> roomList) {
        this.userList = userList;
        this.roomList = roomList;
    }
    public HotelManager() {
        this.userList = userList;
        this.roomList = roomList;
    }
    ArrayList<Human> userList = new ArrayList<>();
    ArrayList<Room> roomList = new ArrayList<>();
    ArrayList<Booking> booking = new ArrayList<>();

    public void addRoom(Room room){
        roomList.add(room);
    }
    public long getTotal(){
        long total = 0;
        for (Booking booking: booking
             ) {
            total+=booking.getTotalPrice();
        }
        return total;
    }
}