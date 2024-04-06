public interface Security {
    boolean authenticate(String username, String password);
    boolean authorize(User user, String action);
}
