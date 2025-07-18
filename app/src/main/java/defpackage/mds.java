package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mds extends zxb implements zyf {
    public volatile zyf a;

    public mds(zyd zydVar, zyf zyfVar) {
        super(zydVar);
        this.a = zyfVar;
        zydVar.d(new Runnable() { // from class: mdr
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.cancel(false);
            }
        }, zwk.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
