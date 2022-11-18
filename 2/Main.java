package Tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		
		Emprestimo e = new Emprestimo();

		Livro l1 = new Livro(1);
		
		Livro l2 = new Livro(2);
		
		Livro l3 = new Livro(3); 
		
		Item i1 = new Item(l1);
		Item i2 = new Item(l2);
		Item i3 = new Item(l3);
		e.livros.add(i1);
		e.livros.add(i2);
		e.livros.add(i3);
		
		String emp = DateFor.format(e.getDataEmprestimo());
		String dev = DateFor.format(e.CalculaDataDevolucao());
		
		System.out.print("Data de Empr�stimo: " + emp);
		System.out.print("\nData de Devolu��o: " + dev);

	}

}