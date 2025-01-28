
import java.security.SecureRandom;

public class PasswordGenerator {

    public static void main(String[] args) {
        int passwordLength = 10;
        String password = generatePassword(passwordLength);
        System.out.println("Generated Password: " + password);
    }
    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}
