
public class Merging {
		public void statement(int score) {
			if (score == 100)
				System.out.println("You're awesome");
			else if (score > 90)
				System.out.println("That's great");
			else if (score > 60)
				System.out.println("That's good ");
			else if (score > 50)
				System.out.println("Well, what can I say?");
			else
				System.out.println("Cool I fail");
		}
		public static void main(String[] args) {
			Merging tm = new Merging();
			tm.statement(60);
			tm.statement(50);
		}
	}


