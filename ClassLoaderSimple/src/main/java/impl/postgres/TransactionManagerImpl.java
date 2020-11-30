package impl.postgres;

import wrap.TransactionManager;

public class TransactionManagerImpl implements TransactionManager {

  public TransactionManagerImpl(){
    System.out.println("Hi there, this is TRANSACTION Construct method, implement for POSTGRES.");
  }
  @Override
  public Object rollback(Object object) {
    System.out.println("Hi there, TransactionManagerImpl do ROLLBACK, implement for POSTGRES.");
    return null;
  }

  @Override
  public Object commit(Object object) {
    System.out.println("Hi there, TransactionManagerImpl do COMMIT, implement for POSTGRES.");
    return null;
  }
}
