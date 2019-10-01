package hie;
//Shaik Reshma (1831841) 13 dec 2108
import java.util.Scanner;

public class final_project {

	public static void main(String[] args) {

		Game_of_thrones.GotQandA();
		Programming.ProgrammingQandA();
		History.HistoryQandA();
		Dance.DanceQandA();
		Friends_tv.Friends_tvQandA();
		Geography.GeographyQandA();

		String result[][] = new String[20][2];
		int resultPointer = 0;

		var input = new Scanner(System.in);
		int Category;
		int Continue = 1;

		do {
			printCategories();

			Category = input.nextInt();
			input.nextLine();
			int correct = 0;
			switch (Category) { // switch case to select the category
			case 1:
				correct = 0;
				System.out.println("The entered category is Game of Thrones");// category 1
				for (int i = 0; i < Game_of_thrones.Gottracker; i++) {
					System.out.println((i + 1) + ". " + Game_of_thrones.GotArray[i][0]);
					System.out.println(Game_of_thrones.GotArray[i][1]);
					System.out.println(Game_of_thrones.GotArray[i][2]);
					System.out.println(Game_of_thrones.GotArray[i][3]);
					System.out.println(Game_of_thrones.GotArray[i][4]);

					System.out.println("Please enter the correct option");
					String choice = input.nextLine();
					if (choice.trim().equals(Game_of_thrones.GotArray[i][5])) {
						correct++;
						System.out.println("Correct!");
					} else {
						System.out.println("Correct opton = " + Game_of_thrones.GotArray[i][5]);
					}

				}
				result[resultPointer][0] = "GOT ";
				result[resultPointer][1] = " " + (correct * 100) / Game_of_thrones.Gottracker;
				resultPointer++;
				break;

			case 2://category 2
				correct = 0;
				System.out.println("The entered category is Programming");
				for (int i = 0; i < Programming.Programmingtracker; i++) {
					System.out.println((i + 1) + ". " + Programming.ProgrammingArray[i][0]);
					System.out.println(Programming.ProgrammingArray[i][1]);
					System.out.println(Programming.ProgrammingArray[i][2]);
					System.out.println(Programming.ProgrammingArray[i][3]);
					System.out.println(Programming.ProgrammingArray[i][4]);

					System.out.println("Please enter the correct option");
					String choice = input.nextLine();
					if (choice.trim().equals(Programming.ProgrammingArray[i][5])) {
						correct++;
						System.out.println("Correct!");

					} else {
						System.out.println("Correct opton = " + Programming.ProgrammingArray[i][5]);
					}
				}
				result[resultPointer][0] = "Programming";
				result[resultPointer][1] = "" + (correct * 100) / Programming.Programmingtracker;
				resultPointer++;
				break;

			case 3:// category 3
				correct = 0;
				System.out.println("The entered category is History");
				for (int i = 0; i < History.Historytracker; i++) {
					System.out.println((i + 1) + ". " + History.HistoryArray[i][0]);
					System.out.println(History.HistoryArray[i][1]);
					System.out.println(History.HistoryArray[i][2]);
					System.out.println(History.HistoryArray[i][3]);
					System.out.println(History.HistoryArray[i][4]);

					System.out.println("Please enter the correct option");
					String choice = input.nextLine();
					if (choice.trim().equals(History.HistoryArray[i][5])) {
						correct++;
						System.out.println("Correct!");

					} else {
						System.out.println("Correct opton = " + History.HistoryArray[i][5]);
					}
				}
				result[resultPointer][0] = "History";
				result[resultPointer][1] = "" + (correct * 100) / History.Historytracker;
				resultPointer++;
				break;

			case 4:// category 4
				correct = 0;
				System.out.println("The entered category is Dance");
				for (int i = 0; i < Dance.Dancetracker; i++) {
					System.out.println((i + 1) + ". " + Dance.DanceArray[i][0]);
					System.out.println(Dance.DanceArray[i][1]);
					System.out.println(Dance.DanceArray[i][2]);
					System.out.println(Dance.DanceArray[i][3]);
					System.out.println(Dance.DanceArray[i][4]);

					System.out.println("Please enter the correct option");
					String choice = input.nextLine();
					if (choice.trim().equals(Dance.DanceArray[i][5])) {
						correct++;
						System.out.println("Correct!");

					} else {
						System.out.println("Correct opton = " + Dance.DanceArray[i][5]);
					}
				}
				result[resultPointer][0] = "Dance";
				result[resultPointer][1] = "" + (correct * 100) / Dance.Dancetracker;
				resultPointer++;
				break;

			case 5://category 5
				correct = 0;
				System.out.println("The entered category is Friends-Tv series");
				for (int i = 0; i < Friends_tv.Friends_tvtracker; i++) {
					System.out.println((i + 1) + ". " + Friends_tv.Friends_tvArray[i][0]);
					System.out.println(Friends_tv.Friends_tvArray[i][1]);
					System.out.println(Friends_tv.Friends_tvArray[i][2]);
					System.out.println(Friends_tv.Friends_tvArray[i][3]);
					System.out.println(Friends_tv.Friends_tvArray[i][4]);

					System.out.println("Please enter the correct option");
					String choice = input.nextLine();
					if (choice.trim().equals(Friends_tv.Friends_tvArray[i][5])) {
						correct++;
						System.out.println("Correct!");

					} else {
						System.out.println("Correct opton = " + Friends_tv.Friends_tvArray[i][5]);
					}
				}
				result[resultPointer][0] = "Friends-Tv series";
				result[resultPointer][1] = "" + (correct * 100) / Friends_tv.Friends_tvtracker;
				resultPointer++;
				break;

			case 6:// category 6
				System.out.println("The entered category is Geography");
				correct = 0;
				for (int i = 0; i < Geography.Geographytracker; i++) {
					System.out.println((i + 1) + ". " + Geography.GeographyArray[i][0]);
					System.out.println(Geography.GeographyArray[i][1]);
					System.out.println(Geography.GeographyArray[i][2]);
					System.out.println(Geography.GeographyArray[i][3]);
					System.out.println(Geography.GeographyArray[i][4]);

					System.out.println("Please enter the correct option");
					String choice = input.nextLine();
					if (choice.trim().equals(Geography.GeographyArray[i][5])) {
						correct++;
						System.out.println("Correct!");

					} else {
						System.out.println("Correct opton = " + Geography.GeographyArray[i][5]);
					}
				}
				result[resultPointer][0] = "Geography";
				result[resultPointer][1] = "" + (correct * 100) / Geography.Geographytracker;
				resultPointer++;
				break;

			case 7:// to quit or to continue
				System.out.println(
						"Are you sure: If you want to continue the quiz press 1(one) or press If you want to continue press any number");
				Continue = input.nextInt();
				if (Continue == 1) {
					System.out.println("You decide to continue. ");
					Category = input.nextInt();

				} else {
					for (int j = 0; j < resultPointer; j++) {
						System.out.println("Game played: " + result[j][0] + "Percentage Scored " + result[j][1] + "%");
					}
					System.out.println("you wanted to quit, Bye");

				}
				break;
				
			case 143:// admin secret code
				printCategories();
				Category = input.nextInt();
				input.nextLine();
				System.out.println("Welcome Admin\n1)Press 1 to add question\n2)Press 2 to edit question\n3)Press 3 to delete a question\n4)Press 4 to exit");
				int adminOption = input.nextInt();
				switch(adminOption) {
				case 1: AdminFunctionality.add(input, Category); break;
				case 2: AdminFunctionality.edit(input, Category); break;
				case 3: AdminFunctionality.delete(input, Category); break;
				case 4: break;
				}
			default:
				System.out.println("The entered category value should be between 1 and 7");

			}// end switch

		} while (Category > 0 && Category < 7);// the selected category should be between 1 and 7

	}

	public static void printCategories() {
		System.out.println("Enter the value of category between 1 and 6");
		System.out.println(" 1: Game of Thrones");
		System.out.println(" 2:Programming");
		System.out.println(" 3:History");
		System.out.println(" 4:Dance");
		System.out.println(" 5:Friends Tv ");
		System.out.println(" 6:Geography");
		System.out.println(" 7:Exit this section with confirmation");
	}

}
