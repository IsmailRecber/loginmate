package com.loginpage.loginmate;
import org.mindrot.jbcrypt.BCrypt;

public class UserUtils {

    public static String hashPassword(String password) {
        String salt = BCrypt.gensalt(12);
        return BCrypt.hashpw(password, salt);
    }

    public static boolean checkPassword(String plaintextPassword, String hashedPassword) {
        return BCrypt.checkpw(plaintextPassword, hashedPassword);
    }

}
