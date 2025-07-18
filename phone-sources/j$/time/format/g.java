package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes4.dex */
public final class g implements e {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // j$.time.format.e
    public final boolean i(o oVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lA = oVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                j$.time.temporal.k kVar = oVar.a;
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                Long lValueOf = kVar.d(aVar) ? Long.valueOf(kVar.C(aVar)) : null;
                int i = 0;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = aVar.d.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
                if (jLongValue >= -62167219200L) {
                    long j = jLongValue - 253402300800L;
                    long jZ = j$.desugar.sun.nio.fs.g.z(j, 315569520000L) + 1;
                    LocalDateTime localDateTimeO = LocalDateTime.O(j$.desugar.sun.nio.fs.g.G(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (jZ > 0) {
                        sb.append('+');
                        sb.append(jZ);
                    }
                    sb.append(localDateTimeO);
                    if (localDateTimeO.b.c == 0) {
                        sb.append(":00");
                    }
                } else {
                    long j2 = jLongValue + 62167219200L;
                    long j3 = j2 / 315569520000L;
                    long j4 = j2 % 315569520000L;
                    LocalDateTime localDateTimeO2 = LocalDateTime.O(j4 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb.length();
                    sb.append(localDateTimeO2);
                    if (localDateTimeO2.b.c == 0) {
                        sb.append(":00");
                    }
                    if (j3 < 0) {
                        if (localDateTimeO2.a.a == -10000) {
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
                        if (iA > 0 || i % 3 != 0 || i < -2) {
                            int i3 = iA / i2;
                            sb.append((char) (i3 + 48));
                            iA -= i3 * i2;
                            i2 /= 10;
                            i++;
                        }
                    }
                }
                sb.append('Z');
                return true;
            default:
                j$.desugar.sun.nio.fs.n nVar = m.f;
                j$.time.temporal.k kVar2 = oVar.a;
                Object objJ = kVar2.J(nVar);
                if (objJ != null || oVar.c != 0) {
                    ZoneId zoneId = (ZoneId) objJ;
                    if (zoneId == null) {
                        return false;
                    }
                    sb.append(zoneId.h());
                    return true;
                }
                throw new j$.time.b("Unable to extract " + String.valueOf(nVar) + " from temporal " + String.valueOf(kVar2));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
