package com.example.kodilla.stream.forumuser;


import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(22234, "Janina", 'F', 1967, 5, 23, 2));
        forumUserList.add(new ForumUser(55343, "Kuba", 'M', 1988, 9, 5, 18));
        forumUserList.add(new ForumUser(99978, "Agnieszka", 'F', 2008, 12, 18, 1));
        forumUserList.add(new ForumUser(65678, "Wojtek", 'M', 1995, 10, 18, 4));
        forumUserList.add(new ForumUser(33478, "Sebastian", 'M', 2001, 10, 15, 3));
        forumUserList.add(new ForumUser(65656, "Adrian", 'M', 1999, 11, 14, 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
