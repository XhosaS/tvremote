package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fig implements fef {
    final /* synthetic */ fih a;

    public fig(fih fihVar) {
        this.a = fihVar;
    }

    @Override // defpackage.fef
    public final long a() {
        fih fihVar = this.a;
        return fihVar.c.e(fihVar.d);
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        fih fihVar = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(fihVar.c.f(j));
        long j2 = fihVar.b;
        feg fegVar = new feg(j, edt.t((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - r6)).divide(BigInteger.valueOf(fihVar.d)).longValue() + r6) - 30000, fihVar.a, j2 - 1));
        return new fed(fegVar, fegVar);
    }

    @Override // defpackage.fef
    public final boolean z() {
        return true;
    }
}
