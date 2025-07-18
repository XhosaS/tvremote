package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q implements InterfaceC0062e {
    public final j$.time.temporal.n a;
    public final G b;
    public final B c;
    public volatile i d;

    public q(j$.time.temporal.n nVar, G g, B b) {
        this.a = nVar;
        this.b = g;
        this.c = b;
    }

    @Override // j$.time.format.InterfaceC0062e
    public final boolean i(y yVar, StringBuilder sb) {
        Long lA = yVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = yVar.b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) yVar.a.U(j$.time.temporal.o.b);
        String strC = (mVar == null || mVar == j$.time.chrono.t.c) ? this.c.c(this.a, lA.longValue(), this.b, dateTimeFormatter.b) : this.c.b(mVar, this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, F.NORMAL);
        }
        return this.d.i(yVar, sb);
    }

    @Override // j$.time.format.InterfaceC0062e
    public final int l(v vVar, CharSequence charSequence, int i) {
        B b = this.c;
        j$.time.temporal.n nVar = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        G g = z ? this.b : null;
        j$.time.chrono.m mVar = vVar.c().c;
        if (mVar == null && (mVar = vVar.a.e) == null) {
            mVar = j$.time.chrono.t.c;
        }
        j$.time.chrono.m mVar2 = mVar;
        Iterator itE = (mVar2 == null || mVar2 == j$.time.chrono.t.c) ? b.e(nVar, g, dateTimeFormatter.b) : b.d(mVar2, nVar, g, dateTimeFormatter.b);
        if (itE != null) {
            while (itE.hasNext()) {
                Map.Entry entry = (Map.Entry) itE.next();
                String str = (String) entry.getKey();
                if (vVar.g(str, 0, charSequence, i, str.length())) {
                    return vVar.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (nVar == j$.time.temporal.a.ERA && !vVar.c) {
                Iterator it = mVar2.y().iterator();
                while (it.hasNext()) {
                    String string = ((j$.time.chrono.n) it.next()).toString();
                    if (vVar.g(string, 0, charSequence, i, string.length())) {
                        return vVar.f(this.a, r7.getValue(), i, string.length() + i);
                    }
                }
            }
            if (vVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, F.NORMAL);
        }
        return this.d.l(vVar, charSequence, i);
    }

    public final String toString() {
        G g = G.FULL;
        j$.time.temporal.n nVar = this.a;
        G g2 = this.b;
        if (g2 == g) {
            return "Text(" + String.valueOf(nVar) + ")";
        }
        return "Text(" + String.valueOf(nVar) + "," + String.valueOf(g2) + ")";
    }
}
