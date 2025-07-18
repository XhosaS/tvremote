package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afxx implements Runnable {
    final /* synthetic */ afxp a;
    final /* synthetic */ afyd b;
    final /* synthetic */ afyc c;

    public afxx(afyc afycVar, afxp afxpVar, afyd afydVar) {
        this.a = afxpVar;
        this.b = afydVar;
        this.c = afycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afxp afxpVar = this.a;
        synchronized (afxpVar.a) {
            if (afxpVar.c) {
                return;
            }
            afxpVar.a();
            afyc afycVar = this.c;
            afycVar.b.k.execute(new afxw(this, this.b));
        }
    }
}
