package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agii extends agff {
    final agfh a;

    public agii(agfh agfhVar) {
        this.a = agfhVar;
    }

    @Override // defpackage.agff
    protected final void l(agfg agfgVar) {
        agih agihVar = new agih(agfgVar);
        agfgVar.c(agihVar);
        try {
            this.a.a(agihVar);
        } catch (Throwable th) {
            aggq.a(th);
            agihVar.b(th);
        }
    }
}
