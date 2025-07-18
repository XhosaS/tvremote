package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class cvo {
    private static final cwk a = cwk.a("x", "y");

    static float a(cwm cwmVar) {
        int iQ = cwmVar.q();
        int i = iQ - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) cwmVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(cwl.a(iQ)));
        }
        cwmVar.h();
        float fA = (float) cwmVar.a();
        while (cwmVar.o()) {
            cwmVar.n();
        }
        cwmVar.j();
        return fA;
    }

    static int b(cwm cwmVar) {
        cwmVar.h();
        double dA = cwmVar.a() * 255.0d;
        double dA2 = cwmVar.a() * 255.0d;
        double dA3 = cwmVar.a() * 255.0d;
        while (cwmVar.o()) {
            cwmVar.n();
        }
        int i = (int) dA2;
        int i2 = (int) dA;
        cwmVar.j();
        return Color.argb(255, i2, i, (int) dA3);
    }

    static PointF c(cwm cwmVar, float f) {
        int iQ = cwmVar.q() - 1;
        if (iQ == 0) {
            cwmVar.h();
            float fA = (float) cwmVar.a();
            float fA2 = (float) cwmVar.a();
            while (cwmVar.q() != 2) {
                cwmVar.n();
            }
            cwmVar.j();
            return new PointF(fA * f, fA2 * f);
        }
        if (iQ != 2) {
            if (iQ != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(cwl.a(cwmVar.q())));
            }
            float fA3 = (float) cwmVar.a();
            float fA4 = (float) cwmVar.a();
            while (cwmVar.o()) {
                cwmVar.n();
            }
            return new PointF(fA3 * f, fA4 * f);
        }
        cwmVar.i();
        float fA5 = 0.0f;
        float fA6 = 0.0f;
        while (cwmVar.o()) {
            int iC = cwmVar.c(a);
            if (iC == 0) {
                fA5 = a(cwmVar);
            } else if (iC != 1) {
                cwmVar.m();
                cwmVar.n();
            } else {
                fA6 = a(cwmVar);
            }
        }
        cwmVar.k();
        return new PointF(fA5 * f, fA6 * f);
    }

    static List d(cwm cwmVar, float f) {
        ArrayList arrayList = new ArrayList();
        cwmVar.h();
        while (cwmVar.q() == 1) {
            cwmVar.h();
            arrayList.add(c(cwmVar, f));
            cwmVar.j();
        }
        cwmVar.j();
        return arrayList;
    }
}
