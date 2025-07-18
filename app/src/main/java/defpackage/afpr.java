package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpr implements Runnable {
    final /* synthetic */ afpu a;

    public afpr(afpu afpuVar) {
        this.a = afpuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yqw.M(((aftr) this.a.f).a.C.get(), "Channel must have been shut down");
    }
}
