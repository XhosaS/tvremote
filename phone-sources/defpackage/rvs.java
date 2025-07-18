package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rvs extends rvu {
    private final Random b;
    private final long c;
    private final rvd d;
    private final uep e;

    public rvs(zah zahVar, Random random, rvd rvdVar, uep uepVar) {
        super(zahVar);
        this.b = random;
        this.c = zahVar.c;
        this.d = rvdVar;
        this.e = uepVar;
    }

    @Override // defpackage.rvu
    public final long a(String str) {
        long jSqrt;
        if (sij.F(str)) {
            jSqrt = this.c;
        } else {
            rvd rvdVar = this.d;
            long epochMilli = this.e.a().toEpochMilli() - rvdVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long jMin = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = rvdVar.a;
                    int i2 = (int) jMin;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = rvdVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                rvdVar.d += j * 14400000;
            }
            int iHashCode = str.hashCode() * rvdVar.c;
            char cCharAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = iHashCode >>> 24;
            int length = (iHashCode >>> 16) + str.length();
            short[] sArr3 = rvdVar.a;
            short[] sArr4 = rvdVar.b;
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

    @Override // defpackage.rvu
    public final zah b(Long l) {
        if (l != null) {
            zah zahVar = this.a;
            if (l.longValue() != zahVar.c) {
                vtw vtwVarM = zah.a.m();
                int iAV = a.aV(zahVar.d);
                if (iAV == 0) {
                    iAV = 1;
                }
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                zah zahVar2 = (zah) vtwVarM.b;
                zahVar2.d = iAV - 1;
                zahVar2.b |= 4;
                long jLongValue = l.longValue();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                zah zahVar3 = (zah) vtwVarM.b;
                zahVar3.b |= 2;
                zahVar3.c = jLongValue;
                return (zah) vtwVarM.r();
            }
        }
        return this.a;
    }

    @Override // defpackage.rvu
    public final zah c(Long l) {
        return d() ? b(l) : e();
    }

    @Override // defpackage.rvu
    public final boolean d() {
        return this.c > 0;
    }
}
