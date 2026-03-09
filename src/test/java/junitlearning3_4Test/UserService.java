package junitlearning3_4Test;


public class UserService {

    private final UserRepository userRepository;

    // Constructor injection (best practice)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserGreeting(int id) {
        String user = userRepository.findUserById(id);
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }
        return "Hello, " + user + "!";
    }
}

