import java.util.Date;

public class Produto {
	Date dataDeLancamento;
	double preco = 0.0;
	String material;
	String autor;
	String titulo;
	int id;
	
	public Produto(Date dataDeLancamento, double preco, String material, String autor, String titulo) {
		super();
		this.dataDeLancamento = dataDeLancamento;
		this.preco = preco;
		this.material = material;
		this.autor = autor;
		this.titulo = titulo;
	}

	public Date getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
