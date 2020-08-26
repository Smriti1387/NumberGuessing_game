import java.util.*;
import java.util.Random;
import java.math.*;

public class NumberGuess{
public static void main(String args[]){
System.out.println("************************************************************************");
System.out.println("WELCOME TO THIS NUMBER GUESSING GAME!!!Let's get started:=> ");
System.out.println();
System.out.println("ENTER A NUMBER BETWEEN 0 AND 100");

Random randn=new Random();
int upperbound=101,lowerbound=0;
int random=randn.nextInt(upperbound);
int guesses=0;


for(int i=lowerbound;i<upperbound;i++)
{
try{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

if(random<num){
System.out.println("Enter a lower number ! ");
upperbound=num;
guesses++;
}
else if(random>num){
System.out.println("Enter a higher number ! ");

guesses++;
}
else if(random==num){
System.out.println("Well Done You Guessed The Correct Number !");
guesses++;
System.out.println();
System.out.println("Number of Valid Attempts = "+guesses);
System.out.println("Random number was:: "+random);
System.out.println("************************************************************************");
break;

}

}catch(Exception e)
{
System.out.println("INVALID INPUT !! SHOULD BE AN INTEGER");
}
}
}
}