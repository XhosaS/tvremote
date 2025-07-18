package defpackage;

import android.app.Activity;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goc implements gnz {
    public final ReentrantLock a = new ReentrantLock();
    public final WeakHashMap b = new WeakHashMap();
    private final gnz c;

    public goc(gnz gnzVar) {
        this.c = gnzVar;
    }

    public final void a(Activity activity, gns gnsVar) {
        activity.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.b;
            if (yks.e(gnsVar, (gns) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((gof) this.c).a.c.iterator();
            it.getClass();
            while (it.hasNext()) {
                gog gogVar = (gog) it.next();
                if (yks.e(gogVar.a, activity)) {
                    gogVar.a(gnsVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
