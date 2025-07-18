package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cir {
    public final AtomicInteger c;
    public final cja[] d;
    public boolean a = false;
    public boolean b = true;
    public volatile int e = 0;

    public cir(cja[] cjaVarArr) {
        this.d = cjaVarArr;
        this.c = new AtomicInteger(cjaVarArr.length);
    }

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (cja cjaVar : this.d) {
                if (cjaVar != null) {
                    cjaVar.cancel(this.b);
                }
            }
        }
    }
}
