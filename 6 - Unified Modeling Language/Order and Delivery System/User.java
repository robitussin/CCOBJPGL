public abstract class User extends Person {
    protected String userId;
    protected String username;
    protected String password;

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}