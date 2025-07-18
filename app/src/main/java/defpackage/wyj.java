package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyj implements wwt {
    final /* synthetic */ wwt a;

    public wyj(wwt wwtVar) {
        this.a = wwtVar;
    }

    @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uea.a().postDelayed(new Runnable() { // from class: wyi
            @Override // java.lang.Runnable
            public final void run() {
                Object obj = wyo.d;
                wwt wwtVar = this.a.a;
                synchronized (obj) {
                    if (agvy.c(wyo.e, wwtVar)) {
                        wyo.e = null;
                    }
                }
            }
        }, 10000L);
    }
}
