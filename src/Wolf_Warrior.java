import java.util.*; 

public class Wolf_Warrior extends Character { 

private int Attack_power; 

public int Defence_power; 

public int Health_points=100; 

public int p_health=100; 

public String beat; 

public int x=0;  

 

public Points wp=new Points(); 

public void Implementation() 

{ 

 

Scanner sc= new Scanner(System.in); 

int poison=10,m=0,beateny; 

while(Health_points >0 && p_health>0) 

{ 

if(m!=0) { 

p_health-=poison; 

System.out.println("Poison Damage ,Player Health points: "+p_health); 

} 

System.out.println("Enter a place to attack (head,body,leg) or defend or resist "); 

beat= sc.nextLine(); 

if((beat.equalsIgnoreCase("head")) || (beat.equalsIgnoreCase("body")) || (beat.equalsIgnoreCase("leg"))) 

{ 

Attack(); 

} 

else if(beat.equalsIgnoreCase("defend")) 

{ 

Defend();			 

} 

else if(beat.equalsIgnoreCase("resist")) { 

if(m!=0) { 

m=0; 

} 

} 
else 
{
	System.out.println("wrong input enter again");
      continue;

}
 

beateny= (int)(Math.random()*(10)+1); 

if(x==0) { 

if(beateny==1) { 

p_health-=poison; 

System.out.println("Enemy attack:\nPoison Bite,Player Health points: "+p_health); 

m=10; 

System.out.println("Use Resist Before fatel Damage"); 

} 

else if(beateny==2||beateny==3) { 

p_health-=15; 

System.out.println("Enemy attack:\nAttack on Head,Player Health points: "+p_health); 

} 

else if(beateny==4||beateny==5||beateny==6) { 

p_health-=10; 

System.out.println("Enemy attack:\nAttack on body,Player Health points: "+p_health); 

} 

else if(beateny==7||beateny==8||beateny==9||beateny==10) { 

p_health-=5; 

System.out.println("Enemy attack:\nAttack on leg,Player Health points: "+p_health); 

} 

} 

else { 

x=0; 

} 

 

if(Health_points<=0) 

{ 

System.out.println("Wolf warrior health points became 0 ,Wolf warrior died and you got Magical teeth"); 

System.out.println("YOU MOVED TO NEXT LEVEL AND YOUR ENEMY IS Kumbhakarna"); 

wp.setPoint_value(150); 

} 

if(p_health<=0) 

{ 

System.out.println("Player died and game ends"); 

} 

} 

} 

public void Defend() 

{ 

x=1; 

System.out.println("Defence Activated"); 

} 

public void Attack() 

{ 

if(Health_points>0 ) 

{ 

System.out.println("Attack power of wolf warrior is: "+Attack_power); 

} 

 

if((beat.equalsIgnoreCase("head"))&& Health_points>0) 

{ 

Health_points-=20; 

if(Health_points>0) { 

System.out.println("After each attack in head,health points reduced is: "+Health_points); 

} 

} 

else if(beat.equalsIgnoreCase("body")&& Health_points>0) 

{ 

Health_points-=10; 

if(Health_points>0) { 

System.out.println("After each attack in body,health points reduced is: "+Health_points); 

} 

} 

else if(beat.equalsIgnoreCase("leg")&& Health_points>0) 

{ 

Health_points-=5; 

if(Health_points>0) { 

System.out.println("After each attack in leg,health points reduced is: "+Health_points); 

} 

if(Health_points<=0) 

{ 

System.out.println("Wolf warrior health points became 0 ,Wolf warrior died and you got Magical teeth"); 

System.out.println("YOU MOVED TO NEXT LEVEL AND YOUR ENEMY IS Kumbhakarna"); 

wp.setPoint_value(150); 

} 

if(p_health==0) 

{ 

System.out.println("Player died and game ends"); 

} 

} 

 

} 

 

 

 

 

 

 

public int getAttack_power() { 

return Attack_power; 

} 

public void setAttack_power(int attack_power) { 

Attack_power = attack_power; 

} 

public Wolf_Warrior(int attack_power, int defence_power, int health_points,String Character_name,String Chrarcter_description) 

{ 

super(Character_name, Chrarcter_description); 

Attack_power = attack_power; 

Defence_power = defence_power; 

Health_points = health_points; 

System.out.printf("Character name:\n "+Character_name + "\n"+"Character description:\n "+ Chrarcter_description+ "\n"); 

} 

} 