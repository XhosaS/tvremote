package defpackage;

import java.util.Collection;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afwy implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ afyd b;
    final /* synthetic */ Future c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Future e;
    final /* synthetic */ afyf f;

    public afwy(afyf afyfVar, Collection collection, afyd afydVar, Future future, boolean z, Future future2) {
        this.a = collection;
        this.b = afydVar;
        this.c = future;
        this.d = z;
        this.e = future2;
        this.f = afyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (afyd afydVar : this.a) {
            if (afydVar != this.b) {
                afydVar.a.n(afyf.g);
            }
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
            if (!this.d) {
                afyf afyfVar = this.f;
                if (afyfVar.z.decrementAndGet() == Integer.MIN_VALUE) {
                    afkc afkcVar = (afkc) afyfVar.l;
                    afkcVar.c(new afwx(this));
                    afkcVar.b();
                }
            }
        }
        Future future2 = this.e;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f.j();
    }
}
