package metodos;

import java.util.ArrayList;

public class ExArryList {

	public static void main(String[] args) {
		// criando um arry list de numeros inteiros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(10); // adicionando elementos ao ArrayList
		numeros.add(20);
		
		System.out.println(numeros.get(0)); // saída:10 // acessando elementos arraylist
		System.out.println(numeros.get(1)); // saída: 20
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1)); // saída: 25 // modificando um elemento do arraylist
		
		numeros.remove(0);
		System.out.println(numeros.get(0)); // saída: 25 // removendo um elemento do arraylist
		
		System.out.println(numeros.size()); // saída: 2 // obtendo o tamanho do arraylist

	}

}
