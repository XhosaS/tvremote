package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jen implements ixg {
    private final iea a;
    private final isw b;

    public jen(isw iswVar, iea ieaVar) {
        iswVar.getClass();
        this.b = iswVar;
        this.a = ieaVar;
    }

    @Override // defpackage.ixg
    public final ids a() {
        return this.b;
    }

    @Override // defpackage.ixg
    public final boolean b(ixh ixhVar) {
        if (ixhVar instanceof jek) {
            return this.b.t(new iog(((jek) ixhVar).a(), ((ksn) ((ldy) this.a).a().g()).a));
        }
        return true;
    }
}
