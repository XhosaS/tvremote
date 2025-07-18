package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dnn {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = new HashSet();
    public boolean c;

    public final boolean a(don donVar) {
        boolean z = true;
        if (donVar == null) {
            return true;
        }
        Set set = this.a;
        Set set2 = this.b;
        boolean zRemove = set.remove(donVar);
        if (!set2.remove(donVar) && !zRemove) {
            z = false;
        }
        if (z) {
            donVar.c();
        }
        return z;
    }

    public final String toString() {
        Set set = this.a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.c + "}";
    }
}
