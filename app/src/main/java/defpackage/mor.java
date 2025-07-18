package defpackage;

import android.os.Looper;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
class mor extends agof {
    public final mmc a;
    public final Object b = new Object();
    public volatile drq c;
    public volatile boolean d;

    public mor(mmc mmcVar) {
        this.a = mmcVar;
    }

    @Override // defpackage.agfs
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Pair pair = (Pair) obj;
        if (f()) {
            return;
        }
        synchronized (this.b) {
            this.c = (drq) pair.first;
            if (this.d && !f()) {
                dru druVar = (dru) pair.second;
                mpp mppVar = mmd.a;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    int i = mlp.t;
                    if (druVar.c != null) {
                        druVar.l(new dxw(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                    }
                } else {
                    int i2 = mlp.t;
                    if (druVar.c != null) {
                        druVar.k(new dxw(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                    }
                }
            }
        }
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        throw agnx.a(th);
    }

    @Override // defpackage.agfs
    public final void a() {
    }
}
