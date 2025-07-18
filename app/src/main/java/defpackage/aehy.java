package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehy implements aehi {
    private final Set a = new HashSet();

    public final void a() {
        if (aeho.a == null) {
            aeho.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != aeho.a) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aeix) it.next()).a();
        }
    }
}
