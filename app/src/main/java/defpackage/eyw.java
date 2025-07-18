package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyw {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/lifecycle/ActivityTracker");
    public final agow c;
    public final gph d;
    public final gzu e;
    public final gof f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean m;
    public volatile boolean n;
    public volatile boolean o;
    public volatile hxt q;
    public final List b = new CopyOnWriteArrayList();
    public volatile boolean k = false;
    public volatile boolean l = false;
    public final AtomicInteger p = new AtomicInteger();
    public volatile boolean r = false;

    public eyw(agow agowVar, gph gphVar, gzu gzuVar, gof gofVar) {
        this.c = agowVar;
        this.d = gphVar;
        this.e = gzuVar;
        this.f = gofVar;
    }

    public final void a(eyn eynVar) {
        this.b.add(eynVar);
    }

    public final void b(eyn eynVar) {
        this.b.remove(eynVar);
    }

    public final void c(int i) {
        if (this.q != null) {
            this.q.ae(i);
        }
    }

    public final boolean d() {
        return this.p.get() > 0;
    }

    public final boolean e() {
        return this.q != null;
    }
}
