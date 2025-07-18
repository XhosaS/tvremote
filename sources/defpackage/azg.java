package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azg extends azj {
    private final boolean b;

    public azg(cxs cxsVar, boolean z) {
        super(cxsVar);
        this.b = z;
    }

    private final cxs f() {
        return this.b ? this.a : e();
    }

    @Override // defpackage.azj
    public final long a(String str) {
        cxs cxsVarF = f();
        if (cxsVarF.equals(cxs.a)) {
            return 1000L;
        }
        return cxsVarF.c;
    }

    @Override // defpackage.azj
    public final cxs b(Long l) {
        return this.a;
    }

    @Override // defpackage.azj
    public final cxs c(Long l) {
        return f();
    }

    @Override // defpackage.azj
    public final boolean d() {
        return this.b;
    }
}
