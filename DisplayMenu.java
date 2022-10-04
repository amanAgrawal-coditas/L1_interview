package CafeAllocationSystem;

import java.util.*;

public class DisplayMenu
{

    void menu()
    {
        TreeMap<Integer,String> items=new TreeMap<>();
        items.put(100,"Pasta "+"Serial number:001");
        items.put(150,"Noodles"+"Serial number:002");
        items.put(250,"Paneer Gravy"+"Serial number:003");
        items.put(35,"Nan"+"Serial number:004");
        items.put(40,"Ice Cream"+"Serial number:005");
        items.put(20,"Juice"+"Serial number:006");
        Set<Map.Entry<Integer,String>>menu= items.entrySet();
        for(Map.Entry<Integer,String > entry : menu)
        {
            System.out.println( entry.getKey() + "=>" + entry.getValue() );
        }


    }

}


