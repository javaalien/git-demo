package java.alien;

public class App 
{
	public void addData(String data) {
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome to git");
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student s=new  Student();
        s.setId(101);
        s.setName("javaalien");
        
        System.out.println(s.getId() +" - " +s.getName());
    }
}
