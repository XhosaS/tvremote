package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfv {
    public final wfs a;
    public final double b;
    public final double c;

    private wfv(double d, double d2, wfs wfsVar) {
        new HashMap();
        this.b = d;
        this.c = d2;
        this.a = wfsVar;
    }

    public static wfv a(wfs wfsVar) {
        return new wfv(wfsVar.a, wfsVar.b, wfsVar);
    }

    public static wfv b(double d, double d2) {
        wfs wfsVarA;
        double d3 = d;
        HashMap map = new HashMap();
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                wfsVarA = wfs.a(d, d2, i2);
                break;
            }
            int i3 = (i2 + i) / 2;
            double d4 = wef.d(i3, d3, map);
            int i4 = i3 + 1;
            double d5 = wef.d(i4, d3, map);
            if (wef.d(i3, d3, map) >= d2 - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    d3 = d;
                    i = i3;
                } else {
                    if (i2 == i3) {
                        wfsVarA = wfs.a(d3, d2, i2);
                        break;
                    }
                    d3 = d;
                    i2 = i3;
                }
            } else if (d4 < d5) {
                d3 = d;
                i2 = i4;
            } else {
                d3 = d;
                i = i3;
            }
        }
        return new wfv(d, d2, wfsVarA);
    }
}
