package encryptdecrypt;

public abstract class Cryptor {
    String data;
    int key;

    public Cryptor(String data, int key) {
        this.data = data;
        this.key = key;
    }

    abstract String process();
}
