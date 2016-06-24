/*
* Student: Eduardo Aguirre
* Session 3
* Assignment 3
* Java program that create and Array and Array List and the reverts the Array List Values. 
*/



import java.util.Scanner; //Imports Scanner Class from java API Class Library to allow user input
import java.util.Arrays;  //Imports Arrays Class from java API Class Library to add Array to a List
import java.util.Collections; //Imports Collections Class from java API Class Library to add reverse the Array to a List
import java.util.List; //Imports List Class from java API Class Library to create the Array List
 
public class ReverseArray {
 
       public static void main(String[] args) { //Main Method to call to start the Program
              String[] soccerTeam=new String[5]; //Creates the Soccer Team Array for 5 Soccer Teams
             
              @SuppressWarnings("resource")
              Scanner sc = new Scanner (System.in); //Creates an Instance if of Scanner Object to take user's input
             
              System.out.println ("===================================================");
              System.out.println("Enter your 5 Favorite Soccer National Teams : "); //Prompts user to enter 5 favorite National Teams
              soccerTeam[0]=sc.nextLine(); //Stores first Favorite Team
              soccerTeam[1]=sc.nextLine(); //Stores second Favorite Team
              soccerTeam[2]=sc.nextLine(); //Stores third Favorite Team
              soccerTeam[3]=sc.nextLine(); //Stores fourth Favorite Team
              soccerTeam[4]=sc.nextLine(); //Stores fifth Favorite Team
             
              List<String> soccerTeamList = Arrays.asList(soccerTeam); //Add the Soccer Team to a List
             
              System.out.println ("Your 5 Favorite Soccer Teams are :"); //Prints the 5 Favorite National Teams
              System.out.println(soccerTeamList);
             
              System.out.print("Do you want to reverse your list Y|N ?");//Ask user if the user can wants to reverse the list
              String choice =sc.next();
             
              if (choice.equalsIgnoreCase("Y")||choice.equalsIgnoreCase("Yes")) //Reverse the list if choice ="Y"
              {
                     Collections.reverse(soccerTeamList); //Uses Collection Class to reverse the List
                     System.out.println ("Your reversed List of your 5 Favorite Soccer Teams :");
                     System.out.println ("===================================================");
                     System.out.println(soccerTeamList);      //Prints the 5 Favorite National Teams Reversed List
              }
             
              else
              {
                     System.out.println("Thank you for using our Soccer Favorite List App"); //Displays a good bye message
              }
              System.out.println ("===================================================");     
              System.out.println("Thank you for using our Soccer Favorite List App"); //Displays a good bye message
              
       }      
 
}