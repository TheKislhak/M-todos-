package metodos;

import java.util.ArrayList;

public class SomaDosArrays {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		int soma=0;
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		for(int i :num) {
			soma+=i;
		}
		System.out.print(soma + ", ");
	}

}
