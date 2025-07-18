package j$.time;

import j$.time.chrono.InterfaceC0083b;
import j$.time.chrono.InterfaceC0086e;
import j$.time.chrono.InterfaceC0091j;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.l, InterfaceC0086e, Serializable {
    public static final LocalDateTime c = N(LocalDate.d, i.e);
    public static final LocalDateTime d = N(LocalDate.e, i.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final i b;

    public LocalDateTime(LocalDate localDate, i iVar) {
        this.a = localDate;
        this.b = iVar;
    }

    public static LocalDateTime L(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDateTime) {
            return (LocalDateTime) kVar;
        }
        if (kVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) kVar).a;
        }
        if (kVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) kVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.M(kVar), i.M(kVar));
        } catch (b e) {
            throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + String.valueOf(kVar) + " of type " + kVar.getClass().getName(), e);
        }
    }

    public static LocalDateTime N(LocalDate localDate, i iVar) {
        Objects.a(localDate, "date");
        Objects.a(iVar, "time");
        return new LocalDateTime(localDate, iVar);
    }

    public static LocalDateTime O(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.A(j2);
        return new LocalDateTime(LocalDate.V(j$.desugar.sun.nio.fs.g.z(j + zoneOffset.a, 86400)), i.O((((int) j$.desugar.sun.nio.fs.g.G(r5, r7)) * 1000000000) + j2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).C() ? this.b.C(nVar) : this.a.C(nVar) : nVar.m(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0086e interfaceC0086e) {
        return interfaceC0086e instanceof LocalDateTime ? K((LocalDateTime) interfaceC0086e) : j$.desugar.sun.nio.fs.g.c(this, interfaceC0086e);
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.f ? this.a : j$.desugar.sun.nio.fs.g.n(this, nVar);
    }

    public final int K(LocalDateTime localDateTime) {
        int iK = this.a.K(localDateTime.a);
        return iK == 0 ? this.b.compareTo(localDateTime.b) : iK;
    }

    public final boolean M(InterfaceC0086e interfaceC0086e) {
        if (interfaceC0086e instanceof LocalDateTime) {
            return K((LocalDateTime) interfaceC0086e) < 0;
        }
        long jD = this.a.D();
        long jD2 = interfaceC0086e.toLocalDate().D();
        if (jD >= jD2) {
            return jD == jD2 && this.b.V() < interfaceC0086e.toLocalTime().V();
        }
        return true;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.l(this, j);
        }
        int i = g.a[((ChronoUnit) temporalUnit).ordinal()];
        i iVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 1:
                return R(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeT = T(localDate.X(j / 86400000000L), iVar);
                return localDateTimeT.R(localDateTimeT.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeT2 = T(localDate.X(j / 86400000), iVar);
                return localDateTimeT2.R(localDateTimeT2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return Q(j);
            case 5:
                return R(this.a, 0L, j, 0L, 0L);
            case 6:
                return R(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeT3 = T(localDate.X(j / 256), iVar);
                return localDateTimeT3.R(localDateTimeT3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return T(localDate.b(j, temporalUnit), iVar);
        }
    }

    public final LocalDateTime Q(long j) {
        return R(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime R(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        i iVarO = this.b;
        if (j5 == 0) {
            return T(localDate, iVarO);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jV = iVarO.V();
        long j10 = (j9 * j8) + jV;
        long jZ = j$.desugar.sun.nio.fs.g.z(j10, 86400000000000L) + (j7 * j8);
        long jG = j$.desugar.sun.nio.fs.g.G(j10, 86400000000000L);
        if (jG != jV) {
            iVarO = i.O(jG);
        }
        return T(localDate.X(jZ), iVarO);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) nVar.t(this, j);
        }
        boolean zC = ((j$.time.temporal.a) nVar).C();
        i iVar = this.b;
        LocalDate localDate = this.a;
        return zC ? T(localDate, iVar.a(j, nVar)) : T(localDate.a(j, nVar), iVar);
    }

    public final LocalDateTime T(LocalDate localDate, i iVar) {
        return (this.a == localDate && this.b == iVar) ? this : new LocalDateTime(localDate, iVar);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.isDateBased() || aVar.C();
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
            j$.time.LocalDateTime r11 = L(r11)
            boolean r0 = r12 instanceof j$.time.temporal.ChronoUnit
            if (r0 == 0) goto Le8
            r0 = r12
            j$.time.temporal.ChronoUnit r0 = (j$.time.temporal.ChronoUnit) r0
            j$.time.temporal.ChronoUnit r1 = j$.time.temporal.ChronoUnit.DAYS
            int r1 = r0.compareTo(r1)
            r2 = 1
            j$.time.i r4 = r10.b
            j$.time.LocalDate r5 = r10.a
            if (r1 >= 0) goto Lad
            j$.time.LocalDate r1 = r11.a
            j$.time.i r11 = r11.b
            r5.getClass()
            long r6 = r1.D()
            long r8 = r5.D()
            long r6 = r6 - r8
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L34
            long r11 = r4.e(r11, r12)
            return r11
        L34:
            long r11 = r11.V()
            long r4 = r4.V()
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
            int[] r1 = j$.time.g.a
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
            long r6 = j$.desugar.sun.nio.fs.g.I(r6, r0)
            r0 = 43200000000000(0x274a48a78000, double:2.1343635900342E-310)
            long r11 = r11 / r0
            goto La8
        L62:
            r0 = 24
            long r0 = (long) r0
            long r6 = j$.desugar.sun.nio.fs.g.I(r6, r0)
            r0 = 3600000000000(0x34630b8a000, double:1.7786363250285E-311)
            long r11 = r11 / r0
            goto La8
        L70:
            r0 = 1440(0x5a0, float:2.018E-42)
            long r0 = (long) r0
            long r6 = j$.desugar.sun.nio.fs.g.I(r6, r0)
            r0 = 60000000000(0xdf8475800, double:2.96439387505E-313)
            long r11 = r11 / r0
            goto La8
        L7e:
            r0 = 86400(0x15180, float:1.21072E-40)
            long r0 = (long) r0
            long r6 = j$.desugar.sun.nio.fs.g.I(r6, r0)
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r11 = r11 / r0
            goto La8
        L8b:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = j$.desugar.sun.nio.fs.g.I(r6, r0)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 / r0
            goto La8
        L97:
            r0 = 86400000000(0x141dd76000, double:4.26872718007E-313)
            long r6 = j$.desugar.sun.nio.fs.g.I(r6, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r0
            goto La8
        La4:
            long r6 = j$.desugar.sun.nio.fs.g.I(r6, r4)
        La8:
            long r11 = j$.desugar.sun.nio.fs.g.H(r6, r11)
            return r11
        Lad:
            j$.time.LocalDate r0 = r11.a
            j$.time.i r11 = r11.b
            if (r5 == 0) goto Lba
            int r1 = r0.K(r5)
            if (r1 <= 0) goto Ld3
            goto Lc6
        Lba:
            long r6 = r0.D()
            long r8 = r5.D()
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto Ld3
        Lc6:
            int r1 = r11.compareTo(r4)
            if (r1 >= 0) goto Ld3
            r1 = -1
            j$.time.LocalDate r0 = r0.X(r1)
            goto Le3
        Ld3:
            boolean r1 = r0.R(r5)
            if (r1 == 0) goto Le3
            int r11 = r11.compareTo(r4)
            if (r11 <= 0) goto Le3
            j$.time.LocalDate r0 = r0.X(r2)
        Le3:
            long r11 = r5.e(r0, r12)
            return r11
        Le8:
            long r11 = r12.i(r10, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.LocalDateTime.e(j$.time.temporal.Temporal, j$.time.temporal.TemporalUnit):long");
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

    @Override // j$.time.chrono.InterfaceC0086e
    public final j$.time.chrono.m getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).C() ? this.b.i(nVar) : this.a.i(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return T(localDate, this.b);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (!((j$.time.temporal.a) nVar).C()) {
            return this.a.m(nVar);
        }
        i iVar = this.b;
        iVar.getClass();
        return j$.time.temporal.o.d(iVar, nVar);
    }

    @Override // j$.time.chrono.InterfaceC0086e
    public final InterfaceC0091j n(ZoneOffset zoneOffset) {
        return ZonedDateTime.L(this, zoneOffset, null);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(((LocalDate) toLocalDate()).D(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().V(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0086e
    public final InterfaceC0083b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0086e
    public final i toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
