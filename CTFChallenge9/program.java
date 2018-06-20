import java.util.Scanner;

public class program
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Guess the Score: Soccer Edition.");
    System.out.println("Today we will attempt to guess one of Poland's soccer match game scores.");
    int test1 = 0;
    int test2 = 0;
    int num1 = 0;
    int num2 = 0;
    while(test2<2)
    {
    while(test1<1)
    {
      System.out.println("Please enter your first number.");
      num1 = input.nextInt();
      if(num1<10)
      {
        test1 = test1 + 5;
      }
      else
      {
        System.out.println("No soccer match has ever scored that many goals on one side.");
      }
    }
    test1 = 0;
    while(test1<1)
    {
      System.out.println("Please enter your second number.");
      num2 = input.nextInt();
      if(num2<10)
      {
        test1 = test1 + 5;
      }
      else
      {
        System.out.println("No soccer match has ever scored that many goals on one side.");
      }
    }
    test1 = 0;
    if(num1+num2<15)
    {
      System.out.println("Passed the addition test.");
      if(num1-num2>0)
      {
        System.out.println("Passed the subtraction test.");
        if(num1*num2<100)
        {
          System.out.println("Passed the multiplication test.");
          if(num1/num2 > 1)
          {
            System.out.println("Passed the division test.");
            int num3 = num1 * num1;
            int num4 = num2 * num2;
            if(num3+num4<10)
            {
              System.out.println("You have found the correct numbers.");
              System.out.println("The numbers are " + num1 + " " + num2 + ".");
              System.out.println("Did Poland win or lose this game? That's for you to find out.");
              System.out.println("Let's just say that it was a real game and you can see for yourself.");
              System.out.println("The flag is flag{(win or lose)_num1_num2}.");
              System.out.println("Best of luck.");
              test2 = test2 + 100;
            }
            else
            {
              System.out.println("Not the numbers.");
            }
          }
          else
          {
            System.out.println("Not the numbers.");
          }
        }
        else
        {
          System.out.println("Not the numbers.");
        }
      }
      else
      {
        System.out.println("Not the numbers.");
      }
    }
    else
    {
      System.out.println("Not the numbers.");
    }
  }
}
}
