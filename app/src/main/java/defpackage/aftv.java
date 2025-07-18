package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aftv implements Runnable {
    final /* synthetic */ aftw a;

    public aftv(aftw aftwVar) {
        this.a = aftwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afun afunVar = this.a.b;
        afunVar.m.d();
        if (afunVar.u) {
            ((afrg) afunVar.t).a.b();
        }
    }
}
