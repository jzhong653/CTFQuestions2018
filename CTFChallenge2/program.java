import java.util.Scanner;

//Created by Joseph Zhong on June of 2018 for the intended purpose of use at the Capture the Flag Challenge for UNO's GenCyber Camp.
//Joseph Zhong, though, has granted permission for this to be used elsewhere.

public class program
{
public static void main (String [] args)
{
  Scanner scan = new Scanner(System.in);
  String flag = "";
  int check = 0;
  System.out.println("Hello, I am the Riddler.");
  System.out.println("Please print your name.");
  String name = scan.nextLine();
  System.out.println("To capture this flag, you must answer the riddle.");
  System.out.println(name+", let's start shall we. The start of something new began with the demise of something old.");
  while(check < 10)
  {
  System.out.println("Born the year the Duke defeated Napoleon the bold.");
  System.out.println("But death came the year the founder of Woolworth Co was born.");
  System.out.println("I defy the social norms to be rejected and scorned,");
  System.out.println("For woman I may be yet creator, founder death has made me.");
  System.out.println("For computers and math are not the sole function");
  System.out.println("But part of a language, and symbol conjunction.");
  System.out.println("Who am I?");
  String answer = scan.nextLine();
  if(answer.equalsIgnoreCase("Ada Lovelace"))
  {
    System.out.println("You have found the flag");
    System.out.println(flag);
    check = check + 20;
  }
  else
  {
    System.out.println("Incorrect");
  }
}
}
}
