package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enh implements eng {
    private final fdg a;
    private final long b;

    public enh(fdg fdgVar, long j) {
        this.a = fdgVar;
        this.b = j;
    }

    @Override // defpackage.eng
    public final long a(long j, long j2) {
        return this.a.a;
    }

    @Override // defpackage.eng
    public final long b(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // defpackage.eng
    public final long c(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.eng
    public final long d() {
        return 0L;
    }

    @Override // defpackage.eng
    public final long e(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.eng
    public final long f(long j) {
        return this.a.a;
    }

    @Override // defpackage.eng
    public final long g(long j, long j2) {
        return this.a.d(j + this.b);
    }

    @Override // defpackage.eng
    public final long h(long j) {
        return this.a.e[(int) j] - this.b;
    }

    @Override // defpackage.eng
    public final enw i(long j) {
        return new enw(null, this.a.c[(int) j], r0.b[r9]);
    }

    @Override // defpackage.eng
    public final boolean j() {
        return true;
    }
}
