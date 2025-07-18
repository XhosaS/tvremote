package defpackage;

import androidx.compose.ui.layout.LayoutElement;
import androidx.compose.ui.layout.LayoutIdElement;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bty {
    public static final Void a(String str) {
        throw new IllegalStateException(str);
    }

    public static final void b(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }

    public static final void d(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final float e(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void f(btv btvVar, bsz bszVar) {
        g(btvVar, bszVar, 0L);
    }

    public static final void g(btv btvVar, bsz bszVar, long j) {
        if (bny.D(bszVar)) {
            btvVar.b();
        }
        if (!bny.F(bszVar)) {
            List listA = bszVar.a();
            int size = listA.size();
            for (int i = 0; i < size; i++) {
                bsl bslVar = (bsl) listA.get(i);
                btvVar.a(bslVar.a, a.D(bslVar.c, j));
            }
            btvVar.a(bszVar.b, a.D(bszVar.k, j));
        }
        if (bny.F(bszVar) && bszVar.b - btvVar.c > 40) {
            btvVar.b();
        }
        btvVar.c = bszVar.b;
    }

    public static /* synthetic */ bmy h(bvc bvcVar, bvc bvcVar2) {
        return bvcVar.p(bvcVar2, true);
    }

    public static final float i(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final bkp j(yka ykaVar) {
        return new LayoutElement(ykaVar);
    }

    public static int k(bve bveVar, buz buzVar, buy buyVar, int i) {
        return bveVar.k(new bvb(buzVar, buzVar.n()), new bvx(buyVar, 2, 2, 0), clw.k(i, 0, 13)).a();
    }

    public static int l(bve bveVar, buz buzVar, buy buyVar, int i) {
        return bveVar.k(new bvb(buzVar, buzVar.n()), new bvx(buyVar, 2, 1, 0), clw.k(0, i, 7)).b();
    }

    public static int m(bve bveVar, buz buzVar, buy buyVar, int i) {
        return bveVar.k(new bvb(buzVar, buzVar.n()), new bvx(buyVar, 1, 2, 0), clw.k(i, 0, 13)).a();
    }

    public static int n(bve bveVar, buz buzVar, buy buyVar, int i) {
        return bveVar.k(new bvb(buzVar, buzVar.n()), new bvx(buyVar, 1, 1, 0), clw.k(0, i, 7)).b();
    }

    public static final Object o(bvs bvsVar) {
        Object objG = bvsVar.g();
        bvd bvdVar = objG instanceof bvd ? (bvd) objG : null;
        if (bvdVar != null) {
            return bvdVar.a;
        }
        return null;
    }

    public static final bkp p(Object obj) {
        return new LayoutIdElement(obj);
    }

    public static final long q(bvc bvcVar) {
        return bvcVar.j(0L);
    }

    public static final long r(bvc bvcVar) {
        return bvcVar.l(0L);
    }

    public static final long s(bvc bvcVar) {
        return bvcVar.k(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final bmy t(bvc bvcVar) {
        bvc bvcVarCt = bvcVar.ct();
        if (bvcVarCt != null) {
            return h(bvcVarCt, bvcVar);
        }
        long j = ((bwj) bvcVar).c;
        return new bmy(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final bmy u(bvc bvcVar) {
        return h(w(bvcVar), bvcVar);
    }

    public static final bmy v(bvc bvcVar) {
        bvc bvcVarW = w(bvcVar);
        long jH = bvcVarW.h() >> 32;
        long jH2 = bvcVarW.h() & 4294967295L;
        bmy bmyVarH = h(bvcVarW, bvcVar);
        float f = bmyVarH.b;
        float f2 = bmyVarH.c;
        float f3 = bmyVarH.d;
        float f4 = bmyVarH.e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f5 = (int) jH;
        if (f > f5) {
            f = f5;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= f5) {
            f5 = f3;
        }
        if (f != f5) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            float f6 = (int) jH2;
            if (f2 > f6) {
                f2 = f6;
            }
            if (f4 > f6) {
                f4 = f6;
            }
            if (f2 != f4) {
                long jL = bvcVarW.l((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                long jL2 = bvcVarW.l((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                long jL3 = bvcVarW.l((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
                long jL4 = bvcVarW.l((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL2 >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jL4 >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jL3 >> 32));
                float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jL & 4294967295L));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jL2 & 4294967295L));
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jL4 & 4294967295L));
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jL3 & 4294967295L));
                return new bmy(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
            }
        }
        return bmy.a;
    }

    public static final bvc w(bvc bvcVar) {
        bvc bvcVar2;
        bzq bzqVar;
        bvc bvcVarCt = bvcVar.ct();
        while (true) {
            bvc bvcVar3 = bvcVarCt;
            bvcVar2 = bvcVar;
            bvcVar = bvcVar3;
            if (bvcVar == null) {
                break;
            }
            bvcVarCt = bvcVar.ct();
        }
        bzq bzqVar2 = bvcVar2 instanceof bzq ? (bzq) bvcVar2 : null;
        if (bzqVar2 == null) {
            return bvcVar2;
        }
        do {
            bzqVar = bzqVar2;
            bzqVar2 = bzqVar2.w;
        } while (bzqVar2 != null);
        return bzqVar;
    }
}
