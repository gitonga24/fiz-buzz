package FizBuzz;

public class FizzBuzz {

	public String getResponse(int number) {
		if (number % 5 == 0)
			return"Buzz";
		
		if (number % 3 == 0)
			return "Fizz";
		
		return "" + number;
	}

}
