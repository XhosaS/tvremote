package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsf {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gsf(String str, long j, List list, List list2, enu enuVar) {
        this.e = str;
        this.a = j;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = enuVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final int a(int i) {
        ?? r0 = this.b;
        int size = r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((enp) r0.get(i2)).b == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void b(cb cbVar) {
        Runnable runnable;
        cbVar.getClass();
        synchronized (this.b) {
            runnable = (Runnable) this.c.remove(cbVar);
        }
        if (runnable != null) {
            ((cb) this.d).m(runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void c(cb cbVar) {
        foa foaVar = new foa(this, cbVar, 19);
        synchronized (this.b) {
        }
        ((cb) this.d).n(this.a, foaVar);
    }

    public gsf(cb cbVar, fse fseVar) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.d = cbVar;
        this.e = fseVar;
        this.a = millis;
        this.b = new Object();
        this.c = new LinkedHashMap();
    }
}
