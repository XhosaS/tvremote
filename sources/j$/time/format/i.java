package j$.time.format;

import j$.time.C0003b;
import j$.time.y;

/* loaded from: classes2.dex */
public final class i implements g {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    @Override // j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lA = qVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                j$.time.temporal.m mVar = qVar.a;
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                Long lValueOf = mVar.e(aVar) ? Long.valueOf(mVar.x(aVar)) : null;
                int i = 0;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = aVar.b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
                if (jLongValue >= -62167219200L) {
                    long j = jLongValue - 253402300800L;
                    long jD = j$.nio.file.attribute.a.D(j, 315569520000L) + 1;
                    j$.time.h hVarH = j$.time.h.H(j$.nio.file.attribute.a.E(j, 315569520000L) - 62167219200L, 0, y.e);
                    if (jD > 0) {
                        sb.append('+');
                        sb.append(jD);
                    }
                    sb.append(hVarH);
                    if (hVarH.b.c == 0) {
                        sb.append(":00");
                    }
                } else {
                    long j2 = jLongValue + 62167219200L;
                    long j3 = j2 / 315569520000L;
                    long j4 = j2 % 315569520000L;
                    j$.time.h hVarH2 = j$.time.h.H(j4 - 62167219200L, 0, y.e);
                    int length = sb.length();
                    sb.append(hVarH2);
                    if (hVarH2.b.c == 0) {
                        sb.append(":00");
                    }
                    if (j3 < 0) {
                        if (hVarH2.a.a == -10000) {
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
                b bVar = o.f;
                j$.time.temporal.m mVar2 = qVar.a;
                Object objL = mVar2.l(bVar);
                if (objL != null || qVar.c != 0) {
                    j$.time.w wVar = (j$.time.w) objL;
                    if (wVar == null) {
                        return false;
                    }
                    sb.append(wVar.h());
                    return true;
                }
                throw new C0003b("Unable to extract " + String.valueOf(bVar) + " from temporal " + String.valueOf(mVar2));
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
