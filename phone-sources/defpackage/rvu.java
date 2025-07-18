package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rvu {
    protected final zah a;

    public rvu(zah zahVar) {
        this.a = zahVar;
    }

    public abstract long a(String str);

    public abstract zah b(Long l);

    public abstract zah c(Long l);

    public abstract boolean d();

    public final zah e() {
        zah zahVarB = b(null);
        vtw vtwVar = (vtw) zahVarB.a(5, null);
        vtwVar.x(zahVarB);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        zah zahVar = (zah) vtwVar.b;
        zah zahVar2 = zah.a;
        zahVar.b |= 2;
        zahVar.c = -1L;
        return (zah) vtwVar.r();
    }
}
