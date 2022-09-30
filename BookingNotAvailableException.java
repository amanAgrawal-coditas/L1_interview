package CafeAllocationSystem;

public class BookingNotAvailableException extends Exception
{
    BookingNotAvailableException()
    {
        System.out.println("Booking not found");
    }
}
