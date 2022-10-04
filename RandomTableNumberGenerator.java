package CafeAllocationSystem;

import java.util.Random;

public class RandomTableNumberGenerator
{
    Random random=new Random();

    public int RandomTableNumber()
    {
        return random.nextInt(30);
    }
}
