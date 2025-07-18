package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agja extends agff {
    final agfi a;
    final agfx b;

    public agja(agfi agfiVar, agfx agfxVar) {
        this.a = agfiVar;
        this.b = agfxVar;
    }

    @Override // defpackage.agff
    protected final void l(agfg agfgVar) {
        agiz agizVar = new agiz(agfgVar, this.a);
        agfgVar.c(agizVar);
        aghd.g(agizVar.b, this.b.b(agizVar));
    }
}
