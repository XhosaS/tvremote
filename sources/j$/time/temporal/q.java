package j$.time.temporal;

import j$.time.C0003b;
import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract class q {
    public static final j$.time.format.b a = new j$.time.format.b(1);
    public static final j$.time.format.b b = new j$.time.format.b(2);
    public static final j$.time.format.b c = new j$.time.format.b(3);
    public static final j$.time.format.b d = new j$.time.format.b(4);
    public static final j$.time.format.b e = new j$.time.format.b(5);
    public static final j$.time.format.b f = new j$.time.format.b(6);
    public static final j$.time.format.b g = new j$.time.format.b(7);

    public static int a(m mVar, p pVar) {
        t tVarK = mVar.k(pVar);
        if (!tVarK.d()) {
            throw new s("Invalid field " + String.valueOf(pVar) + " for get() method, use getLong() instead");
        }
        long jX = mVar.x(pVar);
        if (tVarK.e(jX)) {
            return (int) jX;
        }
        throw new C0003b("Invalid value for " + String.valueOf(pVar) + " (valid values " + String.valueOf(tVarK) + "): " + jX);
    }

    public static l b(l lVar, long j, r rVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            lVar = lVar.d(Long.MAX_VALUE, rVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return lVar.d(j2, rVar);
    }

    public static Object c(m mVar, j$.time.format.b bVar) {
        if (bVar == a || bVar == b || bVar == c) {
            return null;
        }
        return bVar.a(mVar);
    }

    public static t d(m mVar, p pVar) {
        if (!(pVar instanceof a)) {
            Objects.a(pVar, "field");
            return pVar.j(mVar);
        }
        if (mVar.e(pVar)) {
            return ((a) pVar).b;
        }
        throw new s("Unsupported field: ".concat(String.valueOf(pVar)));
    }
}
