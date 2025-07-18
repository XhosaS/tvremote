package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nev extends exk {
    private final nex a;
    private final net c;
    private eay d;

    public nev(ewb ewbVar, nex nexVar, net netVar) {
        super(ewbVar);
        this.a = nexVar;
        this.c = netVar;
    }

    @Override // defpackage.exk
    protected final void b(eay eayVar) {
        this.d = eayVar;
        y(eayVar);
    }

    @Override // defpackage.exk, defpackage.ewb
    public final void i(evx evxVar) {
        this.b.i(((neu) evxVar).a);
    }

    @Override // defpackage.exk, defpackage.ewb
    public final evx p(evz evzVar, ezp ezpVar, long j) {
        this.d.getClass();
        String strD = this.a.c.d(this.d, evzVar);
        net netVar = this.c;
        netVar.G(strD);
        return new neu(this.b.p(evzVar, ezpVar, j), netVar, strD);
    }
}
