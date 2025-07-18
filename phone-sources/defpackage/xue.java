package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xue implements Runnable {
    final xud a;
    final /* synthetic */ String b;
    final /* synthetic */ xsm c;
    final /* synthetic */ xsq d;
    final /* synthetic */ ybs e;
    final /* synthetic */ xpy f;
    final /* synthetic */ xuf g;

    public xue(xuf xufVar, String str, xsm xsmVar, xsq xsqVar, ybs ybsVar, xpy xpyVar) {
        this.b = str;
        this.c = xsmVar;
        this.d = xsqVar;
        this.e = ybsVar;
        this.f = xpyVar;
        this.g = xufVar;
        this.a = new xud(str, xufVar.a, xufVar.e, xsmVar, xufVar, this, xufVar.c, xufVar.f, xsqVar, ybsVar, xpyVar, xufVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        xuf xufVar = this.g;
        synchronized (xufVar.c) {
            if (xufVar.j) {
                this.a.o.k(xufVar.k, true, new xsm());
            } else {
                if (!xufVar.l) {
                    throw new AssertionError("Transport is not started");
                }
                xud xudVar = this.a;
                xufVar.d.add(xudVar);
                xudVar.o.h.p = xufVar.i;
            }
        }
    }
}
