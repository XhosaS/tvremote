package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class p implements TemporalAmount, Serializable {
    public static final p d = new p(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.g.B(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public p(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static void a(Instant instant) {
        j$.time.chrono.m mVar = (j$.time.chrono.m) instant.J(j$.time.temporal.o.b);
        if (mVar == null || j$.time.chrono.t.c.equals(mVar)) {
            return;
        }
        throw new b("Chronology mismatch, expected: ISO, actual: " + mVar.h());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a == pVar.a && this.b == pVar.b && this.c == pVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal i(Instant instant) {
        a(instant);
        int i = this.a;
        int i2 = this.b;
        if (i2 != 0) {
            long j = (i * 12) + i2;
            if (j != 0) {
                instant = instant.b(j, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? instant.b(i3, ChronoUnit.DAYS) : instant;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal l(Instant instant) {
        a(instant);
        int i = this.a;
        int i2 = this.b;
        Temporal temporalA = instant;
        if (i2 != 0) {
            long j = (i * 12) + i2;
            temporalA = instant;
            if (j != 0) {
                temporalA = instant.A(j, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporalA = instant.A(i, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        if (i3 == 0) {
            return temporalA;
        }
        return ((Instant) temporalA).A(i3, ChronoUnit.DAYS);
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
