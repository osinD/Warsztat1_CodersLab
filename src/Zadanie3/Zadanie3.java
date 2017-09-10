package Zadanie3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		int number=0;
		
		try{
			System.out.println("podaj liczbe");
			number=read.nextInt();
		}catch(InputMismatchException e){
			System.out.println("podano błędną liczbę");
		}
		
		Random generator = new Random();
		
		int ran =generator.nextInt(1000);
		System.out.println(ran);
		int j=0;
		int max=1000, min=1;
		int check =0;
		while(check==0||j!=10){ 
			String write =read.nextLine();
			if(write.equals("wiecej")){
				min=ran;
				ran=generator.nextInt(max-min)+min;
				System.out.println(ran);
			}else{
				if(write.equals("mniej")){
					max=ran;
					ran=generator.nextInt(max-min)+min;
					System.out.println(ran);
				}else if(write.equals("trafione")){
					check =1;
				}
			}
			
			j+=1;
			
		}

	}
}
