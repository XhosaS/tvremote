package defpackage;

import android.app.Application;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vql {
    public int c;
    private boolean e;
    private boolean f;
    public final Object a = new Object();
    public final Set b = new HashSet();
    public final Application.ActivityLifecycleCallbacks d = new vqk(this);

    public final void a(boolean z) {
        uea.c();
        synchronized (this.a) {
            if (z != this.f) {
                this.e = z;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f = z;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }
}
