package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class EmprestimoTestCase {

	@Test
	void test1() throws ParseException {
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
		
		assertEquals("17/11/2022", DateFor.format(e.CalculaDataDevolucao()));
	}
	
	@Test
	void test2() throws ParseException {
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		
		Emprestimo e = new Emprestimo();

		Livro l1 = new Livro(1);
		
		Livro l2 = new Livro(2);
		
		
		Item i1 = new Item(l1);
		Item i2 = new Item(l2);
		e.livros.add(i1);
		e.livros.add(i2);
		
		assertEquals("14/11/2022", DateFor.format(e.CalculaDataDevolucao()));
	}

	@Test
	void outrasFuncoes() throws ParseException {
		Date data = new Date();
		Emprestimo e = new Emprestimo();
		
		e.setDataEmprestimo(data);
		e.getDataEmprestimo();
		
		Livro l1 = new Livro(1);
		Livro l2 = new Livro(2);
		Item i1 = new Item(l1);
		
		i1.setDataDevolucao(data);
		i1.setLivro(l2);
		i1.getLivro();
		
		l2.titulo.setPrazo(3);
	}
}
