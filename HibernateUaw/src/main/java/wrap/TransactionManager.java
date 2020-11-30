package wrap;

public interface TransactionManager {
  Object rollback(Object object);
  Object commit(Object object);

}
