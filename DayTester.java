public class DayTester
{
   public static void main(String[] args)
   {
      Day today = new Day(2020, 2, 28); // February 28, 2020
      Day later = today.addDays(30);

      System.out.println(later.getYear());
      System.out.println("Expected: 2010");
      System.out.println(later.getMonth());
      System.out.println("Expected: 3");
      System.out.println(later.getDate());
      System.out.println("Expected: 13");
      System.out.println(later.daysFrom(today)); 
      System.out.println("Expected: 30");
   }
}
