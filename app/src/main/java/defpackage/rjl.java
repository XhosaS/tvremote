package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class rjl extends rhz implements riy {
    private volatile int a;
    private rlg b;

    public rjl(String str, String str2, rkq rkqVar) {
        super(str, str2, rkqVar);
        this.a = -1;
    }

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

    @Override // defpackage.rhz
    protected final Object h(rfr rfrVar) {
        return g(this, rfrVar, "");
    }

    @Override // defpackage.rhz
    protected final Object i(rfr rfrVar, String str) {
        throw new UnsupportedOperationException("DeviceFlag does not support accounts.");
    }
}
