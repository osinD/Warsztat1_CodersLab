package OwnWorkshop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	int[][] tab = new int[9][9];
	Scanner scan = new Scanner(System.in);
	System.out.println("W co chcesz zagrać\n"
			+"1: Kaskada \n"
			+"2: Lotto\n"
			+"3: Multi multi \n"
			+"4: Keno\n"
			+"5: MiniLotto\n");
	System.out.println("podaj wartość");
	int value =scan.nextInt();
	
	
	Kaskada kask = new Kaskada();
	Lotto lotek = new Lotto();
	MultiMulti multi = new MultiMulti();
	Keno keno= new Keno();
	MiniLotto miniLotto = new MiniLotto();
	switch(value){
	case 1:
		kask.kaskada();
		break;
	case 2:
		lotek.lotto();
		break;
	case 3:
		multi.multimulti();
		break;
	case 4 :
		keno.keno();
		break;
	case 5 :
		miniLotto.miniLotto();
		break;
	}

	
}

}
