package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgj extends icu implements lgi {
    public final iea g;
    public final ino h;
    public final iej i;
    public kuk j;
    public final krp k;

    public lgj(iea ieaVar, ino inoVar) {
        ieaVar.getClass();
        inoVar.getClass();
        this.g = ieaVar;
        this.h = inoVar;
        this.i = new itm(this, 18);
        Object objA = ieaVar.a();
        objA.getClass();
        this.j = (kuk) objA;
        krp krpVar = new krp();
        krpVar.b = new kih(this, 18);
        krpVar.c = new kih(this, 19);
        this.k = krpVar;
    }

    @Override // defpackage.ixl
    public final void dP() {
        eb();
    }

    @Override // defpackage.lgi
    public final ids m(ksy ksyVar) {
        return this.k.a(ksyVar);
    }

    @Override // defpackage.lgi
    public final kuj n(ksy ksyVar) {
        kuj kujVarA = ((kuk) this.g.a()).a(ksyVar);
        kujVarA.getClass();
        return kujVarA;
    }
}
