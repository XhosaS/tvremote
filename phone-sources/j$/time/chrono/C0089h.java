package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0089h implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final m a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.desugar.sun.nio.fs.g.B(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C0089h(m mVar, int i, int i2, int i3) {
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final long a() {
        j$.time.temporal.q qVarV = this.a.v(j$.time.temporal.a.MONTH_OF_YEAR);
        long j = qVarV.a;
        long j2 = qVarV.d;
        if (j == qVarV.b && qVarV.c == j2 && qVarV.d()) {
            return (j2 - qVarV.a) + 1;
        }
        return -1L;
    }

    public final void b(Instant instant) {
        m mVar = (m) instant.J(j$.time.temporal.o.b);
        if (mVar != null) {
            m mVar2 = this.a;
            if (mVar2.equals(mVar)) {
                return;
            }
            throw new j$.time.b("Chronology mismatch, expected: " + mVar2.h() + ", actual: " + mVar.h());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0089h) {
            C0089h c0089h = (C0089h) obj;
            if (this.b == c0089h.b && this.c == c0089h.c && this.d == c0089h.d && this.a.equals(c0089h.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal i(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                instant = instant.b((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instant = instant.b(i, ChronoUnit.YEARS);
                }
                instant = instant.b(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? instant.b(i3, ChronoUnit.DAYS) : instant;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal l(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        Temporal temporalA = instant;
        if (i2 != 0) {
            long jA = a();
            Temporal temporalA2 = instant;
            if (jA > 0) {
                temporalA = instant.A((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporalA2 = instant.A(i, ChronoUnit.YEARS);
                }
                temporalA = ((Instant) temporalA2).A(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporalA = instant.A(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporalA.A(i3, ChronoUnit.DAYS) : temporalA;
    }

    public final String toString() {
        m mVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return mVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new F((byte) 9, this);
    }
}
