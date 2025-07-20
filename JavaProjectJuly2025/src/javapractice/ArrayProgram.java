package javapractice;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =10; 
		String name = "ABC";
		boolean result =false;
		
		String day ="Sunday";
		//Syntax 1
		//Datatype [] ArrayName ={ comma separated values}
		String days []= { "Sunday","Monday","Tuededay","Thirsday","Friday","Saturday"};
		System.out.println(days[2]);
		
		int[] nums = {3,6,2,7,5};
		
		System.out.println(nums[3]);
		//Syntax 2
		// Datatype []arrayname = new DataType [Total no of elements in Array];
		int arr []= new int [6]; 
		arr[0]=50;
		arr[1]=60;
		arr[2]=70;
		arr[3]=80;
		arr[4]=90;
		arr[5]=100;
		
		System.out.println(arr[4]);
		oddeven(11);
			
	}
	
	public static boolean oddeven(int num )
	{
	  int ans =num %2;
	  if (ans==0)
	  {
		  System.out.println("true");
		  return true;
		  }
	  else
	  {
	  		
	  		 System.out.println("false");
	  		return false;
	  
		  
	  }
		
	}
	
}