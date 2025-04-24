import java.util.List;

public interface MenuService extends BaseService<MenuItem> {
    List<MenuItem> getAvailableItems();
}