package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyb {
    public static final Comparator a = new qbi(7);
    public static final tyb b = new tyb(new txz(Collections.EMPTY_LIST));
    public final txz c;

    public tyb(txz txzVar) {
        this.c = txzVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tyb) && ((tyb) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
