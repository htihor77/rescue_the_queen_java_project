public class Character
{
	public String Character_name,Character_description;

	public Character(String character_name, String Character_description) {
		this.Character_name = character_name;
		this.Character_description = Character_description;
	}
	public void display()
	{
		
		System.out.printf("Character name:\n "+Character_name + "\n"+"Character_description:\n "+Character_description + "\n");
	}
	public String getCharacter_name() {
		return Character_name;
		}
		public String get_description() {
		return Character_description;
		}
		public void setCharacter_name(String character_name) {
		Character_name = character_name;
		}
		public void setCharacter_description(String chrarcter_description) {
			this.Character_description = Character_description;
		}
		
}