import java.util.ArrayList;
import java.util.List;

import com.sun.jndi.ldap.Connection;

public class ProdutoDAODerby implements ProdutoDAO {

	@Override
	public List<Produto> getAll() throws ProdutoDAOException {
		List <Produto> produtos = new ArrayList<>();
		String sqlSearch = "select * from app.products";
		
		try (Connection c = DataSourceInitializer.)
		
		return produtos;
	}

	
	
}
