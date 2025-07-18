package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzj implements Runnable, wwt {
    wwq a;

    public wzj(wwq wwqVar) {
        this.a = wwqVar;
    }

    @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uea.a().postDelayed(this, 5000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
    }
}
