package Tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {
	SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
	Date dataEmprestimo = new Date();
	
	public Date getDataEmprestimo() throws ParseException {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

    Date dataPrevista = new Date();

	List<Item> livros = new ArrayList<Item>();
	int j = 0;
	
	public Date CalculaDataDevolucao() throws ParseException
	{   
		for(int i = 0;i < livros.size(); i++) {
			if(livros.get(i).getDataDevolucao().compareTo(livros.get(j).getDataDevolucao())>0) {
				j = i;
			}
		}
		dataPrevista = livros.get(j).dataDevolucao;
	
	 	Calendar calendar = Calendar.getInstance();
	 	calendar.setTime(dataPrevista);
	 	if(livros.size()>2) {
	 		calendar.add(Calendar.DATE, (livros.size()-2)*2);
	 	}
		
	 	dataPrevista = calendar.getTime();
		return dataPrevista;
	}
	
}