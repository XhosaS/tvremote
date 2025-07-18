package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnw implements kee {
    public final int b;
    private final String c = null;

    public lnw(lnv lnvVar) {
        this.b = lnvVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lnw)) {
            return false;
        }
        lnw lnwVar = (lnw) obj;
        if (this.b == lnwVar.b) {
            String str = lnwVar.c;
            if (kki.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), null});
    }
}
