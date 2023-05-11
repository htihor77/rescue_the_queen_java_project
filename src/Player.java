import java.util.Scanner;
public class Player extends Character {
public int Attack_power,Defend_power, Points, p_health;
public static String charac;
public static String wep;
public String Character_name, Chrarcter_description;

public static void main(String[] args)
{
	System.out.println("Choose a character:");
	System.out.println("1.Rama\n2.Lakshmana\n3.Hanuman");
	System.out.println("Rama is an incarnation of the God Vishnu.The eldest and favourite son of Dasaratha,King of Ayodhya");
	System.out.println("Lakshmana is the younger brother of the Rama. Lakshmana represents the ideal brother.");
	System.out.println("Hanuman is a devotee of Rama. Hanuman is described as one of extremely pleasant visage, perfect diction, elegant speech, and faultless manners.");
	
	Scanner mc= new Scanner(System.in);
	

	do {
		System.out.println("ENTER A CHARACTER:");
		charac= mc.nextLine();
	if(charac.equalsIgnoreCase("rama")||charac.equalsIgnoreCase("Lakshmana")||charac.equalsIgnoreCase("Hanuman"))
	{
	
	System.out.println("Player choosed "+charac+" has their character in this game");
	System.out.println("*********************************************************************************************");
	}
	else
	{
		System.out.println("Wrong input enter again");
		
	}
	}while(!(charac.equalsIgnoreCase("rama")||charac.equalsIgnoreCase("Lakshmana")||charac.equalsIgnoreCase("Hanuman")));
	System.out.println("Choose a Weapon:");
	System.out.println("1.Sword\n2.Spear\n3.Axe");
	Scanner wepu= new Scanner(System.in);
	
	do {
		
		System.out.println("ENTER A WEAPON:");
		wep= wepu.nextLine();
	if(wep.equalsIgnoreCase("Sword"))
	{
		Weapon we1=new Weapon("Sword", "A sword is an edged, bladed weapon intended for manual cutting or thrusting.", 90, 85, 100);
		we1.Reception1();
		System.out.println("*********************************************************************************************");
	}
	else if(wep.equalsIgnoreCase("Spear"))
	{
		Weapon we2=new Weapon("Spear", "A thrusting or throwing weapon with long shaft and sharp head or blade",95,90,100);
		we2.Reception1();
		System.out.println("*********************************************************************************************");
	}
	else if(wep.equalsIgnoreCase("Axe"))
	{
		Weapon we3=new Weapon("Axe", "A weapon for attacking which consists of a heavy metal blade which is sharp at one edge and attached by its other edge to the end of a long handle.",93,94,100);
		we3.Reception1();
		System.out.println("*********************************************************************************************");
		
	}
	else
	{
		System.out.println("Wrong input enter again");
		
	}
	
	
	}while(!(wep.equalsIgnoreCase("Sword")||wep.equalsIgnoreCase("Spear")||wep.equalsIgnoreCase("Axe")));
	
	
	
	Player p1=new Player(100, 100, 0, 100,"Rama","Rama is an incarnation of the God Vishnu.The eldest and favourite son of Dasaratha,King of Ayodhya");
	

     Surya s1=new Surya(71, 50, 100,"Surya","Surya is a monster which u want to kill to cross magical bridge.");
	 s1.Implementation();
	 if(s1.p_health!=0) {
		   Magic_Abilities m1=new Magical_bridge();
		   Magic_Abilities m2=new Magical_Stone();
		  
		   Magical_bridge m4=new Magical_bridge();
		   Magical_Stone m5=new Magical_Stone();
		  
		   m1.Float();
		   m2.Float();
		  
		   m4.Transport();
		   m5.Fill_bridge();
		}
	 
	 
	 if(s1.p_health<=0) {
		 System.out.println("Game ends and u re-run");
	} 
	else {
		 System.out.println("*************************************************************************");
		 Sea_monster sm1=new Sea_monster(71, 50, 100,"Sea monster","Sea monster is a monster which u want to kill to cross magical bridge.");
		 
		 sm1.Implementation();
		 if(sm1.p_health<=0) {
			 System.out.println("Game ends and u re-run");
		 }
		 else {
			 Wolf_Warrior w1=new Wolf_Warrior(81, 60, 100,"Wolf Warrior","Wolf warrior is a monster which preserves the magical teeth"); 
				
			 w1.Implementation();
			 if(s1.p_health!=0) {
				  
				   Magic_Abilities m3=new Magical_teeth();
				   Magical_teeth m6=new Magical_teeth();
				   m3.Float();
				  
				   m6.Use();
				  
				   
			}
			 if(w1.p_health<=0)
			 {
				 System.out.println("Game ends and u re-run");
			 }
			
			else
			 {
				 System.out.println("*************************************************************************");
				 Kumbhakarna k1=new  Kumbhakarna(91,70, 100," Kumbhakarna", "Kumbhakarna was brother of the evil Raavana and Player should use magical teeth to kill");
				 k1.Implementation();
				 if(k1.p_health<=0)
				 {
					 System.out.println("Game ends and u re-run");
				 }
				 else
				 {
					 Ravana obj=new Ravana(10,5,10,20,1,"Ravana","Ravana was a king of the island Lanka and the chief antagonist of the game. He has 10 heads and 20 arms and every time one of Ravana's head was cut off, another head would crop up in it's place");
					 obj.Implementation();
					 if(obj.p_health<=0.)
					 {
						 System.out.println("Game ends and u re-run");
					 }
					else {
						 Kingdom king=new Kingdom("the room in the palace of a  ravana in which audiences and receptions occur.", "a piece of ground in the kingdom, commonly with ornamental plants, trees, etc., used as a park or other public recreation area."); 
						
						 Sita sita =new Sita(); 
						 
				
					 }
					 
				 
				 }
				 
				 
			 }
	        }
		
			
	}
 
      
     
	 

}
public Player(int Attack_power, int Defend_power,int Points,int p_health,String Character_name,String Chrarcter_description) {
super(Character_name, Chrarcter_description);
this.Attack_power=Attack_power;
this.Defend_power=Defend_power;
this.Points=Points;
this.p_health=p_health;
if(charac.equalsIgnoreCase("rama"))
{
Character c=new Character("Rama", "Rama is an incarnation of the God Vishnu.The eldest and favourite son of Dasaratha,King of Ayodhya");
c.display();

}
else if(charac.equalsIgnoreCase("Lakshmana"))
{
Character c=new Character("Lakshmana", "Lakshmana is the younger brother of the Rama. Lakshmana represents the ideal brother.");
c.display();

}
else if(charac.equalsIgnoreCase("Hanuman"))
{
Character c=new Character("Hanuman", "Hanuman is a devotee of Rama. Hanuman is described as one of extremely pleasant visage, perfect diction, elegant speech, and faultless manners.");
c.display();

}
System.out.printf("Attack_power:\n "+Attack_power + "\n"+"Defend_power:\n "+ Defend_power+ "\n"+"Points:\n "+ Points+ "\n"+"p_health:\n "+  p_health+"\n");
System.out.println("*********************************************************************************************");
}}




