package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class its extends icu implements idr {
    private Object g;

    public its(Object obj) {
        this.g = obj;
    }

    @Override // defpackage.ieh
    public final synchronized Object a() {
        return this.g;
    }

    @Override // defpackage.idy
    public final void c(Object obj) {
        obj.getClass();
        synchronized (this) {
            if (!yks.e(this.g, obj)) {
                this.g = obj;
            }
        }
        eb();
    }
}
