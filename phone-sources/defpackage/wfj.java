package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfj {
    public final double a;
    public final double b;

    public wfj(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static wfj c(double d, double d2) {
        double d3 = d;
        HashMap map = new HashMap();
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                ssd.a(d, d2, i2);
                break;
            }
            int i3 = (i2 + i) / 2;
            double dJ = ssr.j(i3, d3, map);
            int i4 = i3 + 1;
            double dJ2 = ssr.j(i4, d3, map);
            if (ssr.j(i3, d3, map) >= d2 - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    d3 = d;
                    i = i3;
                } else {
                    if (i2 == i3) {
                        ssd.a(d3, d2, i2);
                        break;
                    }
                    d3 = d;
                    i2 = i3;
                }
            } else if (dJ < dJ2) {
                d3 = d;
                i2 = i4;
            } else {
                d3 = d;
                i = i3;
            }
        }
        return new wfj(d, d2, null);
    }

    public final double a() {
        return vyf.f(this.a, this.b, 0.0d);
    }

    public final ssd b(double d) {
        return ssd.a(this.a, this.b, d);
    }

    public wfj(double d, double d2, byte[] bArr) {
        new HashMap();
        this.a = d;
        this.b = d2;
    }
}
