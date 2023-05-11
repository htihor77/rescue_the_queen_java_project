
public class Weapon {
public String Weapon_name,Weapon_Description;
public int Ranged_attack_power,Melee_attack_power,Defense_Attack_power;
public Character ch;
public Weapon(String Weapon_name,String Weapon_Description,int Ranged_attack_power,int Melee_attack_power,int Defense_Attack_power)
{
this.Weapon_name=Weapon_name;
this.Weapon_Description=Weapon_Description;
this.Ranged_attack_power=Ranged_attack_power;
this.Melee_attack_power=Melee_attack_power;
this.Defense_Attack_power=Defense_Attack_power;
this.ch=new Character(Weapon_name, Weapon_Description);
//ch.setCharacter_name();
}
public void Reception1()
{
System.out.println("Weapon:");
System.out.println("Weapon name is: "+Weapon_name);
System.out.println("Weapon Description is: "+Weapon_Description);
//System.out.println(ch.getCharacter_name() +" has a "+ Weapon_name);

}

}