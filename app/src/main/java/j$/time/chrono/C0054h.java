package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0054h implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final m a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.desugar.sun.nio.fs.g.C(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C0054h(m mVar, int i, int i2, int i3) {
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final long a() {
        j$.time.temporal.q qVarW = this.a.w(j$.time.temporal.a.MONTH_OF_YEAR);
        long j = qVarW.a;
        long j2 = qVarW.d;
        if (j == qVarW.b && qVarW.c == j2 && qVarW.d()) {
            return (j2 - qVarW.a) + 1;
        }
        return -1L;
    }

    public final void b(j$.time.temporal.k kVar) {
        m mVar = (m) kVar.U(j$.time.temporal.o.b);
        if (mVar != null) {
            m mVar2 = this.a;
            if (!mVar2.equals(mVar)) {
                throw new j$.time.b(j$.time.e.a("Chronology mismatch, expected: ", mVar2.getId(), ", actual: ", mVar.getId()));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0054h) {
            C0054h c0054h = (C0054h) obj;
            if (this.b == c0054h.b && this.c == c0054h.c && this.d == c0054h.d && this.a.equals(c0054h.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal i(Temporal temporal) {
        b(temporal);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                temporal = temporal.b((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal = temporal.b(i, ChronoUnit.YEARS);
                }
                temporal = temporal.b(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporal = temporal.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal l(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        Temporal temporalX = instant;
        if (i2 != 0) {
            long jA = a();
            Temporal temporalX2 = instant;
            if (jA > 0) {
                temporalX = instant.x((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporalX2 = instant.x(i, ChronoUnit.YEARS);
                }
                temporalX = ((Instant) temporalX2).x(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporalX = instant.x(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporalX.x(i3, ChronoUnit.DAYS) : temporalX;
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
