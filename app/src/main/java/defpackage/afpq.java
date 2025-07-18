package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpq implements Runnable {
    final /* synthetic */ afvb a;

    public afpq(afvb afvbVar) {
        this.a = afvbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afun afunVar = ((aftr) this.a).a;
        yqw.M(afunVar.C.get(), "Channel must have been shut down");
        afunVar.D = true;
        afunVar.k(false);
        afunVar.i();
    }
}
