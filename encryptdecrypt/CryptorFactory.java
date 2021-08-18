package encryptdecrypt;

import java.io.*;

public class CryptorFactory {
    static Cryptor getCryptor(String mode, String alg, String data, int key) {

        switch (mode) {
            case "enc":
                if ("unicode".equals(alg)) {
                    return new UnicodeEncryptor(data, key);
                } else if ("shift".equals(alg)) {
                    return new ShiftEncryptor(data, key);
                }
            case "dec":
                if ("unicode".equals(alg)) {
                    return new UnicodeDecryptor(data, key);
                } else if ("shift".equals(alg)) {
                    return new ShiftDecryptor(data, key);
                }
        }

        return null;
    }
}
