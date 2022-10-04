package CafeAllocationSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CafeBookingApplication
{
    public static void main(String[] args)
    {
       Menu menu=new Menu();
       PlacingOrder placingOrder=new PlacingOrder();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        boolean loop=true;
        BookATable bookATable=new BookATable();

        try {
            while (loop = true)
            {
                System.out.println("Enter your choice");
                System.out.println("Enter 0 to exit");
                System.out.println("Enter 1 to book a table");
                System.out.println("Enter 2 to display menu");
                System.out.println("Enter 3 to take order");
                int choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice) {
                    case 0:
                    {
                        System.exit(0);
                        break;
                    }
                    case 1:
                    {
                        bookATable.numberOfPeople();
                        break;
                    }
                    case 2:
                    {
                        menu.menuDisplay();
                        break;
                    }
                    case 3:
                    {
                        placingOrder.placeOrder();
                        break;
                    }
                    default:
                        System.out.println("Enter valid choice");
                }


            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



    }


}
