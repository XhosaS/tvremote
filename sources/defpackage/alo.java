package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alo implements afw {
    public static final alo b = new alo();
    private final boolean c = false;
    private final boolean d = false;
    private final String e = null;
    private final boolean f = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    private alo() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof alo)) {
            return false;
        }
        alo aloVar = (alo) obj;
        boolean z = aloVar.c;
        boolean z2 = aloVar.d;
        String str = aloVar.e;
        if (ii.X(null, null)) {
            boolean z3 = aloVar.f;
            boolean z4 = aloVar.i;
            String str2 = aloVar.g;
            if (ii.X(null, null)) {
                String str3 = aloVar.h;
                if (ii.X(null, null)) {
                    Long l = aloVar.j;
                    if (ii.X(null, null)) {
                        Long l2 = aloVar.k;
                        if (ii.X(null, null)) {
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
