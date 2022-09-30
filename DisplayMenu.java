package CafeAllocationSystem;

import java.util.HashMap;
import java.util.Map;

public class DisplayMenu
{

    void menu()
    {
        HashMap<String,Integer> items=new HashMap<>();
        items.put("Pasta "+"Serial number:001",100);
        items.put("Noodles"+"Serial number:002",150);
        items.put("Paneer Gravy"+"Serial number:003",250);
        items.put("Nan"+"Serial number:004",35);
        items.put("Ice Cream"+"Serial number:005",40);
        items.put("Juice"+"Serial number:006",20);
        for(Map.Entry<String,Integer> set:items.entrySet())
        {
            System.out.println(set.getKey()+ "=" +set.getValue());
        }

    }

}


