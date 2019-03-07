public class TurnTaker
{
private static int turn = 0;
private int myTurn;
private String name;
public TurnTaker(String n, int t)
{
name = n;
myTurn = t;
}
public String getName()
{
return name;
}
public static int getTurn()
{
turn++;
return turn;
}
public boolean isMyTurn()
{
if (turn==myTurn)
return true;
else
return false;
}

public class TurnTakerDemo
{
public static void main(String[] args)
{
TurnTaker person1 = new TurnTaker("Romeo", 1);
TurnTaker person2 = new TurnTaker("Juliet", 3);

}
} 
}