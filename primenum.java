package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 4;

		boolean flag = false;

		for (int i = 2; i <= input / 2; i++)

		{
			int remainder = input % i;

			if (remainder == 0)

			{
				flag = true;
				System.out.println("The input number " + input + " is not a prime number");
				break;
			}

		}

		if (flag == false)

		{
			System.out.println("The input number " + input + " is a prime number");
		}

	}

}
