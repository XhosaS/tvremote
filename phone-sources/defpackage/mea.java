package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mea implements Runnable {
    public final List a = new ArrayList(2);
    private final List b = new ArrayList(2);
    private final int c;
    private int d;
    private boolean e;

    public mea(int i) {
        this.c = i;
    }

    public final void a() {
        this.d++;
        run();
    }

    public final void b(Runnable runnable) {
        this.b.add(runnable);
    }

    public final void c() {
        this.d--;
        ksk.i(this);
        ksk.h(this, this.c);
    }

    public final synchronized boolean d() {
        return this.e;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        ksk.i(this);
        boolean z = this.d > 0;
        if (z != this.e) {
            this.e = z;
            if (z) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else {
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            }
        }
    }
}
