/**
 * Created with IntelliJ IDEA.
 * User: Зяблик
 * Date: 25.09.16
 * Time: 8:28
 * To change this template use File | Settings | File Templates.
 */
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.hashCode() == obj.hashCode()) {
            return true;
        }
        if (obj instanceof ComplexNumber) {
            ComplexNumber cn = (ComplexNumber) obj;
            if (this.getRe() == cn.getRe() && this.getIm() == cn.getIm()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.getRe()*this.getIm());
    }
}
