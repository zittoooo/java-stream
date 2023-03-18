package chapter5;

import chapter5.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Chapter5Section2 {
    public static void main(String[] args) {
        // 스트링을 받아서 스트링 안 length를 호출해주는 함수 만들어보기
        Function<String, Integer> strLength = String::length;
        int length = strLength.apply("helow world");
        System.out.println(length); // 11


        BiPredicate<String, String> strEquals = String::equals;
        boolean helloEqualsWorld = strEquals.test("hello", "world");
        System.out.println(helloEqualsWorld);

        List<User> users = new ArrayList<>();
        users.add(new User(3, "Alice"));
        users.add(new User(1, "Charlie"));
        users.add(new User(4, "Bob"));

//        printUserField(users, User::getName);
    }


    public static void printUserField(List<User> users, Function<User, Objects> getter) {
        for (User user : users) {
            System.out.println(getter.apply(user));
        }
    }
}
