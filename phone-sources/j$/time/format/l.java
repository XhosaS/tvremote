package j$.time.format;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class l implements e {
    public final j$.time.temporal.n a;
    public final t b;
    public final a c;
    public volatile h d;

    public l(j$.time.temporal.n nVar, t tVar, a aVar) {
        this.a = nVar;
        this.b = tVar;
        this.c = aVar;
    }

    @Override // j$.time.format.e
    public final boolean i(o oVar, StringBuilder sb) {
        String strB;
        Long lA = oVar.a(this.a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) oVar.a.J(j$.time.temporal.o.b);
        if (mVar == null || mVar == j$.time.chrono.t.c) {
            a aVar = this.c;
            long jLongValue = lA.longValue();
            t tVar = this.b;
            Locale locale = oVar.b.b;
            strB = aVar.a.b(jLongValue, tVar);
        } else {
            a aVar2 = this.c;
            long jLongValue2 = lA.longValue();
            t tVar2 = this.b;
            Locale locale2 = oVar.b.b;
            strB = aVar2.a.b(jLongValue2, tVar2);
        }
        if (strB != null) {
            sb.append(strB);
            return true;
        }
        if (this.d == null) {
            this.d = new h(this.a, 1, 19, s.NORMAL);
        }
        return this.d.i(oVar, sb);
    }

    public final String toString() {
        t tVar = t.FULL;
        j$.time.temporal.n nVar = this.a;
        t tVar2 = this.b;
        if (tVar2 == tVar) {
            return "Text(" + String.valueOf(nVar) + ")";
        }
        return "Text(" + String.valueOf(nVar) + "," + String.valueOf(tVar2) + ")";
    }
}
