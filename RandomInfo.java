import java.util.Scanner;
import java.util.Random;

public class RandomInfo {
   
    
    public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);

    String userName;
    String userAns;

    System.out.print("Please enter your name?: ");
    userName = scanner.next();

    System.out.println(String.format ("Hello, %s ", userName ));

    System.out.print("Do you wish to continue?:  (yes or no)");
    userAns = scanner.next();

    if (userAns.equalsIgnoreCase("yes") ||
    (userAns.equalsIgnoreCase("y"))) {
        System.out.println ("Please answer the following questions:");
    } else {
        System.out.println("Please come back to complete the survey. ");
        System.exit(0);
    }
    do {
     String newSet;
     
     String num;
     String userPet;
     int userPetAge;
     int userLuN;
     String userFavQb;
     int jerseyNum;
     int userModel;
     String fName;
     int randNum;

    do {

    System.out.print("What is your favorite pet?: ");
    userPet = scanner.next();

    System.out.print("What is the age of your pet?: ");
    userPetAge = scanner.nextInt();

    System.out.print("What is your lucky number?: ");
    userLuN = scanner.nextInt();

    System.out.print("Do you have a favorite quarterback?: (Y/N) " );
    userFavQb = scanner.next();

    if (userFavQb.equalsIgnoreCase("yes") || (userFavQb.equalsIgnoreCase("y"))) {
        System.out.println("What is their jersey number?: ");
    jerseyNum = scanner.nextInt();
    }

    System.out.print("What is the two-digit model year of your car?: ");
    userModel = scanner.nextInt();

    System.out.print("What is the first name of your favorite actor or actress?: ");
    fName = scanner.next();

    System.out.print("Enter a random number between 1 and 50: ");
    randNum = scanner.nextInt();

    System.out.println("Would you like to generate a different set of numbers?: ");
    num = scanner.next();

} 
while (num.equalsIgnoreCase("yes") ||
(num.equalsIgnoreCase("y"))); 

    
    final Random ran = new Random();
        final int ran1 = ran.nextInt(75);
        final int ran2 = ran.nextInt(65);
      

        System.out.println(ran1);
        System.out.println(ran2);
        

        int magicNum = ran1 * userLuN;

        while (magicNum > 75) {
           magicNum = magicNum - 75;
        }
            System.out.println("Your Magic Ball Number is : " + magicNum);
        

        int lotteryNum1 = userPet.charAt(2);
        while (lotteryNum1 > 65) {
            lotteryNum1 = lotteryNum1 - 65;
        }
        int lotteryNum2 = userModel + userLuN;
        if (lotteryNum2 > 65) {
            lotteryNum2 = lotteryNum2 - 65;
        }
        int lotteryNum3 = randNum - ran1;
        if (lotteryNum3 > 65) {
            lotteryNum3 = lotteryNum3 - 65;
        }
        int lotteryNum4 = fName.charAt(0);
        while (lotteryNum4 > 65) {
            lotteryNum4 = lotteryNum4 - 65;
        }

        int lotteryNum5 = fName.charAt(fName.length() - 1);
        while (lotteryNum5 > 65) {
            lotteryNum5 = lotteryNum5 - 65;
        }
    //   int lotteryNum6 = 42;

    //   int lotteryNum7 = userPetAge + userModel;
    //   if (lotteryNum7 > 65) {
    //   lotteryNum7 = lotteryNum7 - 65;
    // }
        // int lotteryNum8 = userfavqb + userPetAge + usermodel;
        // while (lotteryNum8 > 65) {
        //     lotteryNum8 = lotteryNum8 - 65;
        // }

        System.out.println("Your Lottery Numbers are: " + lotteryNum1 + ", " + lotteryNum2 + ", " + lotteryNum3 + ","
          + lotteryNum4 + ", " + lotteryNum5);

        System.out.print("Would you like to generate another set of numbers? (yes/no) ");
        newSet = scanner.next();{
        while (newSet.equalsIgnoreCase("yes") || (newSet.equalsIgnoreCase("y")));

         System.out.println("Thank You for visiting!");
         System.exit(0);

         scanner.close();

    }
}
    }

