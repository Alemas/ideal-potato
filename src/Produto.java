import java.util.Date;
public class Produto {
	Date dataDeLancamento;
	double preco = 0.0;
	String material;
	String autor;
	String titulo;
	int id;
	
	public Produto(Date dataDeLancamento, double preco, String material, String autor, String titulo, int id) {
		super();
		this.dataDeLancamento = dataDeLancamento;
		this.preco = preco;
		this.material = material;
		this.autor = autor;
		this.titulo = titulo;
		this.id = id;
	}
	
	
	
}
