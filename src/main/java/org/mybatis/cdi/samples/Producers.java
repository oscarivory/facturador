
package org.mybatis.cdi.samples;

import java.io.Reader;
import java.sql.Connection;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.cdi.SessionFactoryProvider;


@ApplicationScoped
public class Producers {

  private static final Logger LOG = Logger.getLogger(Producers.class.getName());

  /**
   * Simple SqlSessionFactory provider. Required by MyBatis.
   */
  @ApplicationScoped
  @Produces
  @SessionFactoryProvider
  public SqlSessionFactory produce() throws Exception {
    Reader reader = Resources.getResourceAsReader("mybatis-config_1.xml");
    SqlSessionFactory manager = new SqlSessionFactoryBuilder().build(reader);
    reader.close();
    // Insert some sample data...
    insertSampleData(manager);
    return manager;
  }

  /**
   * Sample data.
   */
  private void insertSampleData(SqlSessionFactory manager) throws Exception {
    try (SqlSession session = manager.openSession()) {
      Connection conn = session.getConnection();
      Reader reader = Resources.getResourceAsReader("CreateDB_1.sql");
      ScriptRunner runner = new ScriptRunner(conn);
      runner.setLogWriter(null);
      runner.runScript(reader);
      reader.close();
    }
    catch (Exception ex) {
      LOG.info("Error executing SQL Script.... maybe DB already exists. This is just a test :D");
    }
  }

}
