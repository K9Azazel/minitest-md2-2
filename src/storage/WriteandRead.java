package storage;

import controller.HotelManager;

import java.io.*;

public class WriteandRead {
    private static final String LINK_DATA_HOTEL = "G:\\c0622i1\\minitest-md2-2\\hotelHongQuan.txt";

    public static void writeDataHotel(HotelManager hotelManager){
        try {
            FileOutputStream fis = new FileOutputStream(LINK_DATA_HOTEL);
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(hotelManager);
            oos.close();
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static HotelManager readDataHotel(){
        HotelManager hotelManager = null;
        try {
            FileInputStream fis = new FileInputStream(LINK_DATA_HOTEL);
            ObjectInputStream ois = new ObjectInputStream(fis);
            hotelManager = (HotelManager) ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return hotelManager;
    }
}