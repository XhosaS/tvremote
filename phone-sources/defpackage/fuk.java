package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fuk extends fun {
    public final Object k = new Object();
    Executor l;
    fuj m;
    fug n;
    Collection o;

    public abstract void a(String str);

    public abstract void c(String str);

    public abstract void e(List list);

    public String i() {
        return null;
    }

    public String j() {
        return null;
    }

    public final void p(fug fugVar, Collection collection) {
        if (fugVar == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.k) {
            try {
                try {
                    Executor executor = this.l;
                    if (executor != null) {
                        executor.execute(new ejr(this, this.m, fugVar, collection, 7, (short[]) null));
                    } else {
                        this.n = fugVar;
                        this.o = new ArrayList(collection);
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
