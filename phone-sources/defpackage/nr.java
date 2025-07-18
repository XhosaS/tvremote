package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nr implements nq {
    private final float a;
    private final float b;
    private final float c;
    private final or d;

    /* JADX WARN: Illegal instructions before constructor call */
    public nr() {
        float f = 0.0f;
        this(f, f, 7);
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ pn a(bhi bhiVar) {
        return f();
    }

    @Override // defpackage.nq
    public final float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.nq
    public final float c(long j, float f, float f2, float f3) {
        or orVar = this.d;
        orVar.a = f2;
        return Float.intBitsToFloat((int) (orVar.b(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.nq
    public final float d(long j, float f, float f2, float f3) {
        or orVar = this.d;
        orVar.a = f2;
        return Float.intBitsToFloat((int) (orVar.b(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    @Override // defpackage.nq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(float r37, float r38, float r39) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr.e(float, float, float):long");
    }

    @Override // defpackage.nq
    public final /* synthetic */ ps f() {
        return new ps(this);
    }

    public nr(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        or orVar = new or();
        if (f < 0.0f) {
            og.a("Damping ratio must be non-negative");
        }
        orVar.c = f;
        if (orVar.a() <= 0.0f) {
            og.a("Spring stiffness constant must be positive.");
        }
        orVar.b = Math.sqrt(f2);
        this.d = orVar;
    }

    public /* synthetic */ nr(float f, float f2, int i) {
        this(1 == (i & 1) ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, 0.01f);
    }
}
