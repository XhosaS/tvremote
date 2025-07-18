package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krv implements kri {
    private final ids a;
    private final iej b;

    public krv(ids idsVar, iej iejVar) {
        this.a = idsVar;
        this.b = iejVar;
    }

    public static kri c(iea ieaVar, idy idyVar) {
        return new krv(ieaVar, new krw(ieaVar, idyVar));
    }

    public static kri d(iea ieaVar, idy idyVar) {
        return new krv(ieaVar, new kru(ieaVar, icz.a, idyVar, 0));
    }

    @Override // defpackage.kri
    public final void a() {
        ids idsVar = this.a;
        iej iejVar = this.b;
        idsVar.ea(iejVar);
        iejVar.dM();
    }

    @Override // defpackage.kri
    public final void b() {
        this.a.ee(this.b);
    }
}
