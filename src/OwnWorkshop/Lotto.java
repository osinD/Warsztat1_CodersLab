package OwnWorkshop;

import java.util.Random;
import java.util.Scanner;

public class Lotto extends BubbleSort {
	
	public void lotto(){
		int[] lotto = new int[6];
		int[] user = new int[6];
		Random generator = new Random();
		Scanner read = new Scanner(System.in);
		
		int j=1;
		//for (int i = 0; i < lotto.length; i++) {
		lotto[0]=generator.nextInt(49)+1;
		int z =0;
		int spr =1;
		while(j<6){
			
			z=generator.nextInt(49)+1;
			for(int i=j-1;i>=0;i--){
			if(z==lotto[i]){
				continue;
			}
			}
			lotto[j]=z;
			j++;
		}
		
		lotto=bubblesort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
			
		}
		
		int walker=0;
		int num=0;
		while(walker<6){
			
			System.out.print("Podaj liczbe");
			try{
			user[walker]=Integer.parseInt(read.nextLine());
			}catch(NumberFormatException e){
				System.out.println("zla liczba");
				continue;
			}
			
			num=user[walker];
			if((num<=0)||(num>49)){
				System.out.println("zla liczba");
			}else{
				walker+=1;
			}
			
		}
		user=bubblesort(user);
		int count=0;
		int value =0;
		int[] score =lotto;
		for (int i = 0; i < user.length; i++) {
			value=user[i];
			for (int k = 0; k < score.length; k++) {
				if(value==score[k]){
					score[k]=0;
					count+=1;
				}
			}
		}
		if(count>2){
		System.out.println("wylosowałes"+ count);
		}
	}

}
