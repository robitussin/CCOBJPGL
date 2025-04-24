import java.util.List;

public interface BaseService<T> {
    T getById(String id);
    List<T> getAll();
    void delete(String id);
}