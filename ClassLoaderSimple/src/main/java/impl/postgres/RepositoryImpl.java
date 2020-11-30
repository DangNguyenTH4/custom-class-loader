package impl.postgres;

import java.util.List;
import java.util.Optional;
import wrap.Repository;

public class RepositoryImpl implements Repository<Object , Object> {

  public RepositoryImpl(){
    System.out.println("Hi there, RepositoryImpl  Constructor, implement for POSTGRES.");
  }

  @Override
  public Optional<Object> findById(Object id) {
    System.out.println("Hi there, RepositoryImpl Do FINDBYID method, implement for POSTGRES.");
    return Optional.empty();
  }

  @Override
  public List<Object> findByField(String field, String type, String value) {
    System.out.println("Hi there, this is findByField method, implement for POSTGRES.");
    return null;
  }
}
