package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfn extends tfj {
    final /* synthetic */ tfs a;

    public tfn(tfs tfsVar) {
        this.a = tfsVar;
    }

    @Override // defpackage.tfj
    public final void a() {
        tfs tfsVar = this.a;
        synchronized (tfsVar.e) {
            AtomicInteger atomicInteger = tfsVar.k;
            if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                if (tfsVar.m != null) {
                    tfsVar.a.unbindService(tfsVar.l);
                    tfsVar.f = false;
                    tfsVar.m = null;
                    tfsVar.l = null;
                }
                tfsVar.b();
            }
        }
    }
}
