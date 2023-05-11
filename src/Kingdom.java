import java.util.Scanner;

public class Kingdom {
	
	
	
	public static String Darbar;
	public static String garden;
	public  int searcher;
	public Kingdom(String Darbar,String garden)
	{
		Kingdom.Darbar=Darbar;
		Kingdom.garden =garden;
		System.out.println("KINGDOM:");
		System.out.println("Darbar in palace:"); 
		System.out.println(Darbar); 
		System.out.println("Garden in palace:"); 
		
		System.out.println(garden); 
		System.out.println("Want to enter to Darbar(1) or Garden (2)");
		
	
			Scanner  mc= new Scanner(System.in);
			 searcher=mc.nextInt();
		if( searcher==1)
		{
			System.out.println("Player enters the Darbar and searches for sita");
			System.out.println("Sita not there and try search in garden");
			searcher=mc.nextInt();
			
		}
	    if( searcher==2)
		{
			System.out.println("Player enters the garden.");
		}
		
	}

	
	
	

}
