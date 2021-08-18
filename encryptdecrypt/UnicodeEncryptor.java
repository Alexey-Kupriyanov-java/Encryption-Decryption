package encryptdecrypt;

public class UnicodeEncryptor extends Cryptor {

    public UnicodeEncryptor(String data, int key) {
        super(data, key);
    }

    @Override
    public String process() {
        char[] ciphertext = data.toCharArray();

        for (int i = 0; i < ciphertext.length; i++) {
            ciphertext[i] += key;
        }

        return String.valueOf(ciphertext);
    }
}
