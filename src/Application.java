
public class Application {
	public static void main(String[] args){
		
		//IF lesson:
		
		boolean cond = 1 == 6;
		//like C#, one = sets. two == compares.
		System.out.println(cond);  //prints false
		
		int num1 = 5;
		
		if(num1 < 10){
			System.out.println("it's smaller than 10");
		}
		else if (num1 == 5){
			System.out.println("number is the same");
		}
		else{
			System.out.println("no, it's false");
		}
		
		//if more than one clause is true, only the first one will do something
		//then the logic stops reading/doing.
		//so in the above example, you'd want second thing first.
		
		int loop = 0;
		
		while (loop < 10){
			System.out.println("Looping: " + loop);
			loop++;
			
			if (loop == 5){
				break;
			}
		}
		
		//in that last one, the while would have looped 10 times.
		//BUT you said if loop is 5, then stop running
		
		
		//DO WHILE lesson:
		
		
	}
}
