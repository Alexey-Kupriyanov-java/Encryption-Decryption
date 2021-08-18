package encryptdecrypt;

public class ShiftEncryptor extends Cryptor {
    
    public ShiftEncryptor(String data, int key) {
        super(data, key);
    }
    @Override
    String process() {
        char[] ciphertext = data.toCharArray();

        for (int i = 0; i < ciphertext.length; i++) {
            if (ciphertext[i] >= 'a' && ciphertext[i] <= 'z') {
                if (ciphertext[i] + key > 'z') {
                    ciphertext[i] = (char) ('a' + (ciphertext[i] + key) % 'z' - 1);
                } else {
                    ciphertext[i] += key;
                }
            }
        }

        return String.valueOf(ciphertext);
    }
}
