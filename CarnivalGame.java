import java.util.Random;
public class CarnivalGame
{
public static void main(String[] args)
{
int i = 0;
int w = 0;

while(i < 101)
   {
    int sum = dieRoll(6) + dieRoll(20) + dieRoll(8) + dieRoll(4) + dieRoll(12);
    if((sum > 35) || (sum < 20))
      {
       w = w + 1;
      }
    i = i + 1;

}//end while

System.out.println("You won this game: " + w + " times!");

}//end main

//die Roll Method
public static int dieRoll(int x)
{
Random rand = new Random();
int r = rand.nextInt(x) + 1;
return r;
}//end method

}//end class