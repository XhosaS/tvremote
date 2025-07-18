package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcz implements fef {
    public final fdc a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    private final long f;

    public fcz(fdc fdcVar, long j, long j2, long j3, long j4, long j5) {
        this.a = fdcVar;
        this.f = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.fef
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        feg fegVar = new feg(j, fdb.a(this.a.a(j), 0L, this.b, this.c, this.d, this.e));
        return new fed(fegVar, fegVar);
    }

    @Override // defpackage.fef
    public final boolean z() {
        return true;
    }
}
