package Week4;
import java.util.Random;

public class Ex81 {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}

class PasswordRandomizer {
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";

        for (int i = 0; i < this.length; i++) {
            int randomIndex = this.random.nextInt(26);
            char randomChar = alphabet.charAt(randomIndex);
            password = password + randomChar;
        }

        return password;
    }
}