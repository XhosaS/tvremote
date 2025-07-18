package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afxk implements Runnable {
    final /* synthetic */ afyf a;

    public afxk(afyf afyfVar) {
        this.a = afyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afyf afyfVar = this.a;
        if (afyfVar.G) {
            return;
        }
        afyfVar.C.e();
    }
}
