

	
	public class Points
	{

	private int Point_value;
	public Points()
	{
		this.Point_value=0;
	}
	public int Point() {
		
		
		//Point_value+=100;
		System.out.println("********************************Player Points:"+Point_value+"*****************************************");
		
		return Point_value;
              
		
	}
	public int getPoint_value() {
		return this.Point_value ;
	}
	public void setPoint_value(int newValue) {
		
		this.Point_value= newValue;
		Point();
		
	}
	}

