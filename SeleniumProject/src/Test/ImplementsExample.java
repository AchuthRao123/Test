package Test;

public class ImplementsExample {

	   public static void main(String args[])
	      {
	          Person p = new Person("Prerna");
	          WifeAndMother w = new WifeAndMother("Raani");
	          System.out.println("p is a " + p.name);
	          System.out.println("w is a " + w.name);
	          w.FeedChildren();
	          w.CallHusband();
	      }
	  }

class Person
{
  String name;
  Person(String n)
  {
    name = "Person:  " + n;
  }
}
interface Mother
{
  public void FeedChildren();
}
interface Wife
{
  public void CallHusband();
}
class WifeAndMother extends Person implements Wife, Mother
{
  WifeAndMother(String n)
   {
      super(n);
      name = "Wife and mother:  " + n;
   }
public void FeedChildren()
 {
     System.out.println(name + " is feeding the children.");
 }
public void CallHusband()
{
    System.out.println(name + " is calling her husband.");
}
}

