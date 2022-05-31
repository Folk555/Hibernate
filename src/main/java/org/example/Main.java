package org.example;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Owner owner = new Owner("Masha", 26);
        userService.saveUser(owner);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(owner);
        owner.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(owner);
        owner.addAuto(ford);
        userService.updateUser(owner);
    }
}
