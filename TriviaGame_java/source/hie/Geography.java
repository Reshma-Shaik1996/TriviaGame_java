package hie;
//Shaik Reshma (1831841) 13 dec 2108

import java.util.Scanner;

public class Geography {

	public static String GeographyArray[][] = new String[30][6]; // Array for 1 question, 4 options, 1 answer
	public static int Geographytracker = 0; // reference to position

	public static void GeographyQandA() {
		GeographyArray[Geographytracker][0] = "What is the driest place on Earth?";
		GeographyArray[Geographytracker][1] = "1.Atacama Dessert";
		GeographyArray[Geographytracker][2] = "2.Sahara Dessert";
		GeographyArray[Geographytracker][3] = "3.Mcmurdo Antartica";
		GeographyArray[Geographytracker][4] = "4.KUFRA, Lybia";
		GeographyArray[Geographytracker][5] = "3";
		Geographytracker++;

		GeographyArray[Geographytracker][0] = " Which African nation has the most pyramids?";
		GeographyArray[Geographytracker][1] = "1.Eygypt";
		GeographyArray[Geographytracker][2] = "2.Libya";
		GeographyArray[Geographytracker][3] = "3.Algeria";
		GeographyArray[Geographytracker][4] = "4.sudan";
		GeographyArray[Geographytracker][5] = "4";
		Geographytracker++;

		GeographyArray[Geographytracker][0] = " What is the oldest city in the world?";
		GeographyArray[Geographytracker][1] = "1.Jerusalem";
		GeographyArray[Geographytracker][2] = "2.Jericho";
		GeographyArray[Geographytracker][3] = "3.Damascus";
		GeographyArray[Geographytracker][4] = "4.Athens";
		GeographyArray[Geographytracker][5] = "3";// correct option
		Geographytracker++;

		GeographyArray[Geographytracker][0] = "What is the flattest continent?";
		GeographyArray[Geographytracker][1] = "1. Australia";
		GeographyArray[Geographytracker][2] = " 2.South America";
		GeographyArray[Geographytracker][3] = "3.Antartica";
		GeographyArray[Geographytracker][4] = "4.Africa";
		GeographyArray[Geographytracker][5] = "1";// correct option
		Geographytracker++;

		GeographyArray[Geographytracker][0] = "What country is home to Kangaroo Island?";
		GeographyArray[Geographytracker][1] = "1.Japan";
		GeographyArray[Geographytracker][2] = "2.Australia";
		GeographyArray[Geographytracker][3] = "3.Korea";
		GeographyArray[Geographytracker][4] = "4.France";
		GeographyArray[Geographytracker][5] = "2";
		Geographytracker++;

		GeographyArray[Geographytracker][0] = "What is the tallest mountain in the world?";
		GeographyArray[Geographytracker][1] = "1.Qogir";
		GeographyArray[Geographytracker][2] = "2.Mount Kilimanjaro";
		GeographyArray[Geographytracker][3] = "3.Mount Everest";
		GeographyArray[Geographytracker][4] = "4.Aconcagua";
		GeographyArray[Geographytracker][5] = "3";
		Geographytracker++;

		GeographyArray[Geographytracker][0] = "What is the only sea without any coasts?";
		GeographyArray[Geographytracker][1] = "1.Sargasso sea";
		GeographyArray[Geographytracker][2] = "2.Mediterranean sea";
		GeographyArray[Geographytracker][3] = "3.Adriatic sea";
		GeographyArray[Geographytracker][4] = "4.Celebes sea";
		GeographyArray[Geographytracker][5] = "1";
		Geographytracker++;

		GeographyArray[Geographytracker][0] = " What country has the most natural lakes?";
		GeographyArray[Geographytracker][1] = "1.India";
		GeographyArray[Geographytracker][2] = "2.USA";
		GeographyArray[Geographytracker][3] = "3.Canada";
		GeographyArray[Geographytracker][4] = "4.Australia";
		GeographyArray[Geographytracker][5] = "3";
		Geographytracker++;

		GeographyArray[Geographytracker][0] = " What is Earth's largest continent?";
		GeographyArray[Geographytracker][1] = "1.Europe";
		GeographyArray[Geographytracker][2] = "2.Australia";
		GeographyArray[Geographytracker][3] = "3.Africa";
		GeographyArray[Geographytracker][4] = "4.Asia";
		GeographyArray[Geographytracker][5] = "4";
		Geographytracker++;

	}
}
