package OwnWorkshop;

import java.util.Random;

public class Kaskada extends BubbleSort {
	
	
	
	public void kaskada(){
		Random generator = new Random();
		int a ;
		int[] kas =new int[12];
		int i =1;
		int flag =0;
		 kas[0]=generator.nextInt(24)+1;
		while(i<12){
			flag=0;
			a=generator.nextInt(24)+1;
			for(int j=0;j<i;j++){
				if(a==kas[j]){
					flag =1;
				}
			}
			
			if(flag==0){
				kas[i]=a;
				i+=1;
			}
		}
		System.out.println("Twój los");
		for (int j = 0; j < kas.length; j++) {
			
			System.out.print(kas[j]+" ");
		}
	
		int b ;
		int[] win =new int[12];
		int j =1;
		int flag1 =0;
		 win[0]=generator.nextInt(24)+1;
		while(j<12){
			flag1=0;
			b=generator.nextInt(24)+1;
			for(int k=0;k<j;k++){
				if(b==kas[k]){
					flag1 =1;
				}
			}
			
			if(flag1==0){
				win[j]=b;
				j+=1;
			}
		}
		System.out.println("\n"
				+ "Wygrane numery");
		int wins=0;
		int won=0;
		for (int k = 0; k< kas.length; k++) {
			
			System.out.print(win[k]+" ");
			wins=win[k];
			for (int k2 = 0; k2 < win.length; k2++) {
				if(wins==kas[k2]){
					won+=1;
				}
			}
			
		}
		if(won>=8){
			if(won<9){
				System.out.println("wygrana 21");
			}else {
				if(won<10){
					System.out.println("wygrana 8");
				}else{
					if(won<11){
						System.out.println("wygrana 25");
					}else{
						if(won<12){
							System.out.println("wygrana 1000");
						}else{
							if(won<13){
								System.out.println("wygrana 250000");
							}
						}
					}
				}
			}
		}
	}}
