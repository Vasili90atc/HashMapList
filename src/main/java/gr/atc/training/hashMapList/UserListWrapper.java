package gr.atc.training.hashMapList;

import java.util.List;

public class UserListWrapper {
    private List<User> users;
    private int total;
    private int skip;
    private int limit;

    public List<User> getUsers() {
        return users;
    }
}