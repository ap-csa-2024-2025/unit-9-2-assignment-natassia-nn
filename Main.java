import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Coffee c = new Coffee("large", true, 10, "latte");
    SpecialityCoffee sp = new SpecialityCoffee("medium", false, 30, "machiatto", "matcha");
 
    System.out.println(c); // implicit call to c.toString()
    System.out.println(sp);
    // Uncomment to test the Car classes
    // CarTester.run();

    // Uncomment to test the Company classes
    // CompanyTester.run();
  }
}
