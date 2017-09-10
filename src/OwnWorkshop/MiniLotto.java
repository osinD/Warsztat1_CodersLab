package OwnWorkshop;

import java.util.Random;
import java.util.Scanner;

public class MiniLotto extends BubbleSort{
	
	
	
	public void miniLotto(){
		
	int[] mini = new int[5];
	int[] generated = new int[6];
	Random generator = new Random();
	Scanner read = new Scanner(System.in);
	
	
	generated[0]=generator.nextInt(42)+1;
	int j=1;
	int z =0;
	int spr =1;
	while(j<6){
		
		z=generator.nextInt(42)+1;
		for(int i=j-1;i>=0;i--){
		if(z==generated[i]){
			continue;
		}
		}
		generated[j]=z;
		j++;
	}
	int walker =0;
	int num ;
	while(walker<5){
		
		System.out.print("Podaj liczbe");
		try{
		mini[walker]=read.nextInt();
		}catch(NumberFormatException e){
			System.out.println("zla liczba");
			continue;
		}
		
		num=mini[walker];
		if((num<=0)||(num>42)){
			System.out.println("zla liczba");
		}else{
			walker+=1;
		}
		
	}
	
	
//	mini=bubblesort(mini);
	int count=0;
	int value =0;
	int[] score =generated;
	for (int i = 0; i < mini.length; i++) {
		value=mini[i];
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
	if(count>3){
		System.out.println("wylosowałeś"+count);
	}
	if(count>4){
		System.out.println("wylosowałes"+count);
	}
	
		
	}
	
	
	}



