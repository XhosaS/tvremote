package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yoc implements yod {
    private final /* synthetic */ int a;
    private final Object b;

    public yoc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ypm] */
    @Override // defpackage.yod
    public final void b(Throwable th) {
        int i = this.a;
        if (i == 0) {
            this.b.a(th);
        } else if (i != 1) {
            this.b.eD();
        } else {
            this.b.cancel(false);
        }
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "CancelHandler.UserSupplied[" + yoz.a(this.b) + "@" + yoz.b(this) + "]";
        }
        if (i != 1) {
            return "DisposeOnCancel[" + this.b + "]";
        }
        return "CancelFutureOnCancel[" + this.b + "]";
    }
}
