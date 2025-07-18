package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ria implements riy {
    private volatile int a = -1;
    private rlg b;

    @Override // defpackage.riy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.riy
    public final void d(rlg rlgVar) {
        this.b = rlgVar;
    }

    @Override // defpackage.riy
    public final rlg eT() {
        return this.b;
    }

    @Override // defpackage.riy
    public final void eU(int i) {
        this.a = i;
    }
}
