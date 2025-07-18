package j$.time.format;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class n implements g {
    public final j$.time.temporal.p a;
    public final w b;
    public final c c;
    public volatile j d;

    public n(j$.time.temporal.p pVar, w wVar, c cVar) {
        this.a = pVar;
        this.b = wVar;
        this.c = cVar;
    }

    @Override // j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb) {
        String strK;
        Long lA = qVar.a(this.a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) qVar.a.l(j$.time.temporal.q.b);
        if (mVar == null || mVar == j$.time.chrono.t.c) {
            c cVar = this.c;
            long jLongValue = lA.longValue();
            w wVar = this.b;
            Locale locale = qVar.b.b;
            strK = cVar.a.k(jLongValue, wVar);
        } else {
            c cVar2 = this.c;
            long jLongValue2 = lA.longValue();
            w wVar2 = this.b;
            Locale locale2 = qVar.b.b;
            strK = cVar2.a.k(jLongValue2, wVar2);
        }
        if (strK != null) {
            sb.append(strK);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, v.NORMAL);
        }
        return this.d.i(qVar, sb);
    }

    public final String toString() {
        w wVar = w.FULL;
        j$.time.temporal.p pVar = this.a;
        w wVar2 = this.b;
        if (wVar2 == wVar) {
            return "Text(" + String.valueOf(pVar) + ")";
        }
        return "Text(" + String.valueOf(pVar) + "," + String.valueOf(wVar2) + ")";
    }
}
