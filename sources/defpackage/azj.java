package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class azj {
    protected final cxs a;

    public azj(cxs cxsVar) {
        this.a = cxsVar;
    }

    public abstract long a(String str);

    public abstract cxs b(Long l);

    public abstract cxs c(Long l);

    public abstract boolean d();

    public final cxs e() {
        cxs cxsVarB = b(null);
        clo cloVar = (clo) cxsVarB.a(5, null);
        cloVar.n(cxsVarB);
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        cxs cxsVar = (cxs) cloVar.b;
        cxs cxsVar2 = cxs.a;
        cxsVar.b |= 2;
        cxsVar.c = -1L;
        return (cxs) cloVar.i();
    }
}
