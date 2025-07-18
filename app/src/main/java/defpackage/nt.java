package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class nt implements Runnable {
    final /* synthetic */ nu a;

    public nt(nu nuVar) {
        this.a = nuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nu nuVar = this.a;
        nuVar.b = null;
        nuVar.drawableStateChanged();
    }
}
