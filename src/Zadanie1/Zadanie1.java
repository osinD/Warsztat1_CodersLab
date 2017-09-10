package Zadanie1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Zadanie1 {



	



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Random generator = new Random();
			int ran=generator.nextInt(10);
			 Scanner odczyt = new Scanner(System.in);
			 //System.out.println("podaj liczbe");
			 int a =0; 
			 int x=0;
			
			
				
			 
			 while(x==0){
				 
				 System.out.println("podaj liczbe");
				 try{
					 a=Integer.parseInt(odczyt.nextLine());
				 }catch(NumberFormatException e){
					 System.out.println("zla liczba");
					 continue;
				 }
				 if(a>10){
					 System.out.println("zla liczba");
				 }else{
				 if(a<ran){
					 System.out.println("za mało");
				 }else{
					 if(a>ran){
					 System.out.println("za dużo");
					 }else{
						 System.out.println("udało sie");
						 x=1;
					 }
				 }
				 }
				 }
			
		}

	

}
