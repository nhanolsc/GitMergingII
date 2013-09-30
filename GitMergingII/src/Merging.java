
public class Merging {
		public void feedback(int score) {
			if (score == 100)
				System.out.println("You're awesome");
			else if (score > 90)
				System.out.println("That's great");
			else if (score > 60)
				System.out.println("That's good, but not really cuz it's a D ");
			else if (score > 50)
				System.out.println("Well, what can I say?");
			else
				System.out.println("You suck");
		}
		public static void main(String[] args) {
			Merging tm = new Merging();
			tm.feedback(60);
			tm.feedback(50);
		}
	}


