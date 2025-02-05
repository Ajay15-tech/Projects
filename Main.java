package com.ajay;

import java.util.Optional;

interface UserService {

    // Default method returning a generic welcome message
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    // Method that returns an Optional containing the user's name
    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {

    // Implementing getUser to return an Optional with the user's name if present
    @Override
    public Optional<String> getUser(String name) {
        // If the name is not null and not empty, return it wrapped in an Optional
        if (name != null && !name.trim().isEmpty()) {
            return Optional.of(name);
        } else {
            return Optional.empty(); // Return an empty Optional if no name is provided
        }
    }

    // You can also override the default method if you want to customize the message
    @Override
    public String getWelcomeMessage() {
        return "Welcome to our system!";
    }
}

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Test with a name
        Optional<String> userName = userService.getUser("John");
        userName.ifPresentOrElse(
            name -> System.out.println("Welcome, " + name + "!"), // If name is present
            () -> System.out.println(userService.getWelcomeMessage()) // Default message if not
        );

        // Test without a name
        userName = userService.getUser("");
        userName.ifPresentOrElse(
            name -> System.out.println("Welcome, " + name + "!"),
            () -> System.out.println(userService.getWelcomeMessage())
        );
    }
}
