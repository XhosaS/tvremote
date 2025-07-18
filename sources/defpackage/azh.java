package defpackage;

import android.os.SystemClock;
import j$.time.Instant;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azh extends azj {
    private final Random b;
    private final long c;
    private final ayu d;

    public azh(cxs cxsVar, Random random, ayu ayuVar) {
        super(cxsVar);
        this.b = random;
        this.c = cxsVar.c;
        this.d = ayuVar;
    }

    @Override // defpackage.azj
    public final long a(String str) {
        long jSqrt;
        if (bdq.q(str)) {
            jSqrt = this.c;
        } else {
            ayu ayuVar = this.d;
            long epochMilli = Instant.ofEpochMilli(SystemClock.elapsedRealtime()).toEpochMilli() - ayuVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long jMin = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = ayuVar.a;
                    int i2 = (int) jMin;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = ayuVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                ayuVar.d += j * 14400000;
            }
            int iHashCode = str.hashCode() * ayuVar.c;
            char cCharAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = iHashCode >>> 24;
            int length = (iHashCode >>> 16) + str.length();
            short[] sArr3 = ayuVar.a;
            short[] sArr4 = ayuVar.b;
            int i4 = (i3 + cCharAt) & 255;
            int i5 = length & 255;
            int iMin = Math.min((int) sArr3[i4], (int) sArr4[i5]);
            int i6 = iMin + 1;
            short sMin = (short) Math.min(32767, i6);
            if (sArr3[i4] == iMin) {
                sArr3[i4] = sMin;
            }
            if (sArr4[i5] == iMin) {
                sArr4[i5] = sMin;
            }
            jSqrt = (int) (this.c / (i6 < 50 ? Math.sqrt(i6) : i6));
        }
        if (this.b.nextDouble() * 1000.0d < jSqrt) {
            return jSqrt;
        }
        return -1L;
    }

    @Override // defpackage.azj
    public final cxs b(Long l) {
        if (l != null) {
            cxs cxsVar = this.a;
            l.longValue();
            if (cxsVar.c != 1000) {
                clo cloVarO = cxs.a.o();
                int iAp = dnx.ap(cxsVar.d);
                if (iAp == 0) {
                    iAp = 1;
                }
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cxs cxsVar2 = (cxs) cloVarO.b;
                cxsVar2.d = iAp - 1;
                cxsVar2.b |= 4;
                l.longValue();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cxs cxsVar3 = (cxs) cloVarO.b;
                cxsVar3.b |= 2;
                cxsVar3.c = 1000L;
                return (cxs) cloVarO.i();
            }
        }
        return this.a;
    }

    @Override // defpackage.azj
    public final cxs c(Long l) {
        return d() ? b(l) : e();
    }

    @Override // defpackage.azj
    public final boolean d() {
        return this.c > 0;
    }
}
