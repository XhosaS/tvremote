package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agid extends agff {
    final agfi a;
    final agfi b;

    public agid(agfi agfiVar, agfi agfiVar2) {
        this.a = agfiVar;
        this.b = agfiVar2;
    }

    @Override // defpackage.agff
    protected final void l(agfg agfgVar) {
        this.a.a(new agic(agfgVar, this.b));
    }
}
