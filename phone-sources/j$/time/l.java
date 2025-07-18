package j$.time;

import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class l implements j$.time.temporal.k, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        j$.time.format.m mVar = new j$.time.format.m();
        mVar.d("--");
        mVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        mVar.c('-');
        mVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        mVar.l(Locale.getDefault(), j$.time.format.r.SMART, null);
    }

    public l(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 13, this);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.m(this);
        }
        int i2 = k.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.b ? j$.time.chrono.t.c : j$.time.temporal.o.c(this, nVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        int i = this.a - lVar.a;
        return i == 0 ? this.b - lVar.b : i;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.MONTH_OF_YEAR || nVar == j$.time.temporal.a.DAY_OF_MONTH : nVar != null && nVar.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a == lVar.a && this.b == lVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return m(nVar).a(C(nVar), nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return nVar.range();
        }
        if (nVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.o.d(this, nVar);
        }
        int iOrdinal = j.N(this.a).ordinal();
        return j$.time.temporal.q.g(iOrdinal != 1 ? (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31 : 28, j.N(r5).M());
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        if (!j$.desugar.sun.nio.fs.g.w(temporal).equals(j$.time.chrono.t.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        Temporal temporalA = temporal.a(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalA.a(Math.min(temporalA.m(aVar).d, this.b), aVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
