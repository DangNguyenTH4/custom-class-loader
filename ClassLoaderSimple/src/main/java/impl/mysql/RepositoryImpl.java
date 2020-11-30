package impl.mysql;

import java.util.List;
import java.util.Optional;
import wrap.Repository;

public class RepositoryImpl implements Repository<Object , Object> {

  public RepositoryImpl(){
    System.out.println("Hi there, RepositoryImpl  Constructor, implement for MYSQL.");
  }

  @Override
  public Optional<Object> findById(Object id) {
    System.out.println("Hi there, RepositoryImpl Do FINDBYID method, implement for MYSQL.");
    return Optional.empty();
  }

  @Override
  public List<Object> findByField(String field, String type, String value) {
    System.out.println("Hi there, this is findByField method, implement for MYSQL.");
    return null;
  }
}
