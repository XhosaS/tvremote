package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gke {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    @Deprecated
    public gke() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gke)) {
            return false;
        }
        gke gkeVar = (gke) obj;
        return this.b == gkeVar.b && this.a.equals(gkeVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        Map map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }

    public gke(View view) {
        this.b = view;
    }
}
