import java.util.Scanner;
public class SwitchChallenges
	{

		public static void main(String[] args)
			{
			challenge1();
			challenge2();
			}

		private static void challenge1()
			{
			int randomNumber = (int)(Math.random()*20 + 1);
			System.out.println("I have just created a random number, which is " + randomNumber + ".");
			switch (randomNumber)
				{
					case 2:
					case 4:
					case 6:
					case 10:
					case 12:
					case 14:
					case 18:
					case 20:
							{
							System.out.println("You win!");
							break;
							}
					case 1:
					case 3:
					case 7:
					case 9:
					case 11:
					case 13:
					case 15:
					case 17:
					case 19:
							{
							System.out.println("You tie!");
							break;
							}
					default:
							{
							System.out.println("You lose!");
							break;
							}
				}
			}

		private static void challenge2()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Buenos dias, I am the Magic 8 Ball. Please ask me a yes or no question.");
			String userQuestion = userInput.nextLine();
			int randomNumber = (int)(Math.random()*8 + 1);
			switch (randomNumber)
				{
					case 1:
							{
							
							}
					case 2:
							{
							
							}
					case 3:
							{
							
							}
					case 4:
							{
							
							}
					case 5:
							{
							
							}
					case 6:
							{
							
							}
					case 7:
							{
							
							}
					case 8:
							{
							
							}
				}
			}

	}
