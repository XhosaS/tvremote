package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class bcz implements Runnable {
    final /* synthetic */ bde a;

    public bcz(bde bdeVar) {
        this.a = bdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bde bdeVar = this.a;
        if (bdeVar.c == 0) {
            bdeVar.d = true;
            bdeVar.f.e(bce.ON_PAUSE);
        }
        bdeVar.c();
    }
}
