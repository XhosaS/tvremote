package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfe implements Runnable {
    final /* synthetic */ lez a;
    final /* synthetic */ long b;
    final /* synthetic */ lfg c;

    public lfe(lfg lfgVar, lez lezVar, long j) {
        this.a = lezVar;
        this.b = j;
        this.c = lfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.b;
        lfg lfgVar = this.c;
        lfgVar.n(this.a, false, j);
        lfgVar.c = null;
        lfgVar.y.k().s(null);
    }
}
