
import java.util.List;

public interface ProdutoDAO {

	List<Produto> getAll() throws ProdutoDAOException;
	
}
