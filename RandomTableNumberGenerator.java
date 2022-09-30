package CafeAllocationSystem;

import java.util.Random;

public class RandomTableNumberGenerator
{
    int tableNumber;
    Random random=new Random();

    public int RandomTableNumberGenerator()
    {
        return tableNumber=random.nextInt(30);
    }
}
