package hangMan;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
   static String [] myArrayLyst= {"aTree", "aRain", "aBear", "Encouragea", "aPromise",
            "Soupa","Chessa", "Insurancae","Panacakes","Straeam"};
   static   Random rand =new Random();
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome, let's play hangman!");
        System.out.println("Here is the word I am thinking of:______________");


          String randomText;
          randomText = ""+ myArrayLyst[rand.nextInt(myArrayLyst.length)];


            //  for (int i = 0; i < randomText.length(); i++) {
        int i =0;
        do{
                  System.out.println("Enter your guess:");
                  char userInputChar = userInput.next().charAt(0);

                for (int c = 0; c<randomText.length();c++){
                      if (userInputChar == randomText.charAt(c)) {
                          System.out.print(userInputChar);


                      } else {
                          System.out.print(" - ");
                      }

                  }
              }while (i<randomText.length());




//
//            char[] stringToCharArray = randomText.toCharArray();
//            char userInputChar = userInput.next().charAt(0);

//
//              for (char outPuts : stringToCharArray){
//                  System.out.println("===>>" + outPuts);
//              }


 //        if (charInput.equals(randomText.charAt(i))){
  //           System.out.println("you are correct");
  //       }

//        for (int i = 0; i<randomText.length(); i++){
//            System.out.println("The randum letters is " + randomText.charAt(i));
//           // System.out.println(randomText[rand.nextInt(randomText.length())].charAt(i));
//        }


       // String inputChar = userInput.next();
     //   System.out.println(inputChar);


    }

    public static String randomSelectedString(){
        String randomSelected="";

      //  int charLength;



       // String randomString;
       // randomString = myArrayLyst[rand.nextInt(myArrayLyst.length)];

        //randomString = myArrayLyst[rand.nextInt(myArrayLyst.length)];
      //  System.out.println("My random String is : " + myArrayLyst[rand.nextInt(myArrayLyst.length)]);
        return randomSelected;
    }
}
