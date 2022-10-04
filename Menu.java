package CafeAllocationSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu
{
    static String foodItem;
    DisplayMenu displayMenu=new DisplayMenu();
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
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
}
