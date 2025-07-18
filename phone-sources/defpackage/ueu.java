package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ueu<V> implements Runnable {
    final ufb<V> a;
    final uhp<? extends V> b;

    public ueu(ufb ufbVar, uhp uhpVar) {
        this.a = ufbVar;
        this.b = uhpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.valueField != this) {
            return;
        }
        if (ufj.u(this.a, this, ufb.l(this.b))) {
            ufb.n(this.a, false);
        }
    }
}
