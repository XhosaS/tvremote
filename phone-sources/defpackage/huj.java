package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huj {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = new HashSet();
    public boolean c;

    public final boolean a(hux huxVar) {
        boolean z = true;
        if (huxVar == null) {
            return true;
        }
        Set set = this.a;
        Set set2 = this.b;
        boolean zRemove = set.remove(huxVar);
        if (!set2.remove(huxVar) && !zRemove) {
            z = false;
        }
        if (z) {
            huxVar.c();
        }
        return z;
    }

    public final String toString() {
        Set set = this.a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.c + "}";
    }
}
