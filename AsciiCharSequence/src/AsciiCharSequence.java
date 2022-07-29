import java.lang.CharSequence;

public class AsciiCharSequence implements CharSequence {

    byte[] mas;

    public AsciiCharSequence(byte[] mas) {
        this.mas = mas;
    }

    @Override
    public int length() {
        return this.mas.length;
    }

    @Override
    public char charAt(int index) {
        return (char) this.mas[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start == end) {
            return "";
        }
        byte[] new_mas = new byte[end-start];
        for (int i = start; i < end; i++) {
            new_mas[i-start] = this.mas[i];
        }
        return new AsciiCharSequence(new_mas);
    }

    @Override
    public String toString() {
        return new String(this.mas);
    }
}