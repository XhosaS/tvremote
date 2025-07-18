package j$.nio.file.attribute;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class G implements Comparable {
    public final long a;
    public Instant b;
    public String c;

    public G(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = j;
        this.b = null;
    }

    public static void i(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public static long m(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.Instant E() {
        /*
            r13 = this;
            j$.time.Instant r0 = r13.b
            if (r0 != 0) goto L97
            int[] r0 = j$.nio.file.attribute.F.a
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r1 = r1.ordinal()
            r0 = r0[r1]
            long r1 = r13.a
            r3 = 0
            switch(r0) {
                case 1: goto L66;
                case 2: goto L58;
                case 3: goto L4a;
                case 4: goto L74;
                case 5: goto L39;
                case 6: goto L2a;
                case 7: goto L1c;
                default: goto L14;
            }
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unit not handled"
            r0.<init>(r1)
            throw r0
        L1c:
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r5 = j$.desugar.sun.nio.fs.g.A(r1, r3)
            long r0 = j$.desugar.sun.nio.fs.g.I(r1, r3)
            int r3 = (int) r0
        L28:
            r1 = r5
            goto L74
        L2a:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = j$.desugar.sun.nio.fs.g.A(r1, r3)
            long r0 = j$.desugar.sun.nio.fs.g.I(r1, r3)
            int r1 = (int) r0
            int r3 = r1 * 1000
            goto L28
        L39:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = j$.desugar.sun.nio.fs.g.A(r1, r3)
            long r0 = j$.desugar.sun.nio.fs.g.I(r1, r3)
            int r1 = (int) r0
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r1 * r0
            goto L28
        L4a:
            r9 = 60
            r11 = 153722867280912930(0x222222222222222, double:2.166167076120538E-298)
            long r7 = r13.a
            long r1 = m(r7, r9, r11)
            goto L74
        L58:
            r6 = 3600(0xe10, double:1.7786E-320)
            r8 = 2562047788015215(0x91a2b3c4d5e6f, double:1.2658197950618743E-308)
            long r4 = r13.a
            long r1 = m(r4, r6, r8)
            goto L74
        L66:
            r6 = 86400(0x15180, double:4.26873E-319)
            r8 = 106751991167300(0x611722833944, double:5.2742491460911E-310)
            long r4 = r13.a
            long r1 = m(r4, r6, r8)
        L74:
            r4 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L82
            j$.time.Instant r0 = j$.time.Instant.MIN
            r13.b = r0
            goto L97
        L82:
            r4 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L90
            j$.time.Instant r0 = j$.time.Instant.MAX
            r13.b = r0
            goto L97
        L90:
            long r3 = (long) r3
            j$.time.Instant r0 = j$.time.Instant.ofEpochSecond(r1, r3)
            r13.b = r0
        L97:
            j$.time.Instant r0 = r13.b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.G.E():j$.time.Instant");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && compareTo((G) obj) == 0;
    }

    public final int hashCode() {
        return E().hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int compareTo(G g) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = this.a;
        if (timeUnit != null) {
            g.getClass();
            return Long.compare(j, g.a);
        }
        long epochSecond = E().getEpochSecond();
        int iCompare = Long.compare(epochSecond, g.E().getEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(E().getNano(), g.E().getNano());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        long days = timeUnit != null ? timeUnit.toDays(j) : TimeUnit.SECONDS.toDays(E().getEpochSecond());
        long days2 = timeUnit != null ? timeUnit.toDays(g.a) : TimeUnit.SECONDS.toDays(g.E().getEpochSecond());
        return days == days2 ? Long.compare(t(days), g.t(days2)) : Long.compare(days, days2);
    }

    public final long t(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit == null) {
            return TimeUnit.SECONDS.toNanos(E().getEpochSecond() - TimeUnit.DAYS.toSeconds(j));
        }
        return timeUnit.toNanos(this.a - timeUnit.convert(j, TimeUnit.DAYS));
    }

    public final String toString() {
        long epochSecond;
        int nano;
        long jA;
        LocalDateTime localDateTimeZ;
        int i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (this.c == null) {
            if (this.b != null || timeUnit.compareTo(TimeUnit.SECONDS) < 0) {
                epochSecond = E().getEpochSecond();
                nano = E().getNano();
            } else {
                epochSecond = timeUnit.toSeconds(this.a);
                nano = 0;
            }
            if (epochSecond >= -62167219200L) {
                long j = epochSecond - 253402300800L;
                jA = j$.desugar.sun.nio.fs.g.A(j, 315569520000L) + 1;
                localDateTimeZ = LocalDateTime.Z(j$.desugar.sun.nio.fs.g.I(j, 315569520000L) - 62167219200L, nano, ZoneOffset.UTC);
                i = localDateTimeZ.a.a;
            } else {
                long j2 = epochSecond + 62167219200L;
                jA = j2 / 315569520000L;
                localDateTimeZ = LocalDateTime.Z((j2 % 315569520000L) - 62167219200L, nano, ZoneOffset.UTC);
                i = localDateTimeZ.a.a;
            }
            int i2 = (((int) jA) * 10000) + i;
            j$.time.h hVar = localDateTimeZ.a;
            LocalTime localTime = localDateTimeZ.b;
            if (i2 <= 0) {
                i2--;
            }
            int i3 = localTime.d;
            StringBuilder sb = new StringBuilder(64);
            sb.append(i2 < 0 ? "-" : "");
            int iAbs = Math.abs(i2);
            if (iAbs < 10000) {
                i(sb, 1000, Math.abs(iAbs));
            } else {
                sb.append(String.valueOf(iAbs));
            }
            sb.append('-');
            i(sb, 10, hVar.b);
            sb.append('-');
            i(sb, 10, hVar.c);
            sb.append('T');
            i(sb, 10, localTime.a);
            sb.append(':');
            i(sb, 10, localTime.b);
            sb.append(':');
            i(sb, 10, localTime.c);
            if (i3 != 0) {
                sb.append('.');
                int i4 = 100000000;
                while (i3 % 10 == 0) {
                    i3 /= 10;
                    i4 /= 10;
                }
                i(sb, i4, i3);
            }
            sb.append('Z');
            this.c = sb.toString();
        }
        return this.c;
    }
}
