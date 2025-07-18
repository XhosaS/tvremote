package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglt extends agjn {
    final agfr b;
    final mop c;

    public aglt(agfr agfrVar, mop mopVar, agfr agfrVar2) {
        super(agfrVar);
        this.c = mopVar;
        this.b = agfrVar2;
    }

    @Override // defpackage.agfo
    public final void n(agfs agfsVar) {
        agog agogVar = new agog(agfsVar);
        aglr aglrVar = new aglr(agogVar, this.c);
        agogVar.d(aglrVar);
        this.b.m(new agls(aglrVar));
        this.a.m(aglrVar);
    }
}
