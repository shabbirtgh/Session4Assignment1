package Package1;

class Package1 {

	public static void main(String[] args) 
	{
		System.out.println("In main of package 1");

	}

}

public class accessIt
{

 public int returnValue()
  {
      System.out.println("In protected method of package 1");
      return 101;
   }


}
