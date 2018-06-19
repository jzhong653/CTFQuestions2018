import java.util.Scanner;


public class program {
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the encrypted message?");
    String replace28 = scan.nextLine();
    String replace26 = replace28.replace("26","m");
    String replace25 = replace26.replace("25","n");
    String replace24 = replace25.replace("24","b");
    String replace23 = replace24.replace("23","v");
    String replace22 = replace23.replace("22","c");
    String replace21 = replace22.replace("21","x");
    String replace20 = replace21.replace("20","z");
    String replace19 = replace20.replace("19","l");
    String replace18 = replace19.replace("18","k");
    String replace17 = replace18.replace("17","j");
    String replace16 = replace17.replace("16","h");
    String replace15 = replace16.replace("15","g");
    String replace14 = replace15.replace("14","f");
    String replace13 = replace14.replace("13","d");
    String replace12 = replace13.replace("12","s");
    String replace11 = replace12.replace("11","a");
    String replace10 = replace11.replace("10","p");
    String replace9 = replace10.replace("9","o");
    String replace8 = replace9.replace("8","i");
    String replace7 = replace8.replace("7","u");
    String replace6 = replace7.replace("6","y");
    String replace5 = replace6.replace("5","t");
    String replace4 = replace5.replace("4","r");
    String replace3 = replace4.replace("3","e");
    String replace2 = replace3.replace("2","w");
    String replace1 = replace2.replace("1","q");
    String replace27 = replace1.replace("-","");
    System.out.println("The decrypted message is below");
    System.out.println(replace27);
    }
  }
