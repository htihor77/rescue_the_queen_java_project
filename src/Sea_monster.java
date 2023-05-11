import java.util.Scanner;
public class Sea_monster extends Character {
private int Attack_power;
public int Defence_power;
public int Health_points=100;
public int p_health=100;
public String beat;
int n=1;
int k=1;
int w=1;
public Points smp=new Points();
public void Implementation()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a place to attack (heads,gills,tail) or defend ");
while(Health_points >0 && p_health!=0)
{
beat= sc.nextLine();
if((beat.equalsIgnoreCase("head")) || (beat.equalsIgnoreCase("gills")) || (beat.equalsIgnoreCase("tail")))
{
Attack();
}
else if(beat.equalsIgnoreCase("defend"))
{
Defend();
}
else
{
System.out.println("Wrong input enter again");
Implementation();
}
if(Health_points<=0 && n==1)
{
System.out.println("Sea monster health points became 0 and Sea monster died ");
System.out.println("YOU MOVED TO NEXT LEVEL AND YOUR ENEMY IS WOLF WARRIOR");
smp.setPoint_value(100);
n++;
}
if(p_health==0 && n==1)
{
System.out.println("Player died and game ends");
n++;
}



}




}
public void Defend()
{
System.out.println("Defence power of Sea monster is: "+Defence_power);
Health_points-=1;
System.out.println("After each defence, health points reduced is: "+Health_points);
p_health-=1;
System.out.println("Player health after getting attacked is: "+p_health);
if(Health_points!=0 && p_health!=0)
{
Implementation();
}
}
public void Attack()
{
if(Health_points>0 & k==1 )
{
System.out.println("Attack power of Sea monster is: "+Attack_power);k++;
}

if((beat.equalsIgnoreCase("head"))&& Health_points>0)
{
Health_points-=20;
if(Health_points>0) {
System.out.println("After each attack in head,health points reduced is: "+Health_points);Implementation();
}




}
else if(beat.equalsIgnoreCase("gills")&& Health_points>0)
{
Health_points-=10;
if(Health_points>0) {
System.out.println("After each attack in gills,health points reduced is: "+Health_points);Implementation();
}



}
else if(beat.equalsIgnoreCase("tail")&& Health_points>0)
{
Health_points-=5;
if(Health_points>0) {
System.out.println("After each attack in tail,health points reduced is: "+Health_points);Implementation();
}
if(Health_points<=0 && n==1)
{
System.out.println("Sea monster health points became 0 and Sea monster died ");
System.out.println("YOU MOVED TO NEXT LEVEL AND YOUR ENEMY IS WOLF WARRIOR");
smp.setPoint_value(100);

n++;
}
if(p_health==0 && n==1)
{
System.out.println("Player died and game ends");
n++;
}



}}



public int getAttack_power() {
return Attack_power;
}
public void setAttack_power(int attack_power) {
Attack_power = attack_power;
}
public Sea_monster(int attack_power, int defence_power, int health_points,String Character_name,String Chrarcter_description)
{
super(Character_name, Chrarcter_description);
Attack_power = attack_power;
Defence_power = defence_power;
Health_points = health_points;
//System.out.printf("Character name:\n "+Character_name + "\n"+"Character description:\n "+ Chrarcter_description+ "\n");
Character c2=new Character("Sea monster", "Sea monster is a monster which u want to kill to cross magical bridge.");
c2.display();
}



}
