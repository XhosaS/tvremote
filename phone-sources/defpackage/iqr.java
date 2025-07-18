package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqr extends icu {
    final /* synthetic */ iqs g;
    private final Object h;
    private Object i = null;

    public iqr(iqs iqsVar, Object obj) {
        this.g = iqsVar;
        this.h = obj;
    }

    public final void a(Object obj) {
        synchronized (this) {
            if (yks.e(obj, this.i)) {
                return;
            }
            this.i = obj;
            eb();
        }
    }

    @Override // defpackage.icu
    protected final void ed() {
        this.g.o(this.h);
    }
}
