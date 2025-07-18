package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afxr implements Runnable {
    final afxp a;
    final /* synthetic */ afyf b;

    public afxr(afyf afyfVar, afxp afxpVar) {
        this.b = afyfVar;
        this.a = afxpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afyf afyfVar = this.b;
        afyd afydVarK = afyfVar.k(afyfVar.w.e, false);
        if (afydVarK == null) {
            return;
        }
        afyfVar.k.execute(new afxq(this, afydVarK));
    }
}
