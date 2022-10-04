package CafeAllocationSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlacingOrder
{
    Menu menu=new Menu();
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    void placeOrder() throws IOException
    {
        menu.menuDisplay();
        System.out.println("Enter table number");
        int tableNumber=Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the quantity you want to order");
        int numberOfOrder=Integer.parseInt(bufferedReader.readLine());
        for(int i=0;i<numberOfOrder;i++)
        {

        }

    }
}
