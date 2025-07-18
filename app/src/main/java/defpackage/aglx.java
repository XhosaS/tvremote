package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglx extends agff {
    final agga a;
    final aggz b;

    public aglx(agga aggaVar, aggz aggzVar) {
        this.a = aggaVar;
        this.b = aggzVar;
    }

    @Override // defpackage.agff
    protected final void l(agfg agfgVar) {
        aglw aglwVar = new aglw(agfgVar, this.b);
        agfgVar.c(aglwVar);
        this.a.d(aglwVar);
    }
}
