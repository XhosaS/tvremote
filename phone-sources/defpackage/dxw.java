package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxw extends dya implements Runnable {
    boolean a;
    final /* synthetic */ dxx b;

    public dxw(dxx dxxVar) {
        this.b = dxxVar;
    }

    @Override // defpackage.dya
    public final Object a() {
        try {
            return this.b.a();
        } catch (ctp e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.dya
    public final void b(Object obj) {
        dxx dxxVar = this.b;
        if (dxxVar.a != this) {
            dxxVar.d(this);
        } else {
            if (dxxVar.e) {
                return;
            }
            SystemClock.uptimeMillis();
            dxxVar.a = null;
            dxxVar.g(obj);
        }
    }

    @Override // defpackage.dya
    public final void c() {
        this.b.d(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.b();
    }
}
