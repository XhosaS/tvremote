package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eay {
    public static final eay a = new eau();
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);
    public static final String d = edt.Z(2);

    protected eay() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract eav d(int i, eav eavVar, boolean z);

    public abstract eax e(int i, eax eaxVar, long j);

    public final boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eay)) {
            return false;
        }
        eay eayVar = (eay) obj;
        if (eayVar.c() == c() && eayVar.b() == b()) {
            eax eaxVar = new eax();
            eav eavVar = new eav();
            eax eaxVar2 = new eax();
            eav eavVar2 = new eav();
            for (int i = 0; i < c(); i++) {
                if (!p(i, eaxVar).equals(eayVar.p(i, eaxVar2))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < b(); i2++) {
                if (!d(i2, eavVar, true).equals(eayVar.d(i2, eavVar2, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == eayVar.g(true) && (iH = h(true)) == eayVar.h(true)) {
                while (iG != iH) {
                    int i3 = i(iG, 0, true);
                    if (i3 != eayVar.i(iG, 0, true)) {
                        return false;
                    }
                    iG = i3;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        return q() ? -1 : 0;
    }

    public int h(boolean z) {
        if (q()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        eax eaxVar = new eax();
        eav eavVar = new eav();
        int iC = c() + 217;
        int i2 = 0;
        while (true) {
            i = iC * 31;
            if (i2 >= c()) {
                break;
            }
            iC = i + p(i2, eaxVar).hashCode();
            i2++;
        }
        int iB = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            iB = (iB * 31) + d(i3, eavVar, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = i(iG, 0, true);
        }
        return iB;
    }

    public int i(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == h(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == h(z) ? g(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == g(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == g(z) ? h(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public final int k(int i, eav eavVar, eax eaxVar, int i2, boolean z) {
        int i3 = n(i, eavVar).h;
        if (p(i3, eaxVar).C != i) {
            return i + 1;
        }
        int i4 = i(i3, i2, z);
        if (i4 == -1) {
            return -1;
        }
        return p(i4, eaxVar).B;
    }

    public final Pair l(eax eaxVar, eav eavVar, int i, long j) {
        Pair pairM = m(eaxVar, eavVar, i, j, 0L);
        pairM.getClass();
        return pairM;
    }

    public final Pair m(eax eaxVar, eav eavVar, int i, long j, long j2) {
        eci.c(i, c());
        e(i, eaxVar, j2);
        if (j == -9223372036854775807L) {
            j = eaxVar.z;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = eaxVar.B;
        n(i2, eavVar);
        while (i2 < eaxVar.C && eavVar.j != j) {
            int i3 = i2 + 1;
            if (n(i3, eavVar).j > j) {
                break;
            }
            i2 = i3;
        }
        d(i2, eavVar, true);
        long jMin = j - eavVar.j;
        long j3 = eavVar.i;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = eavVar.g;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public final eav n(int i, eav eavVar) {
        return d(i, eavVar, false);
    }

    public eav o(Object obj, eav eavVar) {
        return d(a(obj), eavVar, true);
    }

    public final eax p(int i, eax eaxVar) {
        return e(i, eaxVar, 0L);
    }

    public final boolean q() {
        return c() == 0;
    }
}
