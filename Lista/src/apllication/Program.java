package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		/* Conceito de Lista
		 * Tipo List - Declara��o, instancia��o
		 * Demo
		 * Referencia: //docs.oracle.com/javase/10/docs/api/java/util/List.html
		 * 
		 * Assuntos pendentes:
		 * interfaces
		 * generics
		 * predicados(lambda)
		 */
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Lucas");
		list.add("Abel");
		list.add("Mateus");
		list.add("Luiz");
		list.add("Antonio");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		// Inserir na posi��o 2
		list.add(2, "Marco");
				
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.print("ver tamanho da lista: ");
		System.out.println(list.size());
		
		System.out.println("----Remover da Lista---");
		// Remover Anna da Lista
		list.remove("Anna");
		// Remover item 1 "Alex"
		list.remove(1);
				
		for (String x : list) {
			System.out.println(x);
		}		
		System.out.print("Tamanho Atual da lista: ");
		System.out.println(list.size());
		
		System.out.println("----Remover por Predicado ---");
		// deu erro
		// Remover todos que come��o com "M"
		// list.removeIf(x -> x.charAt(0) == "M");
		
		System.out.println("----Index Of Bob ---------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marcos"));
				
		System.out.println("----Deixar na Lista todos com M ---");
		// Manter na lista somente os que come�am com "M"
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}		
		
		System.out.println("--------------------");
		// Encontrar elemento que atenda 1 predicado. Primeiro elemento que come�a com "A"
		// deu erro
		// String name = list.stream().filter(x -> x.charAt(0) == "A").findFirst().orElse(null));
		
		
	}

}
