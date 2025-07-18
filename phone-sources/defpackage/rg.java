package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rg extends bko implements cak {
    public static final hv a = new hv();
    private final yjv b;
    private final Object c = a;

    public rg(yjv yjvVar) {
        this.b = yjvVar;
    }

    public final void a(bvc bvcVar) {
        this.b.a(bvcVar);
        rg rgVar = (rg) cbp.G(this);
        if (rgVar != null) {
            rgVar.a(bvcVar);
        }
    }

    @Override // defpackage.cak
    public final Object ci() {
        return this.c;
    }
}
