package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fee implements fef, fhh {
    private final long a;
    private final fed b;

    public fee(long j) {
        this(j, 0L);
    }

    @Override // defpackage.fef
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        return this.b;
    }

    @Override // defpackage.fhh
    public final int d() {
        return -2147483647;
    }

    @Override // defpackage.fhh
    public final long e() {
        return -1L;
    }

    @Override // defpackage.fhh
    public final long f(long j) {
        return 0L;
    }

    @Override // defpackage.fef
    public final boolean z() {
        return false;
    }

    public fee(long j, long j2) {
        this.a = j;
        feg fegVar = j2 == 0 ? feg.a : new feg(0L, j2);
        this.b = new fed(fegVar, fegVar);
    }

    public fee() {
        this(-9223372036854775807L);
    }
}
