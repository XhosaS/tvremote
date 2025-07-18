package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public abstract class nwu {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static Set t() {
        Set set = a;
        synchronized (set) {
        }
        return set;
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public nxr b(nxr nxrVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void d();

    public abstract void e();

    public void f() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean g();

    public abstract boolean h();

    public boolean i(njg njgVar) {
        throw new UnsupportedOperationException();
    }

    public void j(nxr nxrVar) {
        throw null;
    }

    public nwj k(npj npjVar) {
        throw null;
    }
}
