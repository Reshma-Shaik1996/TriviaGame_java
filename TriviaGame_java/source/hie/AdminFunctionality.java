package hie;
//Shaik Reshma (1831841) 13 dec 2108

import java.util.Scanner;

public class AdminFunctionality {
	public static void add(Scanner scan, int Category) {//to add a question to the category
		

		System.out.println("Please enter the new adding question");
		String question = scan.nextLine();
		System.out.println("Please enter the option 1");
		String option1 = scan.nextLine();
		System.out.println("Please enter the option 2");
		String option2 = scan.nextLine();
		System.out.println("Please enter the option 3");
		String option3 = scan.nextLine();
		System.out.println("Please enter the option 4");
		String option4 = scan.nextLine();
		System.out.println("Please enter the correct option");
		String option5 = scan.nextLine();

		switch (Category) {
		case 1: {//to add a question to the category 1
			Game_of_thrones.GotArray[Game_of_thrones.Gottracker][0] = question;
			Game_of_thrones.GotArray[Game_of_thrones.Gottracker][1] = option1;
			Game_of_thrones.GotArray[Game_of_thrones.Gottracker][2] = option2;
			Game_of_thrones.GotArray[Game_of_thrones.Gottracker][3] = option3;
			Game_of_thrones.GotArray[Game_of_thrones.Gottracker][4] = option4;
			Game_of_thrones.GotArray[Game_of_thrones.Gottracker][5] = option5;
			Game_of_thrones.Gottracker++;
			break;
		}
		case 4://to add a question to the category 4
		{
			Dance.DanceArray[Dance.Dancetracker][0]= question;
			Dance.DanceArray[Dance.Dancetracker][1]= option1;
			Dance.DanceArray[Dance.Dancetracker][2]= option2;
			Dance.DanceArray[Dance.Dancetracker][3]= option3;
			Dance.DanceArray[Dance.Dancetracker][4]= option4;
			Dance.DanceArray[Dance.Dancetracker][5]= option5;
            Dance.Dancetracker++;
            break;
		}
		case 5://to add a question to the category 5
		{
			Friends_tv.Friends_tvArray[Friends_tv.Friends_tvtracker][0]= question;
			Friends_tv.Friends_tvArray[Friends_tv.Friends_tvtracker][1]= option1;	
			Friends_tv.Friends_tvArray[Friends_tv.Friends_tvtracker][2]=	option2;
			Friends_tv.Friends_tvArray[Friends_tv.Friends_tvtracker][3]=	option3;
			Friends_tv.Friends_tvArray[Friends_tv.Friends_tvtracker][4]=	option4;
			Friends_tv.Friends_tvArray[Friends_tv.Friends_tvtracker][5]=	option5;
			Friends_tv.Friends_tvtracker++;
			break;
		}
		case 6://to add a question to the category 6
		{
			Geography.GeographyArray[Geography.Geographytracker][0] = question;
			Geography.GeographyArray[Geography.Geographytracker][1] = option1;
			Geography.GeographyArray[Geography.Geographytracker][2] = option2;
			Geography.GeographyArray[Geography.Geographytracker][3] = option3;
			Geography.GeographyArray[Geography.Geographytracker][4] = option4;
			Geography.GeographyArray[Geography.Geographytracker][5] = option5;
			Geography.Geographytracker++;
			break;
		}
		case 2://to add a question to the category 2
		{
			Programming.ProgrammingArray[Programming.Programmingtracker][0] = question;
			Programming.ProgrammingArray[Programming.Programmingtracker][1] = option1;
			Programming.ProgrammingArray[Programming.Programmingtracker][2] = option2;
			Programming.ProgrammingArray[Programming.Programmingtracker][3] = option3;
			Programming.ProgrammingArray[Programming.Programmingtracker][4] = option4;
			Programming.ProgrammingArray[Programming.Programmingtracker][5] = option5;
			Programming.Programmingtracker++;
			break;
		}
		
		case 3://to add a question to the category 3
		{
			History.HistoryArray[History.Historytracker][0] = question; 
			History.HistoryArray[History.Historytracker][1] = option1;
			History.HistoryArray[History.Historytracker][2] = option2;
			History.HistoryArray[History.Historytracker][3] = option3;
			History.HistoryArray[History.Historytracker][4] = option4;
			History.HistoryArray[History.Historytracker][5] = option5;
			History.Historytracker++;
			break;
		}

		}
	}

	public static void edit(Scanner scan, int Category) { // to edit a question in the category 
		System.out.println("Please enter the question number you want to edit");
		int questionNumber = scan.nextInt();
		System.out.println("Please enter the new question");
		String question = scan.nextLine();
		System.out.println("Please enter the option 1");
		String option1 = scan.nextLine();
		System.out.println("Please enter the option 2");
		String option2 = scan.nextLine();
		System.out.println("Please enter the option 3");
		String option3 = scan.nextLine();
		System.out.println("Please enter the option 4");
		String option4 = scan.nextLine();
		System.out.println("Please enter the correct option");
		String option5 = scan.nextLine();
		switch (Category) {
		case 1://to edit a question in the category1
		{
			Game_of_thrones.GotArray[questionNumber][0] = question;
			Game_of_thrones.GotArray[questionNumber][1] = option1;
			Game_of_thrones.GotArray[questionNumber][2] = option2;
			Game_of_thrones.GotArray[questionNumber][3] = option3;
			Game_of_thrones.GotArray[questionNumber][4] = option4;
			Game_of_thrones.GotArray[questionNumber][5] = option5;
			break;}
		case 2://to edit a question in the category2
		{
			Programming.ProgrammingArray[questionNumber][0] = question;
			Programming.ProgrammingArray[questionNumber][1] = option1;
			Programming.ProgrammingArray[questionNumber][2] = option2;
			Programming.ProgrammingArray[questionNumber][3] = option3;
			Programming.ProgrammingArray[questionNumber][4] = option4;
			Programming.ProgrammingArray[questionNumber][5] = option5;
			Programming.Programmingtracker++;
			break;
		}
		case 3://to edit a question in the category 3
		{
			History.HistoryArray[questionNumber][0] = question; 
			History.HistoryArray[questionNumber][1] = option1;
			History.HistoryArray[questionNumber][2] = option2;
			History.HistoryArray[questionNumber][3] = option3;
			History.HistoryArray[questionNumber][4] = option4;
			History.HistoryArray[questionNumber][5] = option5;
			History.Historytracker++;
			break;}
		case 4://to edit a question in the category4
		{
			Dance.DanceArray[questionNumber][0]= question;
			Dance.DanceArray[questionNumber][1]= option1;
			Dance.DanceArray[questionNumber][2]= option2;
			Dance.DanceArray[questionNumber][3]= option3;
			Dance.DanceArray[questionNumber][4]= option4;
			Dance.DanceArray[questionNumber][5]= option5;
            Dance.Dancetracker++;
            break;	
		}
		case 5://to edit a question in the category 5
		{
			Friends_tv.Friends_tvArray[questionNumber][0]= question;
			Friends_tv.Friends_tvArray[questionNumber][1]= option1;	
			Friends_tv.Friends_tvArray[questionNumber][2]=	option2;
			Friends_tv.Friends_tvArray[questionNumber][3]=	option3;
			Friends_tv.Friends_tvArray[questionNumber][4]=	option4;
			Friends_tv.Friends_tvArray[questionNumber][5]=	option5;
			Friends_tv.Friends_tvtracker++;
			break;
		}
		case 6://to edit a question in the category6
		{
			Geography.GeographyArray[questionNumber][0] = question;
			Geography.GeographyArray[questionNumber][1] = option1;
			Geography.GeographyArray[questionNumber][2] = option2;
			Geography.GeographyArray[questionNumber][3] = option3;
			Geography.GeographyArray[questionNumber][4] = option4;
			Geography.GeographyArray[questionNumber][5] = option5;
			Geography.Geographytracker++;
			break;
		}
		}
	}

	public static void delete(Scanner scan, int Category) {//to delete a question in the category
		System.out.println("Please enter the question number you want to delete");
		int questionNumber = scan.nextInt();
		switch (Category) {
		case 1://to delete a question in the category 1
		{
			for(int i = questionNumber-1; i<Game_of_thrones.Gottracker ; i++) {
				Game_of_thrones.GotArray[i][0] = Game_of_thrones.GotArray[i+1][0];
				Game_of_thrones.GotArray[i][1] = Game_of_thrones.GotArray[i+1][0];
				Game_of_thrones.GotArray[i][2] = Game_of_thrones.GotArray[i+1][0];
				Game_of_thrones.GotArray[i][3] = Game_of_thrones.GotArray[i+1][0];
				Game_of_thrones.GotArray[i][4] = Game_of_thrones.GotArray[i+1][0];
				Game_of_thrones.GotArray[i][5] = Game_of_thrones.GotArray[i+1][0];
			}
			Game_of_thrones.Gottracker --;
			break;}
		case 2://to delete a question in the category 2
		{			for(int i = questionNumber-1; i<Programming.Programmingtracker ; i++) {

			Programming.ProgrammingArray[i][0] = Programming.ProgrammingArray[i+1][0];
			Programming.ProgrammingArray[i][1] = Programming.ProgrammingArray[i+1][0];
			Programming.ProgrammingArray[i][2] = Programming.ProgrammingArray[i+1][0];
			Programming.ProgrammingArray[i][3] = Programming.ProgrammingArray[i+1][0];
			Programming.ProgrammingArray[i][4] = Programming.ProgrammingArray[i+1][0];
			Programming.ProgrammingArray[i][5] = Programming.ProgrammingArray[i+1][0];
			}Programming.Programmingtracker--;
			break;
		}
		case 3://to delete a question in the category3
			for(int i = questionNumber-1; i<History.Historytracker ; i++) {

			History.HistoryArray[i][0] = History.HistoryArray[i+1][0]; 
			History.HistoryArray[i][1] = History.HistoryArray[i+1][0];
			History.HistoryArray[i][2] = History.HistoryArray[i+1][0];
			History.HistoryArray[i][3] = History.HistoryArray[i+1][0];
			History.HistoryArray[i][4] = History.HistoryArray[i+1][0];
			History.HistoryArray[i][5] = History.HistoryArray[i+1][0];
			}
			History.Historytracker--;
			break;
		case 4://to delete a question in the category4
				{			for(int i = questionNumber-1; i<Dance.Dancetracker ; i++) {

			Dance.DanceArray[i][0]= Dance.DanceArray[i+1][0];
			Dance.DanceArray[i][1]= Dance.DanceArray[i+1][0];
			Dance.DanceArray[i][2]= Dance.DanceArray[i+1][0];
			Dance.DanceArray[i][3]= Dance.DanceArray[i+1][0];
			Dance.DanceArray[i][4]= Dance.DanceArray[i+1][0];
			Dance.DanceArray[i][5]= Dance.DanceArray[i+1][0];
				} 	
        Dance.Dancetracker--;
        break;

		}
		case 5://to delete a question in the category5
		{			for(int i = questionNumber-1; i<Game_of_thrones.Gottracker ; i++) {

			Friends_tv.Friends_tvArray[i][0]= Friends_tv.Friends_tvArray[i+1][0];
			Friends_tv.Friends_tvArray[i][1]=  Friends_tv.Friends_tvArray[i+1][0];	
			Friends_tv.Friends_tvArray[i][2]=	 Friends_tv.Friends_tvArray[i+1][0];
			Friends_tv.Friends_tvArray[i][3]=	 Friends_tv.Friends_tvArray[i+1][0];
			Friends_tv.Friends_tvArray[i][4]=	 Friends_tv.Friends_tvArray[i+1][0];
			Friends_tv.Friends_tvArray[i][5]=	 Friends_tv.Friends_tvArray[i+1][0];
			}
		Friends_tv.Friends_tvtracker--;
			break;
		}
		case 6://to delete a question in the category6
		{
			for(int i = questionNumber-1; i<Geography.Geographytracker ; i++) {

			Geography.GeographyArray[i][0] = Geography.GeographyArray[i+1][0];
			Geography.GeographyArray[i][1] = Geography.GeographyArray[i+1][0];
			Geography.GeographyArray[i][2] = Geography.GeographyArray[i+1][0];
			Geography.GeographyArray[i][3] = Geography.GeographyArray[i+1][0];
			Geography.GeographyArray[i][4] = Geography.GeographyArray[i+1][0];
			Geography.GeographyArray[i][5] = Geography.GeographyArray[i+1][0];
			}
			Geography.Geographytracker--;
			break;
		}
		

		}
	}
}
