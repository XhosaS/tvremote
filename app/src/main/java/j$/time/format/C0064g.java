package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import java.util.Locale;

/* renamed from: j$.time.format.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0064g implements InterfaceC0062e {
    @Override // j$.time.format.InterfaceC0062e
    public final boolean i(y yVar, StringBuilder sb) {
        Long lA = yVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.k kVar = yVar.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = kVar.d(aVar) ? Long.valueOf(kVar.H(aVar)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = aVar.d.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jA = 1 + j$.desugar.sun.nio.fs.g.A(j, 315569520000L);
            LocalDateTime localDateTimeZ = LocalDateTime.Z(j$.desugar.sun.nio.fs.g.I(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jA > 0) {
                sb.append('+');
                sb.append(jA);
            }
            sb.append(localDateTimeZ);
            if (localDateTimeZ.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeZ2 = LocalDateTime.Z(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeZ2);
            if (localDateTimeZ2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeZ2.a.a == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iA <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iA / i2;
                sb.append((char) (i3 + 48));
                iA -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.InterfaceC0062e
    public final int l(v vVar, CharSequence charSequence, int i) {
        u uVar = new u();
        uVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        uVar.d('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        uVar.l(aVar, 2);
        uVar.d(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        uVar.l(aVar2, 2);
        uVar.d(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        uVar.l(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i2 = 1;
        uVar.b(aVar4, 0, 9, true);
        uVar.d('Z');
        C0061d c0061d = uVar.q(Locale.getDefault(), E.SMART, null).a;
        if (c0061d.b) {
            c0061d = new C0061d(c0061d.a, false);
        }
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int iL = c0061d.l(vVar2, charSequence, i);
        if (iL < 0) {
            return iL;
        }
        long jLongValue = vVar2.d(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = vVar2.d(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = vVar2.d(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = vVar2.d(aVar).intValue();
        int iIntValue4 = vVar2.d(aVar2).intValue();
        Long lD = vVar2.d(aVar3);
        Long lD2 = vVar2.d(aVar4);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else {
            if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                vVar.c().d = true;
                iIntValue5 = 59;
            }
            i2 = 0;
        }
        int i3 = ((int) jLongValue) % 10000;
        try {
            LocalDateTime localDateTime = LocalDateTime.c;
            j$.time.h hVarH0 = j$.time.h.h0(i3, iIntValue, iIntValue2);
            LocalTime localTimeZ = LocalTime.Z(iIntValue3, iIntValue4, iIntValue5, 0);
            return vVar.f(aVar4, iIntValue6, i, vVar.f(j$.time.temporal.a.INSTANT_SECONDS, j$.desugar.sun.nio.fs.g.q(new LocalDateTime(hVarH0, localTimeZ).e0(hVarH0.l0(i2), localTimeZ), ZoneOffset.UTC) + j$.desugar.sun.nio.fs.g.K(jLongValue / 10000, 315569520000L), i, iL));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
