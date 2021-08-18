package encryptdecrypt;

public class ShiftDecryptor extends Cryptor {
    public ShiftDecryptor(String data, int key) {
        super(data, key);
    }

    @Override
    public String process() {
        char[] ciphertext = data.toCharArray();

        for (int i = 0; i < ciphertext.length; i++) {
            if (ciphertext[i] >= 'a' && ciphertext[i] <= 'z') {
                if (ciphertext[i] - key < 'a') {
                    ciphertext[i] = (char) ('z' - 'a' % (ciphertext[i] - key) + 1);
                } else {
                    ciphertext[i] -= key;
                }
            }
        }

        return String.valueOf(ciphertext);
    }
}
