package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltq implements kee {
    public static final ltq b = new ltq();
    private final boolean c = false;
    private final boolean d = false;
    private final String e = null;
    private final boolean f = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    private ltq() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ltq)) {
            return false;
        }
        ltq ltqVar = (ltq) obj;
        boolean z = ltqVar.c;
        boolean z2 = ltqVar.d;
        String str = ltqVar.e;
        if (kki.a(null, null)) {
            boolean z3 = ltqVar.f;
            boolean z4 = ltqVar.i;
            String str2 = ltqVar.g;
            if (kki.a(null, null)) {
                String str3 = ltqVar.h;
                if (kki.a(null, null)) {
                    Long l = ltqVar.j;
                    if (kki.a(null, null)) {
                        Long l2 = ltqVar.k;
                        if (kki.a(null, null)) {
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
