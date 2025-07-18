package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zuf implements Runnable {
    final zum a;
    final zyd b;

    public zuf(zum zumVar, zyd zydVar) {
        this.a = zumVar;
        this.b = zydVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.valueField != this) {
            return;
        }
        zyd zydVar = this.b;
        if (zuv.j.f(this.a, this, zum.j(zydVar))) {
            zum.l(this.a, false);
        }
    }
}
