public class Fizzbuzz {
    public String converting (int i) {

        if (i%7 == 0 && i%3 == 0)
        {
            return("FizzBuzz");
        }
        else if (i%7 == 0)
        {
            return("buzz");
        }
        else if (i%3 == 0)
        {
            return("Fizz");
        }
        else
        {
            return String.valueOf(i);
        }
    }
}
