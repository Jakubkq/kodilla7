package com.example.kodilla.stream;

import com.example.kodilla.stream.forumuser.Forum;
import com.example.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forum -> forum.getSex() == 'M')
                .filter(forum -> forum.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forum -> forum.getNumberOfposts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forum -> forum));
        System.out.println("Number of elements in Map: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
