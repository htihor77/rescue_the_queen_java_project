import java.util.Scanner;
public class Kumbhakarna extends Character{
private int Attack_power;
public int Defence_power;
public int Health_points=100;
public int p_health=100;
public String beat;
//int n=1;
int k=1;
public Points kum=new Points();


public Kumbhakarna(int Attack_power,int Defence_power,int Health_points,String character_name, String chrarcter_description) {
super(character_name, chrarcter_description);
this.Attack_power=Attack_power;
this.Defence_power=Defence_power;
this.Health_points=Health_points;
Character c4=new Character("Kumbhakarna", "Kumbhakarna was brother of the evil Raavana and Player should use magical teeth to kill");
c4.display();
//System.out.printf("Character name:\n "+Character_name + "\n"+"Character description:\n "+ Chrarcter_description+ "\n");

}

public int getAttack_power() {
return Attack_power;
}

public void setAttack_power(int attack_power) {
Attack_power = attack_power;
}


public void Implementation()
{
int heal=5;
int beateny;
int n=0;
Scanner sc= new Scanner(System.in);
while(Health_points > 0 && p_health > 0)
{
	System.out.println("Enter a place to attack (head,body,leg) or defend or heal ");
	beat= sc.nextLine();
	if(n!=0) {
		p_health+=heal;System.out.println("healed  "+p_health);
		n--;
		if(n==0) {
			heal=5;
		}
	}
	if((beat.equalsIgnoreCase("head")) || (beat.equalsIgnoreCase("body")) || (beat.equalsIgnoreCase("leg")))
	{
	Attack();
	}
	
	else if(beat.equalsIgnoreCase("defend"))
	{
	Defend();

	}

	else if(beat.equalsIgnoreCase("heal")) {
		if(n!=0) {
			heal=2*heal;
			n=n+2;
		}
		else {
			n=5;
		}
		p_health+=2*heal;System.out.println("Heal potion Activated \nhealed  "+p_health);
		n--;
	}
	else 
	{
		System.out.println("wrong input enter again");
	      continue;

	}
	beateny= (int)(Math.random()*(3)+1);
	switch(beateny) {
		case 1:
			p_health-=15;System.out.println("Enemy attack:\nAttack on head,Player Health points: "+p_health);
			break;
		case 2:
			p_health-=10;System.out.println("Enemy attack:\nAttack on body,Player Health points: "+p_health);
			break;
		case 3:
			p_health-=5;System.out.println("Enemy attack:\nAttack on leg,Player Health points:  "+p_health);
			break;
	}
	
	if(Health_points<=0 )
	{

		Blow_attack();
		
	//n++;
	}
	
	
	if(p_health<=0 )
	{
	System.out.println("Player died and game ends");
	//n++;
	}


}
}



public void Defend()
{
	p_health+=10;
	
}



public void Attack()
{
if(Health_points>0 & k==1 )
{
System.out.println("Attack power of Kumbhakarna is: "+Attack_power);k++;
}



if((beat.equalsIgnoreCase ("head"))&& Health_points>0)
{
Health_points-=20;
if(Health_points>0) {
System.out.println("Attack on head,Enemy Health points: "+Health_points);//Implementation();
}
}
else if(beat.equalsIgnoreCase ("body")&& Health_points>0)
{
Health_points-=10;
if(Health_points>0) {
System.out.println("Attack on body,Enemy Health points: "+Health_points);//Implementation();
}
}
else if(beat.equalsIgnoreCase ("leg")&& Health_points>0)
{
Health_points-=5;
if(Health_points>0) {
System.out.println("Attack on leg,Enemy Health points: "+Health_points);//Implementation();
}

if(p_health<=0 )
{
	
System.out.println("Player died and game ends");

}

}



}
public void  Blow_attack()
{
	System.out.println("Kumbhakarna health reduce drastically in order to kill him you should stab with magical stone");
	System.out.println("press 1 for Stab in heart");
	System.out.println("press 2 for Stab in stomach");
	System.out.println("press 3 for Stab in head");
		do {
		
		Scanner  mc= new Scanner(System.in);
		 k=mc.nextInt();
		if(k==1)
		{
			System.out.println("Stabbed in heart ");
		}
		else if(k==2)
		{
			System.out.println("Stabbed in stomach");
		}
		else if(k==3)
		{
			System.out.println("Stabbed in head");
		}
		else
		{
			System.out.println("Wrong input enter again");
		}
		
		}while(!(k==1||k==2||k==3));
	System.out.println("Kumbhakarna died\nYOU MOVED TO NEXT LEVEL AND YOUR ENEMY IS RAVANAN ");kum.setPoint_value(250);
}




}