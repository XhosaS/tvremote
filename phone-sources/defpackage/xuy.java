package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xuy extends xwv {
    public final AtomicInteger a = new AtomicInteger(-2147483647);
    private final xvv b;
    private volatile xtk c;

    public xuy(xvv xvvVar, String str) {
        this.b = xvvVar;
        str.getClass();
    }

    @Override // defpackage.xwv, defpackage.xvn
    public final xvk a(xsq xsqVar, xsm xsmVar, xpy xpyVar, xqe[] xqeVarArr) {
        return this.a.get() >= 0 ? new xwr(this.c, xqeVarArr) : this.b.a(xsqVar, xsmVar, xpyVar, xqeVarArr);
    }

    @Override // defpackage.xwv
    protected final xvv d() {
        return this.b;
    }

    @Override // defpackage.xwv, defpackage.xze
    public final void e(xtk xtkVar) {
        xtkVar.getClass();
        synchronized (this) {
            AtomicInteger atomicInteger = this.a;
            if (atomicInteger.get() < 0) {
                this.c = xtkVar;
                atomicInteger.addAndGet(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                if (atomicInteger.get() != 0) {
                    return;
                }
                super.e(xtkVar);
            }
        }
    }
}
