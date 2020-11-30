package impl.mongo;

import java.util.List;
import wrap.ConnectionManager;

public class ConnectionManagerImpl implements ConnectionManager {
  public ConnectionManagerImpl(){
    System.out.println("Hi there, ConnectionManagerImpl  Constructor, implement for MONGO.");
  }
  @Override
  public List<Object> getConnectionPool() {
    System.out.println("Hi there, ConnectionManagerImpl Do getConnectionPool method, implement for MONGO.");
    return null;
  }

  @Override
  public void setConnectionPool() {
    System.out.println("Hi there, ConnectionManagerImpl Do setConnectionPool method, implement for MONGO.");
  }
}
