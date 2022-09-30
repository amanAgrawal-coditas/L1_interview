package CafeAllocationSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class BookATable
{
   static int smallTables=8;
    static int smallfamilyTables=4;
    static int largeFamilyTables=2;
    static int jointFamilyTables=2;
    static String foodItem;
    int reservation;
    RandomTableNumberGenerator randomTableNumberGenerator=new RandomTableNumberGenerator();
    DisplayMenu displayMenu=new DisplayMenu();
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    void numberOfPeople() throws BookingNotAvailableException {
        try {
            System.out.println("Enter your name you want to book table for");
            String nameOfCustomer = bufferedReader.readLine();
            System.out.println("Enter the number of people you want to book the table for");
            int numberOfPeople = Integer.parseInt(bufferedReader.readLine());
            if (numberOfPeople > 0 || numberOfPeople <= 2) {
                if (smallTables > 0) {
                    System.out.println("The small table has been booked with table number " + randomTableNumberGenerator.tableNumber);
                    smallTables--;
                    reservation = 1;

                } else {
                    System.out.println("No seats available");
                }
            } else if (numberOfPeople > 2 || numberOfPeople <= 4) {
                if (smallfamilyTables > 0) {
                    System.out.println("The small family Table has been booked with table number " + randomTableNumberGenerator.tableNumber);
                    smallfamilyTables--;
                    reservation = 1;
                } else {
                    System.out.println("No seats available");
                }
            } else if (numberOfPeople > 4 || numberOfPeople <= 6) {
                if (largeFamilyTables > 0) {
                    System.out.println("The large family table has been booked " + randomTableNumberGenerator.tableNumber);
                    largeFamilyTables--;
                    reservation = 1;
                } else {
                    System.out.println("No seats available");
                }


            } else if (numberOfPeople > 6 || numberOfPeople <= 8) {
                if (jointFamilyTables > 0) {
                    System.out.println("The joint family table has been booked " + randomTableNumberGenerator.tableNumber);
                    jointFamilyTables--;
                    reservation = 1;
                } else {
                    System.out.println("No seats available");
                }
            } else {
                System.out.println("Booking not Possible");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        if(reservation!=1)
        {
            try
            {
                throw new BookingNotAvailableException();
            }
            catch (BookingNotAvailableException bookingNotAvailableException)
            {
                System.out.println("Booking not available");
            }

        }
    }
    void menuDisplay()
    {
        try
        {
            System.out.println("the Menu goes as follows");
            displayMenu.menu();
            System.out.println("Enter the food item you want to order");
            foodItem=bufferedReader.readLine();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
    void placeOrder() throws IOException
    {
        displayMenu.menu();
        System.out.println("Enter table number");
        int tableNumber=Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the quantity you want to order");
        int numberOfOrder=Integer.parseInt(bufferedReader.readLine());

    }

}
