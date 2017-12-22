package com.glass_fox.charactersheet.security;

import com.glass_fox.charactersheet.database.galary.User;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * Hashes and compares hashed passwords
 */
public class PasswordManager {

    private static final int SALT_BYTES = 32;
    private static final int HASH_BYTES = 32;
    private static final int ITERATIONS = 1000;

    private static final SecureRandom secureRandom = new SecureRandom();
    private static final String ALGORITHM = "PBKDF2WithHmacSHA1";


    public boolean setPassword(User user, String password) {
        byte[] salt = new byte[SALT_BYTES];
        secureRandom.nextBytes(salt);
        user.setSalt(new String(salt));
        byte[] hashedPassword = hashPassword(password, salt);

        if (hashedPassword != null) {
            user.setPassword(new String(hashedPassword));
            return true;
        }
        else return false;
    }

    public boolean checkPassword(User user, String password) {
        byte[] salt = user.getSalt().getBytes();
        byte[] passwordToCheck = hashPassword(password, salt);
        byte[] goodPassword = user.getPassword().getBytes();

        return slowEquals(passwordToCheck, goodPassword);
    }

    private byte[] hashPassword(String password, byte[] salt) {
        try {
            PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, ITERATIONS, HASH_BYTES);
            SecretKeyFactory skf = SecretKeyFactory.getInstance(ALGORITHM);
            return skf.generateSecret(spec).getEncoded();
        }
        catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean slowEquals(byte[] a, byte[] b) {
        int diff = a.length ^ b.length;

        for (int i = 0; i < a.length && i < b.length; i++) {
            diff |= a[i] ^ b[i];
        }

        return diff == 0;
    }
}
