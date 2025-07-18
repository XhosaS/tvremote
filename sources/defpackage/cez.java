package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cez {
    public static final Comparator a = new ary(2);
    public static final cez b = new cez(new cex(Collections.EMPTY_LIST));
    public final cex c;

    public cez(cex cexVar) {
        this.c = cexVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cez) && ((cez) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
