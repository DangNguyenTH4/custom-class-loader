package wrap;

import java.util.List;
import java.util.Optional;

public  interface Repository<T, E> {
  Optional<E> findById(T id);
  List<E> findByField(String field, String type, String value);
}
