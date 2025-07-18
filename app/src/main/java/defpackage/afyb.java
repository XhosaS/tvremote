package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afyb implements Runnable {
    final /* synthetic */ afyc a;

    public afyb(afyc afycVar) {
        this.a = afycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afyf afyfVar = this.a.b;
        if (afyfVar.G) {
            return;
        }
        afyfVar.C.e();
    }
}
