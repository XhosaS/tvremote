package j$.time;

import j$.time.temporal.TemporalAmount;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.l, j$.time.temporal.n, Comparable<Instant>, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    static {
        ofEpochSecond(-31557014167219200L, 0L);
        ofEpochSecond(31556889864403199L, 999999999L);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant D(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C0003b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant now() {
        C0002a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return D(j$.nio.file.attribute.a.D(j, j2), ((int) j$.nio.file.attribute.a.E(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return D(j$.nio.file.attribute.a.F(j, j$.nio.file.attribute.a.D(j2, 1000000000L)), (int) j$.nio.file.attribute.a.E(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    public final Instant E(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.nio.file.attribute.a.F(j$.nio.file.attribute.a.F(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.l
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (Instant) rVar.i(this, j);
        }
        switch (d.b[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return E(0L, j);
            case 2:
                return E(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return E(j / 1000, (j % 1000) * 1000000);
            case 4:
                return E(j, 0L);
            case 5:
                return E(j$.nio.file.attribute.a.C(j, 60), 0L);
            case 6:
                return E(j$.nio.file.attribute.a.C(j, 3600), 0L);
            case 7:
                return E(j$.nio.file.attribute.a.C(j, 43200), 0L);
            case 8:
                return E(j$.nio.file.attribute.a.C(j, 86400), 0L);
            default:
                throw new j$.time.temporal.s("Unsupported unit: ".concat(String.valueOf(rVar)));
        }
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.t(j);
        int i = d.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return D(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return D(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
                }
                if (j != j2) {
                    return D(j, i2);
                }
            }
        } else if (j != i2) {
            return D(j2, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND : pVar != null && pVar.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.q.d(this, pVar).a(pVar.l(this), pVar);
        }
        int i = d.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(f fVar) {
        return (Instant) j$.nio.file.attribute.a.c(fVar, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.q.c) {
            return j$.time.temporal.b.NANOS;
        }
        if (bVar == j$.time.temporal.q.b || bVar == j$.time.temporal.q.a || bVar == j$.time.temporal.q.e || bVar == j$.time.temporal.q.d || bVar == j$.time.temporal.q.f || bVar == j$.time.temporal.q.g) {
            return null;
        }
        return bVar.a(this);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? E(Long.MAX_VALUE, 0L).E(1L, 0L) : E(-j, 0L);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(this.a, j$.time.temporal.a.INSTANT_SECONDS).c(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.i(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? j$.nio.file.attribute.a.F(j$.nio.file.attribute.a.C(j, 1000), i / 1000000) : j$.nio.file.attribute.a.F(j$.nio.file.attribute.a.C(j + 1, 1000), (i / 1000000) - 1000);
    }

    public final String toString() {
        j$.time.format.a aVar = j$.time.format.a.e;
        StringBuilder sb = new StringBuilder(32);
        try {
            aVar.a.i(new j$.time.format.q(this, aVar), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C0003b(e.getMessage(), e);
        }
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i2 = d.a[((j$.time.temporal.a) pVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
            }
            i = i3 / 1000000;
        }
        return i;
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }
}
