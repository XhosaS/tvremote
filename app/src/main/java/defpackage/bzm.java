package defpackage;

import android.app.Activity;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzm implements bzc {
    public final ReentrantLock a = new ReentrantLock();
    public final WeakHashMap b = new WeakHashMap();
    private final bzc c;

    public bzm(bzc bzcVar) {
        this.c = bzcVar;
    }

    public final void a(Activity activity, byq byqVar) {
        activity.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.b;
            if (agvy.c(byqVar, (byq) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((bzp) this.c).a.c.iterator();
            it.getClass();
            while (it.hasNext()) {
                bzr bzrVar = (bzr) it.next();
                if (agvy.c(bzrVar.a, activity)) {
                    bzrVar.a(byqVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
