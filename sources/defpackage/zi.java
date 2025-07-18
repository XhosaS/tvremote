package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zi extends zl {
    public final Object j = new Object();
    Executor k;
    zh l;
    zf m;
    Collection n;

    public final void k(zf zfVar, Collection collection) {
        if (zfVar == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.j) {
            try {
                try {
                    Executor executor = this.k;
                    if (executor != null) {
                        executor.execute(new rj(this, this.l, zfVar, collection, 2));
                    } else {
                        this.m = zfVar;
                        this.n = new ArrayList(collection);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
