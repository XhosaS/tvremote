package defpackage;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpv {
    public static final xpv a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        c = identityHashMap;
        a = new xpv(identityHashMap);
    }

    public xpv(IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public final Object a(xpu xpuVar) {
        return this.b.get(xpuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.b;
        IdentityHashMap identityHashMap2 = ((xpv) obj).b;
        if (identityHashMap.size() != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !a.Q(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
