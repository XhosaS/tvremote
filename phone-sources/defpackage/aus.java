package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aus implements bsb {
    final /* synthetic */ auv a;
    final /* synthetic */ yjv b;
    final /* synthetic */ uv c;

    public aus(auv auvVar, yjv yjvVar, uv uvVar) {
        this.a = auvVar;
        this.b = yjvVar;
        this.c = uvVar;
    }

    private final float e(long j) {
        return Float.intBitsToFloat((int) (this.c == uv.b ? j >> 32 : j & 4294967295L));
    }

    private final float f(long j) {
        return this.c == uv.b ? cmm.a(j) : cmm.b(j);
    }

    private final long g(float f) {
        uv uvVar = this.c;
        float f2 = uvVar == uv.b ? f : 0.0f;
        uv uvVar2 = uv.a;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        if (uvVar != uvVar2) {
            f = 0.0f;
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    @Override // defpackage.bsb
    public final long a(long j, long j2, int i) {
        if (a.r(i, 1)) {
            return g(this.a.b.a(e(j2)));
        }
        return 0L;
    }

    @Override // defpackage.bsb
    public final long b(long j, int i) {
        float fE = e(j);
        if (fE >= 0.0f || !a.r(i, 1)) {
            return 0L;
        }
        return g(this.a.b.a(fE));
    }

    @Override // defpackage.bsb
    public final Object c(long j, long j2, yih yihVar) {
        this.b.a(new Float(f(j2)));
        return new cmm(j2);
    }

    @Override // defpackage.bsb
    public final Object d(long j, yih yihVar) {
        float f = f(j);
        ayd aydVar = this.a.b;
        float fD = aydVar.d();
        float fA = aydVar.n().a();
        if (f >= 0.0f || fD <= fA) {
            j = 0;
        } else {
            this.b.a(new Float(f));
        }
        return new cmm(j);
    }
}
