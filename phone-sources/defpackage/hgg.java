package defpackage;

import android.graphics.Color;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgg implements hhc {
    private final /* synthetic */ int g;
    public static final hgg f = new hgg(5);
    public static final hgg e = new hgg(4);
    public static final hgg d = new hgg(3);
    public static final hgg c = new hgg(2);
    public static final hgg b = new hgg(1);
    public static final hgg a = new hgg(0);

    private hgg(int i) {
        this.g = i;
    }

    @Override // defpackage.hhc
    public final /* synthetic */ Object a(hhf hhfVar, float f2) {
        boolean z;
        int i = this.g;
        if (i == 0) {
            return Float.valueOf(hgm.a(hhfVar) * f2);
        }
        if (i == 1) {
            z = hhfVar.p() == 1;
            if (z) {
                hhfVar.g();
            }
            double dA = hhfVar.a();
            double dA2 = hhfVar.a();
            double dA3 = hhfVar.a();
            double dA4 = hhfVar.p() == 7 ? hhfVar.a() : 1.0d;
            if (z) {
                hhfVar.i();
            }
            if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
                dA *= 255.0d;
                dA2 *= 255.0d;
                dA3 *= 255.0d;
                if (dA4 <= 1.0d) {
                    dA4 *= 255.0d;
                }
            }
            return Integer.valueOf(Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
        }
        if (i == 2) {
            return Integer.valueOf(Math.round(hgm.a(hhfVar) * f2));
        }
        if (i == 3) {
            return hgm.c(hhfVar, f2);
        }
        if (i != 4) {
            z = hhfVar.p() == 1;
            if (z) {
                hhfVar.g();
            }
            float fA = (float) hhfVar.a();
            float fA2 = (float) hhfVar.a();
            while (hhfVar.n()) {
                hhfVar.m();
            }
            if (z) {
                hhfVar.i();
            }
            return new hhv((fA / 100.0f) * f2, (fA2 / 100.0f) * f2);
        }
        int iP = hhfVar.p();
        if (iP == 1) {
            return hgm.c(hhfVar, f2);
        }
        if (iP == 3) {
            return hgm.c(hhfVar, f2);
        }
        if (iP != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(a.ag(iP)));
        }
        PointF pointF = new PointF(((float) hhfVar.a()) * f2, ((float) hhfVar.a()) * f2);
        while (hhfVar.n()) {
            hhfVar.m();
        }
        return pointF;
    }
}
