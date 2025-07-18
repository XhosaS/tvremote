package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxl {
    public final AtomicInteger c;
    public final zyd[] d;
    public boolean a = false;
    public boolean b = true;
    public volatile int e = 0;

    public zxl(zyd[] zydVarArr) {
        this.d = zydVarArr;
        this.c = new AtomicInteger(zydVarArr.length);
    }

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (zyd zydVar : this.d) {
                if (zydVar != null) {
                    zydVar.cancel(this.b);
                }
            }
        }
    }
}
