package Tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Item {
	SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
	Livro livro;
	Date dataDevolucao;
 
    public Item(Livro livro) throws ParseException {
		super();
		this.livro = livro;
		dataDevolucao = calculaDataDevolucao();
	}
    
	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Date calculaDataDevolucao() throws ParseException {
		Date emp = DateFor.parse("11/11/2022");
	    Calendar calendar = Calendar.getInstance();
		calendar.setTime(emp);
		calendar.add(Calendar.DATE, livro.verPrazo());
        return calendar.getTime();
	}
}
