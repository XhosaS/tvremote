package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njg extends dxx {
    public final Semaphore i;
    private final Set j;

    public njg(Context context, Set set) {
        super(context);
        this.i = new Semaphore(0);
        this.j = set;
    }

    @Override // defpackage.dxx
    public final /* bridge */ /* synthetic */ Object a() throws InterruptedException {
        Iterator it = this.j.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((nwu) it.next()).i(this)) {
                i++;
            }
        }
        try {
            this.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // defpackage.dxy
    public final void h() {
        this.i.drainPermits();
        c();
    }
}
