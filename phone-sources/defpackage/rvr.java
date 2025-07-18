package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rvr extends rvu {
    private final boolean b;

    public rvr(zah zahVar, boolean z) {
        super(zahVar);
        this.b = z;
    }

    private final zah f() {
        return this.b ? this.a : e();
    }

    @Override // defpackage.rvu
    public final long a(String str) {
        zah zahVarF = f();
        if (zahVarF.equals(zah.a)) {
            return 1000L;
        }
        return zahVarF.c;
    }

    @Override // defpackage.rvu
    public final zah b(Long l) {
        return this.a;
    }

    @Override // defpackage.rvu
    public final zah c(Long l) {
        return f();
    }

    @Override // defpackage.rvu
    public final boolean d() {
        return this.b;
    }
}
