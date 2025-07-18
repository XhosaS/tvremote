package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zih {
    public static final Comparator a = new zia();
    public static final zih b = new zih(new zif(Collections.EMPTY_LIST));
    public final zif c;

    public zih(zif zifVar) {
        this.c = zifVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zih) && ((zih) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
