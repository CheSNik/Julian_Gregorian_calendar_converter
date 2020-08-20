/**
 * Assignment 1 program lab1
 * @author Sergei Chekhonin
 * This program shows the next days after 28th February
 */


public class Assignment1_lab1
{
   public static void main(String[] args)
   {
	   /**
	    * Instantiate 4 Day objects for 2020-2023, add 1 day to the value
	    */
	  Day day1 = new Day(2020, 2, 28); // February 28, 2020
	  Day later1 = day1.addDays(1);
	  Day day2 = new Day(2021, 2, 28); // February 28, 2021
	  Day later2 = day2.addDays(1);
	  Day day3 = new Day(2022, 2, 28); // February 28, 2022
      Day later3 = day3.addDays(1);
      Day day4 = new Day(2023, 2, 28); // February 28, 2023
      Day later4 = day4.addDays(1);

      System.out.println(later1.getYear()+"-"+later1.getMonth()+"-"+later1.getDate());
      System.out.println("Expected: 2020-02-29");
      
      System.out.println(later2.getYear()+"-"+later2.getMonth()+"-"+later2.getDate());
      System.out.println("Expected: 2021-03-01");
      
      System.out.println(later3.getYear()+"-"+later3.getMonth()+"-"+later3.getDate());
      System.out.println("Expected: 2022-03-01");
      
      System.out.println(later4.getYear()+"-"+later4.getMonth()+"-"+later4.getDate());
      System.out.println("Expected: 2023-03-01");
      
   }
}