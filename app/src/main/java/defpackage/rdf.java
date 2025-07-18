package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rdf extends rdh {
    private final Random b;
    private final long c;
    private final rcq d;
    private final ztw e;

    public rdf(ahug ahugVar, Random random, rcq rcqVar, ztw ztwVar) {
        super(ahugVar);
        this.b = random;
        this.c = ahugVar.c;
        this.d = rcqVar;
        this.e = ztwVar;
    }

    @Override // defpackage.rdh
    public final long a(String str) {
        long jSqrt;
        if (yqv.c(str)) {
            jSqrt = this.c;
        } else {
            rcq rcqVar = this.d;
            long epochMilli = this.e.a().toEpochMilli() - rcqVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long jMin = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = rcqVar.a;
                    int i2 = (int) jMin;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = rcqVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                rcqVar.d += j * 14400000;
            }
            int iHashCode = str.hashCode() * rcqVar.c;
            char cCharAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = iHashCode >>> 24;
            int length = (iHashCode >>> 16) + str.length();
            short[] sArr3 = rcqVar.a;
            short[] sArr4 = rcqVar.b;
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

    @Override // defpackage.rdh
    public final ahug b(Long l) {
        if (l != null) {
            ahug ahugVar = this.a;
            if (l.longValue() != ahugVar.c) {
                ahud ahudVar = new ahud();
                int iA = ahuf.a(ahugVar.d);
                if (iA == 0) {
                    iA = 1;
                }
                if ((ahudVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahudVar.y();
                }
                ahug ahugVar2 = (ahug) ahudVar.b;
                ahugVar2.d = iA - 1;
                ahugVar2.b |= 4;
                long jLongValue = l.longValue();
                if ((ahudVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahudVar.y();
                }
                ahug ahugVar3 = (ahug) ahudVar.b;
                ahugVar3.b |= 2;
                ahugVar3.c = jLongValue;
                return (ahug) ahudVar.v();
            }
        }
        return this.a;
    }

    @Override // defpackage.rdh
    public final ahug c(Long l) {
        return d() ? b(l) : e();
    }

    @Override // defpackage.rdh
    public final boolean d() {
        return this.c > 0;
    }
}
