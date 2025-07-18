package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgm {
    private static final ghd a = ghd.d("x", "y");

    static float a(hhf hhfVar) {
        int iP = hhfVar.p();
        int i = iP - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) hhfVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(a.ag(iP)));
        }
        hhfVar.g();
        float fA = (float) hhfVar.a();
        while (hhfVar.n()) {
            hhfVar.m();
        }
        hhfVar.i();
        return fA;
    }

    static int b(hhf hhfVar) {
        hhfVar.g();
        double dA = hhfVar.a() * 255.0d;
        double dA2 = hhfVar.a() * 255.0d;
        double dA3 = hhfVar.a() * 255.0d;
        while (hhfVar.n()) {
            hhfVar.m();
        }
        int i = (int) dA2;
        int i2 = (int) dA;
        hhfVar.i();
        return Color.argb(255, i2, i, (int) dA3);
    }

    static PointF c(hhf hhfVar, float f) {
        int iP = hhfVar.p() - 1;
        if (iP == 0) {
            hhfVar.g();
            float fA = (float) hhfVar.a();
            float fA2 = (float) hhfVar.a();
            while (hhfVar.p() != 2) {
                hhfVar.m();
            }
            hhfVar.i();
            return new PointF(fA * f, fA2 * f);
        }
        if (iP != 2) {
            if (iP != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(a.ag(hhfVar.p())));
            }
            float fA3 = (float) hhfVar.a();
            float fA4 = (float) hhfVar.a();
            while (hhfVar.n()) {
                hhfVar.m();
            }
            return new PointF(fA3 * f, fA4 * f);
        }
        hhfVar.h();
        float fA5 = 0.0f;
        float fA6 = 0.0f;
        while (hhfVar.n()) {
            int iQ = hhfVar.q(a);
            if (iQ == 0) {
                fA5 = a(hhfVar);
            } else if (iQ != 1) {
                hhfVar.l();
                hhfVar.m();
            } else {
                fA6 = a(hhfVar);
            }
        }
        hhfVar.j();
        return new PointF(fA5 * f, fA6 * f);
    }

    static List d(hhf hhfVar, float f) {
        ArrayList arrayList = new ArrayList();
        hhfVar.g();
        while (hhfVar.p() == 1) {
            hhfVar.g();
            arrayList.add(c(hhfVar, f));
            hhfVar.i();
        }
        hhfVar.i();
        return arrayList;
    }
}
