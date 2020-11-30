package wrap;

import java.util.List;

public interface ConnectionManager {
  List<Object> getConnectionPool();
  void setConnectionPool();
}
