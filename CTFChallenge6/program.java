import java.util.Scanner;

//Created by Joseph Zhong on June of 2018 for the intended purpose of use at the Capture the Flag Challenge for UNO's GenCyber Camp.
//Joseph Zhong, though, has granted permission for this to be used elsewhere.
//
//This code is currently incomplete. This was an attempt at creating a coding solution to the a challenge I created for the CTF Challenge at UNO's GenCyber Camp.
//
//If someone can finish this code for me, I would be much thankful and credit will be given.

public class program {
public static void main (String [] args)
{
  Scanner scan = new Scanner(System.in);
  System.out.println("What code do you want to decode in today?");
  String lang = scan.nextLine();
  System.out.println("What do you want to decode today?");
  String decode = scan.nextLine();
  if(lang.equalsIgnoreCase("Bacon Code"))
  {

    String replace1 = lang.replace("AAAAA","A");
    String replace2 = replace1.replace("AAAAB","B");
    String replace3 = replace2.replace("AAAAA","C");
    String replace4 = replace3.replace("AAAAA","D");
    String replace5 = replace4.replace("AAAAA","E");
    String replace6 = replace5.replace("AAAAA","F");
    String replace7 = replace6.replace("AAAAA","G");
    String replace8 = replace7.replace("AAAAA","H");
    String replace9 = replace8.replace("AAAAA","I");
    String replace10 = replace9.replace("AAAAA","K");
    String replace11 = replace10.replace("AAAAA","L");
    String replace12 = replace11.replace("AAAAA","M");
    String replace13 = replace12.replace("AAAAA","N");
    String replace14 = replace13.replace("AAAAA","O");
    String replace15 = replace14.replace("AAAAA","P");
    String replace16 = replace15.replace("AAAAA","Q");
    String replace17 = replace16.replace("AAAAA","R");
    String replace18 = replace17.replace("AAAAA","S");
    String replace19 = replace18.replace("AAAAA","T");
    String replace20 = replace19.replace("AAAAA","U");
    String replace21 = replace20.replace("AAAAA","W");
    String replace22 = replace21.replace("AAAAA","X");
    String replace23 = replace22.replace("AAAAA","Y");
    String replace24 = replace23.replace("AAAAA","Z");
    System.out.println(replace24);
  }
}
}
