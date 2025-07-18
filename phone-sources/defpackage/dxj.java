package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dxj {
    public final Map b = new LinkedHashMap();

    public abstract Object a(dxi dxiVar);

    public final boolean equals(Object obj) {
        return (obj instanceof dxj) && yks.e(this.b, ((dxj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }
}
