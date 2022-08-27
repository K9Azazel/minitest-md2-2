package view;
import model.Booking;
import model.Human;
import model.Room;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import controller.HotelManager;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Mắc Goai","1993",12345678);
        Human human2 = new Human("Mì Tôm","1996",9876543);
        Human human3 = new Human("San trố","2000",24342355);
        Human human4 = new Human("Bủ Nô","1994",312543252);
        Human human5 = new Human("Phờ Rét","1997",234354365);
        ArrayList<Human> human = new ArrayList<>();
        human.add(human1);
        human.add(human2);
        human.add(human3);
        human.add(human4);
        human.add(human5);
        Room room1 = new Room("Royal","Đồ Sơn",100);
        Room room2 = new Room("VIP1","Hạ Long",50);
        Room room3 = new Room("VIP2","Ninh Bình",10);
        Room room4 = new Room("Normal","Huế",5);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        HotelManager daeWoo = new HotelManager(human, rooms);
//        Booking bookingOfQuan = new Booking();
//        bookingOfQuan.setHuman(human1);
//        bookingOfQuan.setRoom(room1);
//        bookingOfQuan.setCheckin(LocalDate.of(2022,9,1));
//        bookingOfQuan.setCheckout(LocalDate.of(2022,9,4));
//        System.out.println(bookingOfQuan.getTotalPrice());

    }
}
