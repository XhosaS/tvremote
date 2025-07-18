package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjm extends agjf {
    final aggz c;

    public agjm(agfl agflVar, aggz aggzVar) {
        super(agflVar);
        this.c = aggzVar;
    }

    @Override // defpackage.agfl
    protected final void e(aide aideVar) {
        if (aideVar instanceof agho) {
            this.b.c(new agjk((agho) aideVar, this.c));
        } else {
            this.b.c(new agjl(aideVar, this.c));
        }
    }
}
