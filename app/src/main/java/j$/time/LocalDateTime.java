package j$.time;

import j$.time.chrono.InterfaceC0048b;
import j$.time.chrono.InterfaceC0051e;
import j$.time.chrono.InterfaceC0056j;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.l, InterfaceC0051e, Serializable {
    public static final LocalDateTime c = Y(h.d, LocalTime.e);
    public static final LocalDateTime d = Y(h.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final h a;
    public final LocalTime b;

    public LocalDateTime(h hVar, LocalTime localTime) {
        this.a = hVar;
        this.b = localTime;
    }

    public static LocalDateTime W(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDateTime) {
            return (LocalDateTime) kVar;
        }
        if (kVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) kVar).toLocalDateTime();
        }
        if (kVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) kVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(h.X(kVar), LocalTime.X(kVar));
        } catch (b e) {
            throw new b(e.a("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()), e);
        }
    }

    public static LocalDateTime Y(h hVar, LocalTime localTime) {
        Objects.a(hVar, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(hVar, localTime);
    }

    public static LocalDateTime Z(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.H(j2);
        return new LocalDateTime(h.i0(j$.desugar.sun.nio.fs.g.A(j + zoneOffset.b, 86400)), LocalTime.a0((((int) j$.desugar.sun.nio.fs.g.I(r5, r7)) * 1000000000) + j2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.chrono.InterfaceC0051e
    public final InterfaceC0056j F(ZoneId zoneId) {
        return ZonedDateTime.W(this, zoneId, null);
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).U() ? this.b.H(nVar) : this.a.H(nVar) : nVar.t(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0051e interfaceC0051e) {
        return interfaceC0051e instanceof LocalDateTime ? V((LocalDateTime) interfaceC0051e) : j$.desugar.sun.nio.fs.g.c(this, interfaceC0051e);
    }

    @Override // j$.time.temporal.k
    public final Object U(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.f ? this.a : j$.desugar.sun.nio.fs.g.n(this, nVar);
    }

    public final int V(LocalDateTime localDateTime) {
        int iV = this.a.V(localDateTime.a);
        return iV == 0 ? this.b.compareTo(localDateTime.b) : iV;
    }

    public final boolean X(InterfaceC0051e interfaceC0051e) {
        if (interfaceC0051e instanceof LocalDateTime) {
            return V((LocalDateTime) interfaceC0051e) < 0;
        }
        long jI = this.a.I();
        long jI2 = interfaceC0051e.toLocalDate().I();
        if (jI >= jI2) {
            return jI == jI2 && this.b.toNanoOfDay() < interfaceC0051e.toLocalTime().toNanoOfDay();
        }
        return true;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.l(this, j);
        }
        int i = i.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        h hVar = this.a;
        switch (i) {
            case 1:
                return c0(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeE0 = e0(hVar.l0(j / 86400000000L), localTime);
                return localDateTimeE0.c0(localDateTimeE0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeE02 = e0(hVar.l0(j / 86400000), localTime);
                return localDateTimeE02.c0(localDateTimeE02.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return b0(j);
            case 5:
                return c0(this.a, 0L, j, 0L, 0L);
            case 6:
                return c0(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeE03 = e0(hVar.l0(j / 256), localTime);
                return localDateTimeE03.c0(localDateTimeE03.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return e0(hVar.b(j, temporalUnit), localTime);
        }
    }

    public final LocalDateTime b0(long j) {
        return c0(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime c0(h hVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeA0 = this.b;
        if (j5 == 0) {
            return e0(hVar, localTimeA0);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long nanoOfDay = localTimeA0.toNanoOfDay();
        long j10 = (j9 * j8) + nanoOfDay;
        long jA = j$.desugar.sun.nio.fs.g.A(j10, 86400000000000L) + (j7 * j8);
        long jI = j$.desugar.sun.nio.fs.g.I(j10, 86400000000000L);
        if (jI != nanoOfDay) {
            localTimeA0 = LocalTime.a0(jI);
        }
        return e0(hVar.l0(jA), localTimeA0);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.isDateBased() || aVar.U();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) nVar.E(this, j);
        }
        boolean zU = ((j$.time.temporal.a) nVar).U();
        LocalTime localTime = this.b;
        h hVar = this.a;
        return zU ? e0(hVar, localTime.a(j, nVar)) : e0(hVar.a(j, nVar), localTime);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(j$.time.temporal.Temporal r11, j$.time.temporal.TemporalUnit r12) {
        /*
            r10 = this;
            j$.time.LocalDateTime r11 = W(r11)
            boolean r0 = r12 instanceof j$.time.temporal.ChronoUnit
            if (r0 == 0) goto Le8
            r0 = r12
            j$.time.temporal.ChronoUnit r0 = (j$.time.temporal.ChronoUnit) r0
            j$.time.temporal.ChronoUnit r1 = j$.time.temporal.ChronoUnit.DAYS
            int r1 = r0.compareTo(r1)
            r2 = 1
            j$.time.LocalTime r4 = r10.b
            j$.time.h r5 = r10.a
            if (r1 >= 0) goto Lad
            j$.time.h r1 = r11.a
            j$.time.LocalTime r11 = r11.b
            r5.getClass()
            long r6 = r1.I()
            long r8 = r5.I()
            long r6 = r6 - r8
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L34
            long r11 = r4.e(r11, r12)
            return r11
        L34:
            long r11 = r11.toNanoOfDay()
            long r4 = r4.toNanoOfDay()
            long r11 = r11 - r4
            r4 = 86400000000000(0x4e94914f0000, double:4.26872718006837E-310)
            if (r1 <= 0) goto L47
            long r6 = r6 - r2
            long r11 = r11 + r4
            goto L49
        L47:
            long r6 = r6 + r2
            long r11 = r11 - r4
        L49:
            int[] r1 = j$.time.i.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto La4;
                case 2: goto L97;
                case 3: goto L8b;
                case 4: goto L7e;
                case 5: goto L70;
                case 6: goto L62;
                case 7: goto L55;
                default: goto L54;
            }
        L54:
            goto La8
        L55:
            r0 = 2
            long r0 = (long) r0
            long r6 = j$.desugar.sun.nio.fs.g.K(r6, r0)
            r0 = 43200000000000(0x274a48a78000, double:2.1343635900342E-310)
            long r11 = r11 / r0
            goto La8
        L62:
            r0 = 24
            long r0 = (long) r0
            long r6 = j$.desugar.sun.nio.fs.g.K(r6, r0)
            r0 = 3600000000000(0x34630b8a000, double:1.7786363250285E-311)
            long r11 = r11 / r0
            goto La8
        L70:
            r0 = 1440(0x5a0, float:2.018E-42)
            long r0 = (long) r0
            long r6 = j$.desugar.sun.nio.fs.g.K(r6, r0)
            r0 = 60000000000(0xdf8475800, double:2.96439387505E-313)
            long r11 = r11 / r0
            goto La8
        L7e:
            r0 = 86400(0x15180, float:1.21072E-40)
            long r0 = (long) r0
            long r6 = j$.desugar.sun.nio.fs.g.K(r6, r0)
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r11 = r11 / r0
            goto La8
        L8b:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = j$.desugar.sun.nio.fs.g.K(r6, r0)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 / r0
            goto La8
        L97:
            r0 = 86400000000(0x141dd76000, double:4.26872718007E-313)
            long r6 = j$.desugar.sun.nio.fs.g.K(r6, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r0
            goto La8
        La4:
            long r6 = j$.desugar.sun.nio.fs.g.K(r6, r4)
        La8:
            long r11 = j$.desugar.sun.nio.fs.g.J(r6, r11)
            return r11
        Lad:
            j$.time.h r0 = r11.a
            j$.time.LocalTime r11 = r11.b
            if (r5 == 0) goto Lba
            int r1 = r0.V(r5)
            if (r1 <= 0) goto Ld3
            goto Lc6
        Lba:
            long r6 = r0.I()
            long r8 = r5.I()
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto Ld3
        Lc6:
            int r1 = r11.compareTo(r4)
            if (r1 >= 0) goto Ld3
            r1 = -1
            j$.time.h r0 = r0.l0(r1)
            goto Le3
        Ld3:
            boolean r1 = r0.c0(r5)
            if (r1 == 0) goto Le3
            int r11 = r11.compareTo(r4)
            if (r11 <= 0) goto Le3
            j$.time.h r0 = r0.l0(r2)
        Le3:
            long r11 = r5.e(r0, r12)
            return r11
        Le8:
            long r11 = r12.i(r10, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.LocalDateTime.e(j$.time.temporal.Temporal, j$.time.temporal.TemporalUnit):long");
    }

    public final LocalDateTime e0(h hVar, LocalTime localTime) {
        return (this.a == hVar && this.b == localTime) ? this : new LocalDateTime(hVar, localTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.InterfaceC0051e
    public final j$.time.chrono.m getChronology() {
        return ((h) toLocalDate()).getChronology();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).U() ? this.b.i(nVar) : this.a.i(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(h hVar) {
        return e0(hVar, this.b);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (!((j$.time.temporal.a) nVar).U()) {
            return this.a.m(nVar);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.o.d(localTime, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(((h) toLocalDate()).I(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().toNanoOfDay(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0051e
    public final InterfaceC0048b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0051e
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
