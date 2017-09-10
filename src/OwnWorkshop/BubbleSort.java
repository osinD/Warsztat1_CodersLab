package OwnWorkshop;

public class BubbleSort {

	public int[] bubblesort(int[] tab){
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=tab[i];
		}
		int temp;
		int change = 1;
		while(change > 0){
		change = 0;
			for(int i=0; i<lotto.length-1; i++){
				if(lotto[i]>lotto[i+1]){
					temp = lotto[i+1];
					lotto[i+1] = lotto[i];
					lotto[i] = temp;
					change++;
					}
			}
		}
		return lotto;
	}
}
