package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agr {
    public final awy a;
    private final int b;
    private final afw c;
    private final String d;

    public agr(awy awyVar, afw afwVar, String str) {
        this.a = awyVar;
        this.c = afwVar;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{awyVar, afwVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agr)) {
            return false;
        }
        agr agrVar = (agr) obj;
        return ii.X(this.a, agrVar.a) && ii.X(this.c, agrVar.c) && ii.X(this.d, agrVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
