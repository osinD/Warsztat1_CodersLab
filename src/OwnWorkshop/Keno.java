package OwnWorkshop;

import java.util.Random;
import java.util.Scanner;

public class Keno {
	
	public void keno(){
		
		
		
		
		Scanner read= new Scanner(System.in);
		
		int size = 0;
		int flaszka =0;
		while(flaszka!=1){
			System.out.println("Ile liczb chesz typować ? :");
			size=read.nextInt();
			if(size<=10&&size>0){
				flaszka=1;
			}
		}
		int[] user = new int[size];
		int[] game = new int[20];
		Random generator = new Random();
		
		
		game[0]=generator.nextInt(42)+1;
		int j=1;
		int z =0;
		int spr =1;
		while(j<6){
			
			z=generator.nextInt(42)+1;
			for(int i=j-1;i>=0;i--){
			if(z==game[i]){
				continue;
			}
			}
			game[j]=z;
			j++;
		}
		
		System.out.println("Poadj liczby do losowania");
		
		int walker =0;
		int num;
		while(walker<size){
			
			System.out.print("Podaj liczbe");
			try{
			user[walker]=read.nextInt();
			}catch(NumberFormatException e){
				System.out.println("zla liczba");
				continue;
			}
			
			num=user[walker];
			if((num<=0)||(num>70)){
				System.out.println("zla liczba");
			}else{
				walker+=1;
			}
			
		}
		int score=0;
		for (int i = 0; i < game.length; i++) {
			
			for (int k = 0; k < user.length; k++) {
				if(user[k]==game[i]){
					score+=1;
				}
			}
		}
		
		System.out.println("PODAJ KWOTĘ ZAKŁADU");
		int cash= read.nextInt();
		switch(size){
			
		case 1:
				switch(score){
				case 1:
					System.out.println("Wygrałeś kwotę"+(cash+1));
					break;
				}
				break;
		
		case 2:
			switch(score){
			case 2:
				System.out.println("Wygrałeś kwotę"+(cash*7));
				break;
			}
			break;
		
		case 3:
			switch(score){
			case 2:
				System.out.println("Wygrałeś kwotę"+(cash*2));
				break;
			case 3:
				System.out.println("wygrałeś kwotę"+(cash*9));
				break;
			}
			break;
		
		case 4 :
			switch(score){
			case 2:
				System.out.println("Wygrałeś kwotę"+(cash));
				break;
			case 3:
				System.out.println("wygrałeś kwotę"+(cash*2));
				break;
			case 4 :
				System.out.println("wygrałeś kwotę"+(cash*30));
				break;
			}
			break;
		
		case 5:
			switch(score){
			case 3:
				System.out.println("Wygrałeś kwotę"+(cash*2));
				break;
			case 4:
				System.out.println("wygrałeś kwotę"+(cash*9));
				break;
			case 5 :
				System.out.println("wygrałeś kwotę"+(cash*125));
				break;
			}
			break;
		
		
		case 6:
			switch(score){
			case 3:
				System.out.println("Wygrałeś kwotę"+(cash*1));
				break;
			case 4:
				System.out.println("wygrałeś kwotę"+(cash*3));
				break;
			case 5 :
				System.out.println("wygrałeś kwotę"+(cash*27));
				break;
			case 6 :
				System.out.println("Wygrałeś kwotę"+(cash*250));
				break;
			}
			break;
		
		
		case 7:
			switch(score){
			case 3:
				System.out.println("Wygrałeś kwotę"+(cash*1));
				break;
			case 4:
				System.out.println("wygrałeś kwotę"+(cash*2));
				break;
			case 5 :
				System.out.println("wygrałeś kwotę"+(cash*4));
				break;
			case 6 :
				System.out.println("Wygrałeś kwotę"+(cash*33));
				break;
			case  7:
				System.out.println("wygrałeś kwotę"+(cash*750));
			}
			break;
			
			
		case 8:
			switch(score){
			case 4:
				System.out.println("Wygrałeś kwotę"+(cash*1));
				break;
			case 5:
				System.out.println("wygrałeś kwotę"+(cash*4));
				break;
			case 6 :
				System.out.println("wygrałeś kwotę"+(cash*22));
				break;
			case 7:
				System.out.println("Wygrałeś kwotę"+(cash*150));
				break;
			case  8:
				System.out.println("wygrałeś kwotę"+(cash*5000));
			}
			break;
		
		
		case 9:
			switch(score){
			case 4:
				System.out.println("Wygrałeś kwotę"+(cash*1));
				break;
			case 5:
				System.out.println("wygrałeś kwotę"+(cash*2));
				break;
			case 6 :
				System.out.println("wygrałeś kwotę"+(cash*5));
				break;
			case 7:
				System.out.println("Wygrałeś kwotę"+(cash*50));
				break;
			case  8:
				System.out.println("wygrałeś kwotę"+(cash*375));
			case 9:
				System.out.println("wygrałeś kwotę"+(cash*25000));
				break;
			}
			break;
			
		case 10:
			switch(score){
			case 5:
				System.out.println("Wygrałeś kwotę"+(cash*1));
				break;
			case 6:
				System.out.println("wygrałeś kwotę"+(cash*3));
				break;
			case 7 :
				System.out.println("wygrałeś kwotę"+(cash*16));
				break;
			case 8:
				System.out.println("Wygrałeś kwotę"+(cash*125));
				break;
			case  9:
				System.out.println("wygrałeś kwotę"+(cash*1500));
			case 10:
				System.out.println("wygrałeś kwotę"+(cash*100000));
			}
			break;
		}
		
		
		
	}
}
