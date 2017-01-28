package Package2;
import Package1.accessIt;
public class Package2 {

	public static void main(String[] args) 
	{
		System.out.println("In main of package 2");
        accessIt it =  new accessIt();
	    int k = it.returnValue();
	    System.out.println("Returned value from proteted method of package1 is : "+k);
	}

}
