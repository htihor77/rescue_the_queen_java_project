import java.util.Scanner;
class Ravana extends Character {
private int Heavy_Attack=10;
public int Light_Attack=5;
public int No_of_heads=10;
public int R_head_health=20;
public int p_health=100;
public int Defence_power=1;
public int beat;
int n=1;
int k=1;
int w=1;
public Points ra=new Points();
public void Implementation()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a type of attack (1.range/2.melee) or 3.defend ");
while(No_of_heads>0 && p_health>0)
{
beat= sc.nextInt();
if(beat==1 || beat==2)
{
if(R_head_health>0 & k==1 )
{
System.out.println("Light and Heavy Attack power of Ravana are: "+Heavy_Attack+" and "+Light_Attack);k++;
}if(beat==1&& R_head_health>0 && p_health>0)
{
R_head_health-=15;
if(R_head_health>0) {
System.out.println("Head no."+(10-No_of_heads+1));
System.out.println("After each range attack ,health points reduced is: "+R_head_health);
p_health-=5;
if(p_health>0)
{
System.out.println("Player health is: "+p_health);
}
}else{
if(No_of_heads>=0)
{
R_head_health+=20;
System.out.println("Head no."+(10-No_of_heads+1));
System.out.println("After each range attack,health points of Ravana reduced is: 0");
p_health-=5;
if(p_health>0)
{
System.out.println("Player health is: "+p_health);
}
No_of_heads-=1;
}}
}
else if(beat==2 && R_head_health>0 && p_health>0)
{
R_head_health-=20;
if(R_head_health>0) {
System.out.println("Head no."+(10-No_of_heads+1));
System.out.println("After each melee attack,health points of Ravana reduced is: "+R_head_health);
p_health-=10;
if(p_health>0)
{
System.out.println("Player health is: "+p_health);
}
}
else{
if(No_of_heads>=0)
{
R_head_health+=20;
System.out.println("Head no."+(10-No_of_heads+1));
System.out.println("After each melee attack,health points of Ravana reduced is: 0");
p_health-=10;
if(p_health>0)
{
System.out.println("Player health is: "+p_health);
}
No_of_heads-=1;
}
}
}
if(p_health==0 && n==1)
{
System.out.println("Player died and game ends");
n++;
}
}
else if(beat==3&& R_head_health>0 && p_health>0)
{
System.out.println("Defence power of Ravana is: "+Defence_power);
R_head_health-=1;
System.out.println("After each defence, health points reduced for Ravana is: "+R_head_health);
p_health-=1;
if(p_health>0)
{
System.out.println("Player health is: "+p_health);
}
}
else
{
System.out.println("wrong input enter again");
}
}
if(No_of_heads<=0 && n==1)
{
System.out.println("Ravana's health became 0 and Ravana died ");n++;
}
if(No_of_heads<=0 && p_health>0 )
{
System.out.println(" You should go to Kingdom and search for sita ");
ra.setPoint_value(500);
}
}public Ravana(int a,int b,int c,int d,int e,String Character_name,String Chrarcter_description)
{
super(Character_name, Chrarcter_description);
Heavy_Attack=a;
Light_Attack=b;
No_of_heads=c;
R_head_health=d;
Defence_power=e;
//System.out.printf("Character name:\n "+Character_name + "\n"+"Character description:\n "+ Chrarcter_description+ "\n");
Character c6=new Character("Ravana", "Ravana was a king of the island Lanka and the chief antagonist of the game. He has 10 heads and 20 arms and every time one of Ravana's head was cut off, another head would crop up in it's place");
c6.display();
}
}