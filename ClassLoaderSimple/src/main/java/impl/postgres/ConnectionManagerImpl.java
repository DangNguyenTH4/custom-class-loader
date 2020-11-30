package impl.postgres;

import java.util.List;
import wrap.ConnectionManager;

public class ConnectionManagerImpl implements ConnectionManager {
  public ConnectionManagerImpl(){
    System.out.println("Hi there, ConnectionManagerImpl  Constructor, implement for POSTGRES.");
  }
  @Override
  public List<Object> getConnectionPool() {
    System.out.println("Hi there, ConnectionManagerImpl Do getConnectionPool method, implement for POSTGRES.");
    return null;
  }

  @Override
  public void setConnectionPool() {
    System.out.println("Hi there, ConnectionManagerImpl Do setConnectionPool method, implement for POSTGRES.");
  }
}
