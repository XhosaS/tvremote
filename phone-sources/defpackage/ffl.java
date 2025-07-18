package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffl extends fdv {
    private final long a;

    public ffl(fdq fdqVar, long j) {
        super(fdqVar);
        a.H(((fdi) fdqVar).b >= j);
        this.a = j;
    }

    @Override // defpackage.fdv, defpackage.fdq
    public final long d() {
        return super.d() - this.a;
    }

    @Override // defpackage.fdv, defpackage.fdq
    public final long e() {
        return super.e() - this.a;
    }

    @Override // defpackage.fdv, defpackage.fdq
    public final long f() {
        return super.f() - this.a;
    }
}
