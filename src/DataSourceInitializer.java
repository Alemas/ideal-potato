import javax.sql.DataSource;
import org.apache.derby.jdbc.EmbeddedDataSource;


public class DataSourceInitializer {
	
	private static DataSource dataSource;

    private static DataSource createDataSource() throws Exception {
        if (dataSource == null) {
            EmbeddedDataSource ds = new EmbeddedDataSource();
            ds.setDatabaseName("Amazon");
            ds.setCreateDatabase("create");
//            ds.setUser("USER");
//            ds.setPassword(PASSWORD);
            dataSource = ds;
        }
        return dataSource;
    }
	
}
