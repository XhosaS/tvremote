package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgr implements Runnable {
    final cgx a;
    final cja b;

    public cgr(cgx cgxVar, cja cjaVar) {
        this.a = cgxVar;
        this.b = cjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.valueField != this) {
            return;
        }
        if (chg.v(this.a, this, cgx.k(this.b))) {
            cgx.n(this.a, false);
        }
    }
}
