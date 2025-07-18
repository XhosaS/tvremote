package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srz {
    static final double[][] a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final double[] c = {95.047d, 100.0d, 108.883d};

    static double a(double d) {
        return d > 0.008856451679035631d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double b(double d) {
        double d2 = d * d * d;
        return d2 > 0.008856451679035631d ? d2 : ((d * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static double c(int i) {
        double d = i / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static double d(double d) {
        return (a(d / 100.0d) * 116.0d) - 16.0d;
    }

    public static double e(double d) {
        return b((d + 16.0d) / 116.0d) * 100.0d;
    }

    public static int f(double[] dArr) {
        return g(i(dArr[0]), i(dArr[1]), i(dArr[2]));
    }

    public static int g(int i, int i2, int i3) {
        return (i << 16) | (-16777216) | (i2 << 8) | i3;
    }

    public static int h(int i) {
        return i & 255;
    }

    public static int i(double d) {
        double d2 = d / 100.0d;
        return sik.j((int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    public static int j(int i) {
        return (i >> 8) & 255;
    }

    public static int k(int i) {
        return (i >> 16) & 255;
    }

    public static double[] l(int i) {
        int iH = h(i);
        int iJ = j(i);
        double dC = c(k(i));
        double dC2 = c(iJ);
        double dC3 = c(iH);
        double[][] dArr = a;
        double[] dArr2 = dArr[0];
        double d = dArr2[0] * dC;
        double d2 = dArr2[1] * dC2;
        double d3 = dArr2[2] * dC3;
        double[] dArr3 = dArr[1];
        double d4 = dArr3[0] * dC;
        double d5 = dArr3[1] * dC2;
        double d6 = dArr3[2] * dC3;
        double[] dArr4 = dArr[2];
        double d7 = dArr4[0] * dC;
        double d8 = dArr4[1] * dC2;
        double d9 = dArr4[2] * dC3;
        double[] dArr5 = c;
        double d10 = ((d + d2) + d3) / dArr5[0];
        double d11 = ((d4 + d5) + d6) / dArr5[1];
        double d12 = ((d7 + d8) + d9) / dArr5[2];
        double dA = a(d10);
        double dA2 = a(d11);
        return new double[]{(116.0d * dA2) - 16.0d, (dA - dA2) * 500.0d, (dA2 - a(d12)) * 200.0d};
    }
}
