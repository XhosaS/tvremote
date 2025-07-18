package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afqr implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ afqs b;

    public afqr(afqs afqsVar, boolean z) {
        this.a = z;
        this.b = afqsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            afqv afqvVar = this.b.b;
            afqvVar.p = true;
            if (afqvVar.l > 0) {
                yrn yrnVar = afqvVar.o;
                yrnVar.d();
                yrnVar.e();
            }
        }
        this.b.b.q = false;
    }
}
