public interface UserService extends BaseService<User> {
    User login(String username, String password);
}