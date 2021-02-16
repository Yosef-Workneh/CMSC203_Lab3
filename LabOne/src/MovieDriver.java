import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		

	
	String movie;
	String answer;
	String rating;
	int number;
	Scanner keyboard = new Scanner(System.in);
	
	
		Movie s1 = new Movie();
		do {
			System.out.print("Enter the titles of a movie: ");
			movie = keyboard.nextLine();
			s1.setTitle(movie);
			System.out.print("Enter the movies rating: ");
			rating = keyboard.nextLine();
			s1.setRating(rating);
			System.out.print("Enter the number of tickets sold at the movie theater: ");
			number = keyboard.nextInt();
			s1.setSoldTickets(number);
			System.out.println (s1.toString());
			System.out.print("Do you want to try again?: ");
			answer = keyboard.nextLine();
			 keyboard.nextLine();

		}while(answer.equals("yes"));
	
	if( answer.equals("no")) 
	{
		System.out.println("Good bye!");
		System.exit(0);
	}
	
		
		}
	
}


