package com.loginpage.loginmate;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;

import static com.loginpage.loginmate.DatabaseManager.closeConnection;
import static com.loginpage.loginmate.UserUtils.hashPassword;

public class UserDAO {
    private DatabaseManager DatabaseConnection;

    public void registerUser(User user) throws SQLException {
        String checkUserSQL = "SELECT COUNT(*) FROM user WHERE user_name = ?";

        String insertUserSQL = "INSERT INTO USER (user_name, password, email) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkUserSQL);
             PreparedStatement insertStmt = conn.prepareStatement(insertUserSQL)) {

         checkStmt.setString(1, user.getUserName());
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    if (count > 0) {
                        System.out.println("Bu kullanıcı adı zaten mevcut.");
                        return;
                    }
                }
            }

            insertStmt.setString(1, user.getUserName());
            insertStmt.setString(2, hashPassword(user.getPassword()));
            insertStmt.setString(3, user.getemail());
            insertStmt.executeUpdate();

            System.out.println("Kullanıcı başarıyla kaydedildi.");
            closeConnection();
        }
    }


    public static boolean loginUser(String userName, String password) {
        System.out.println("LOGIN: User Name: " + userName + ", Password: " + password);
        String sql = "SELECT * FROM USER WHERE user_name = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userName);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String hashedPassword = rs.getString("password");
                System.out.println("Hash edilmiş şifre: " + hashedPassword);
                if (UserUtils.checkPassword(password,hashedPassword)) {
                    System.out.println("Giriş yapılıyor... ");
                    return true;
                } else {
                    System.out.println("Giriş başarısız: Kullanıcı adı veya şifre yanlış.");
                    return false;
                }
            } else {
                System.out.println("Giriş başarısız: Kullanıcı adı veya şifre yanlış.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                closeConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }




    }


