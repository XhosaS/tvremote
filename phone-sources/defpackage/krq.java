package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krq extends icu implements iea, dvw {
    private final dvs g;

    public krq(dvs dvsVar) {
        this.g = dvsVar;
    }

    @Override // defpackage.ieh
    public final Object a() {
        dvs dvsVar = this.g;
        if (dvsVar.a() == null) {
            return null;
        }
        return dvsVar.a();
    }

    @Override // defpackage.dvw
    public final void dV(Object obj) {
        eb();
    }

    @Override // defpackage.icu
    protected final void ec() {
        this.g.e(this);
    }

    @Override // defpackage.icu
    protected final void ed() {
        this.g.i(this);
    }
}
