package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wye implements zvi {
    final /* synthetic */ wwq a;
    final /* synthetic */ zvi b;

    public wye(wwq wwqVar, zvi zviVar) {
        this.a = wwqVar;
        this.b = zviVar;
    }

    @Override // defpackage.zvi
    public final zyd a(Object obj) {
        wwq wwqVarG = wum.g(wum.c(), this.a);
        try {
            zyd zydVarA = this.b.a(obj);
            if (zydVarA != null) {
                return zydVarA;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
