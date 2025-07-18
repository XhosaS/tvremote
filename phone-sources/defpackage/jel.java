package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jel implements ixg {
    private final irn a;

    public jel(irn irnVar) {
        irnVar.getClass();
        this.a = irnVar;
    }

    @Override // defpackage.ixg
    public final ids a() {
        return this.a;
    }

    @Override // defpackage.ixg
    public final boolean b(ixh ixhVar) {
        return ((ixhVar instanceof jek) && this.a.q(((jek) ixhVar).a())) ? false : true;
    }
}
