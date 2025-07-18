package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class eax implements Runnable {
    final /* synthetic */ eay a;

    public eax(eay eayVar) {
        this.a = eayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(System.nanoTime());
    }
}
