package junitlearning3_4Test;


public class UserRepository {
    public String findUserById(int id) {
        // Simulating DB call
        if (id == 1) {
            return "John";
        } else {
            return null;
        }
    }
}

