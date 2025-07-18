package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class one implements nwi {
    public static final one a = new one();
    private final boolean b = false;
    private final boolean c = false;
    private final String d = null;
    private final boolean e = false;
    private final boolean h = false;
    private final String f = null;
    private final String g = null;
    private final Long i = null;
    private final Long j = null;

    private one() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof one)) {
            return false;
        }
        one oneVar = (one) obj;
        boolean z = oneVar.b;
        boolean z2 = oneVar.c;
        String str = oneVar.d;
        if (a.Q(null, null)) {
            boolean z3 = oneVar.e;
            boolean z4 = oneVar.h;
            String str2 = oneVar.f;
            if (a.Q(null, null)) {
                String str3 = oneVar.g;
                if (a.Q(null, null)) {
                    Long l = oneVar.i;
                    if (a.Q(null, null)) {
                        Long l2 = oneVar.j;
                        if (a.Q(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
