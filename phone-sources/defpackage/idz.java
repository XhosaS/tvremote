package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idz extends icu implements idr {
    private Object g;

    public idz(Object obj) {
        obj.getClass();
        this.g = obj;
    }

    @Override // defpackage.ieh
    public final synchronized Object a() {
        return this.g;
    }

    @Override // defpackage.idy
    public final void c(Object obj) {
        synchronized (this) {
            if (obj.equals(this.g)) {
                return;
            }
            this.g = obj;
            eb();
        }
    }
}
