package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bat implements bcs {
    final /* synthetic */ bca a;
    final /* synthetic */ baz b;

    public bat(baz bazVar, bca bcaVar) {
        this.b = bazVar;
        this.a = bcaVar;
    }

    @Override // defpackage.bcs
    public final int c(bcr bcrVar, Object obj) {
        baz bazVar = this.b;
        if (true != (bazVar instanceof bcs)) {
            bazVar = null;
        }
        int iC = bazVar != null ? bazVar.c(bcrVar, obj) : 1;
        if (iC != 1) {
            return iC;
        }
        bca bcaVar = this.a;
        bcaVar.e = yfm.ag(bcaVar.e, new yfw(bcrVar, obj));
        return 2;
    }

    @Override // defpackage.bcs
    public final void b() {
    }

    @Override // defpackage.bcs
    public final void a(Object obj) {
    }
}
