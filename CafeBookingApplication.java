package CafeAllocationSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CafeBookingApplication
{
    public static void main(String[] args)
    {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        boolean loop=true;
        BookATable bookATable=new BookATable();

        try {
            while (loop = true)
            {
                System.out.println("Enter your choice");
                System.out.println("Enter o to exit");
                System.out.println("Enter 1 to book a table");
                System.out.println("Enter 2 to");
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
                        bookATable.menuDisplay();
                        break;
                    }
                    case 3:
                    {
                        bookATable.placeOrder();
                    }

                }


            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



    }


}
