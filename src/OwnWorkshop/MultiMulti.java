package OwnWorkshop;

import java.util.Random;
import java.util.Scanner;

public class MultiMulti {

	
	
	
	public void multimulti(){
		
		Scanner read = new Scanner(System.in);
		System.out.println("Ile liczb chcech wylosować ? :");
		int number=read.nextInt();
		
		int[] score = new int[number];
		for (int i = 0; i < score.length; i++) {
			System.out.print("podaj liczbe do losowanie :");
			score[i]=read.nextInt();
		}
		System.out.println();

		
		Random generator = new Random();
		int a ;
		int[] multi =new int[20];
		int i =1;
		int flag =0;
		 multi[0]=generator.nextInt(80)+1;
		while(i<20){
			flag=0;
			a=generator.nextInt(80)+1;
			for(int j=0;j<i;j++){
				if(a==multi[j]){
					flag =1;
				}
			}
			
			if(flag==0){
				multi[i]=a;
				i+=1;
			}
		}
		System.out.println("Liczby wylosowane");
		for (int j = 0; j < multi.length; j++) {
			
			System.out.print(multi[j]+" ");
		}
		
		switch(number) {
			case 1:
				for (int j = 0; j < multi.length; j++) {
					if(score[0]==multi[j]){
						System.out.println("wygrałeś 4 złote");
					}else{
						System.out.println("brak wygranej");
					}
				}
			break;
			
			case 2:
				int won=0;
				for (int j = 0; j < multi.length; j++) {
					if(score[0]==multi[j]){
						won+=1;
					}
					if(score[1]==multi[j]){
						won+=1;
					}
				}
				if(won==2){
					System.out.println("wygrałeś 16 złotych");
				}else{
					System.out.println("brak wygranej");
				}
				break;
				
			case 3:
				int won3 =0;
				for (int j = 0; j <3; j++) {
					for (int j2 = 0; j2 < multi.length; j2++) {
						if(score[j]==multi[j2]){
							won3+=1;
						}
					}
					
				}
				if(won3==3){
					System.out.println("wygrałes 54 złote");
				}else{
					if(won3==2){
						System.out.println("wygrałeś 2 złote");
					}else{
						System.out.println("brak wygranej");
					}
				}
				break;
			case 4:
				int won4 =0;
				for (int j = 0; j <3; j++) {
					for (int j2 = 0; j2 < multi.length; j2++) {
						if(score[j]==multi[j2]){
							won4+=1;
						}
					}
					
				}
				switch(won4){
				case 2:
					System.out.println("wygrałęś 2 zł");
					break;
				case 3:
					System.out.println("wygrałeś 8 zł");
					break;
				case 4 :
					System.out.println("Wygrałeś 84 zł");
					break;
				}
				
				if(won4<2){
					System.out.println("brak wygranej");
				}
				break;
			case 5:
				int won5 =0;
				for (int j = 0; j <3; j++) {
					for (int j2 = 0; j2 < multi.length; j2++) {
						if(score[j]==multi[j2]){
							won5+=1;
						}
					}
					
				}
				switch(won5){
				case 3:
					System.out.println("wygrałęś 4 zł");
					break;
				case 4:
					System.out.println("wygrałeś 20 zł");
					break;
				case 5 :
					System.out.println("Wygrałeś 700 zł");
					break;
				}
				
				if(won5<3){
					System.out.println("brak wygranej");
				}
				break;
			case 6:
				int won6 =0;
				for (int j = 0; j <3; j++) {
					for (int j2 = 0; j2 < multi.length; j2++) {
						if(score[j]==multi[j2]){
							won6+=1;
						}
					}
					
				}
				switch(won6){
				case 3:
					System.out.println("wygrałęś 2 zł");
					break;
				case 4:
					System.out.println("wygrałeś 8 zł");
					break;
				case 5 :
					System.out.println("Wygrałeś 120 zł");
					break;
				case 6 :
					System.out.println("wygrałeś 1300 zł");
					break;
				}
				
				if(won6<3){
					System.out.println("brak wygranej");
				}
				break;
			case 7:
				int won7 =0;
				for (int j = 0; j <3; j++) {
					for (int j2 = 0; j2 < multi.length; j2++) {
						if(score[j]==multi[j2]){
							won7+=1;
						}
					}
					
				}
				switch(won7){
				case 3:
					System.out.println("wygrałęś 2 zł");
					break;
				case 4:
					System.out.println("wygrałeś 4 zł");
					break;
				case 5 :
					System.out.println("Wygrałeś 20 zł");
					break;
				case 6 :
					System.out.println("wygrałeś 200 zł");
					break;
				case 7 :
					System.out.println("wygrałeś 6000 zł");
					break;
				}
				
				if(won7<3){
					System.out.println("brak wygranej");
				}
				break;
			case 8 :
				int won8 =0;
				for (int j = 0; j <3; j++) {
					for (int j2 = 0; j2 < multi.length; j2++) {
						if(score[j]==multi[j2]){
							won8+=1;
						}
					}
					
				}
				switch(won8){
				case 4:
					System.out.println("wygrałęś 4 zł");
					break;
				case 5:
					System.out.println("wygrałeś 20 zł");
					break;
				case 6 :
					System.out.println("Wygrałeś 60 zł");
					break;
				case 7 :
					System.out.println("wygrałeś 600 zł");
					break;
				case 8 :
					System.out.println("wygrałeś 22000 zł");
					break;
				}
				
				if(won8<4){
					System.out.println("brak wygranej");
				}
				break;
			case 9:
				int won9 =0;
				for (int j = 0; j <3; j++) {
					for (int j2 = 0; j2 < multi.length; j2++) {
						if(score[j]==multi[j2]){
							won9+=1;
						}
					}
					
				}
				switch(won9){
				case 4:
					System.out.println("wygrałęś 2 zł");
					break;
				case 5:
					System.out.println("wygrałeś 8 zł");
					break;
				case 6 :
					System.out.println("Wygrałeś 42 zł");
					break;
				case 7 :
					System.out.println("wygrałeś 300 zł");
					break;
				case 8 :
					System.out.println("wygrałeś 2000 zł");
					break;
				case 9:
					System.out.println("wygrałeś 70000 zł");
					break;
				}
				
				if(won9<4){
					System.out.println("brak wygranej");
				}
				break;
			case 10:
				int won10 =0;
				for (int j = 0; j <3; j++) {
					for (int j2 = 0; j2 < multi.length; j2++) {
						if(score[j]==multi[j2]){
							won10+=1;
						}
					}
					
				}
				switch(won10){
				case 4:
					System.out.println("wygrałęś 2 zł");
					break;
				case 5:
					System.out.println("wygrałęś 4 zł");
					break;
				case 6:
					System.out.println("wygrałeś 12 zł");
					break;
				case 7 :
					System.out.println("Wygrałeś 140 zł");
					break;
				case 8 :
					System.out.println("wygrałeś 520 zł");
					break;
				case 9 :
					System.out.println("wygrałeś 10000 zł");
					break;
				case 10:
					System.out.println("wygrałeś 250000 zł");
					break;
				}
				
				if(won10<4){
					System.out.println("brak wygranej");
				}
				break;
		}
	}
}
