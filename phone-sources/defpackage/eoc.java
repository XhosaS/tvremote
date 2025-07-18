package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoc extends eoa {
    final long e;
    final cvi f;
    final cvi g;

    public eoc(enw enwVar, long j, long j2, long j3, long j4, long j5, List list, long j6, cvi cviVar, cvi cviVar2, long j7, long j8) {
        super(enwVar, j, j2, j3, j5, list, j6, j7, j8);
        this.f = cviVar;
        this.g = cviVar2;
        this.e = j4;
    }

    @Override // defpackage.eoa
    public final long c(long j) {
        if (this.c != null) {
            return r0.size();
        }
        long j2 = this.e;
        if (j2 != -1) {
            return (j2 - this.a) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.i));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.b).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = udk.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.eoa
    public final enw g(enz enzVar, long j) {
        List list = this.c;
        long j2 = list != null ? ((eod) list.get((int) (j - this.a))).a : (j - this.a) * this.b;
        cvi cviVar = this.g;
        dze dzeVar = enzVar.e;
        return new enw(cviVar.q(dzeVar.K, j, dzeVar.T, j2), 0L, -1L);
    }

    @Override // defpackage.eof
    public final enw i(enz enzVar) {
        cvi cviVar = this.f;
        if (cviVar == null) {
            return this.h;
        }
        dze dzeVar = enzVar.e;
        return new enw(cviVar.q(dzeVar.K, 0L, dzeVar.T, 0L), 0L, -1L);
    }
}
