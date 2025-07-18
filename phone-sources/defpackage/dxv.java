package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxv extends dwt {
    public static final dwx a = new dxu(0);
    public final kp b = new kp();
    public boolean c = false;

    public final dxs a(int i) {
        return (dxs) kq.a(this.b, i);
    }

    final void b() {
        this.c = false;
    }

    @Override // defpackage.dwt
    protected final void d() {
        kp kpVar = this.b;
        int iC = kpVar.c();
        for (int i = 0; i < iC; i++) {
            ((dxs) kpVar.e(i)).o();
        }
        kpVar.g();
    }
}
