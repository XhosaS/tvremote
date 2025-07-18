package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rts implements Closeable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rts(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i == 0) {
            rtx rtxVar = (rtx) this.a;
            if (rtxVar.d == null) {
                rtxVar.d = rqj.a();
                return;
            }
            return;
        }
        boolean z = true;
        if (i == 1) {
            rtx rtxVar2 = (rtx) this.a;
            if (rtxVar2.f == null) {
                rtxVar2.f = rqj.a();
                return;
            }
            return;
        }
        if (i == 2) {
            ((sml) this.a).a = true;
            return;
        }
        Object obj = this.a;
        synchronized (((smq) obj).h) {
            int i2 = ((smq) obj).k;
            if (i2 <= 0) {
                z = false;
            }
            sij.y(z, "Refcount went negative!", i2);
            ((smq) obj).k--;
            ((smq) obj).c();
        }
    }
}
