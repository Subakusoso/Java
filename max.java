
public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter termination number: ");
		int terminator = IO.readInt();
		int max=0, count = 0;
		
		System.out.print("Enter a number, or terminator: ");
		int number=IO.readInt();
		while (number != terminator){
			count++;
			if (count==1){
			max = number;
			} else {
				if (number>max){
					max = number;
				}
			}
			
			System.out.print("Enter a number, or a terminator: ");
			number=IO.readInt();
		}

		if (count==0){
			System.out.println("No input values");
		} else{
			System.out.println("The max is: " + max); 
		}
	
	}

}
