package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iox {
    public final int a;
    public final List b;

    public iox(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iox)) {
            return false;
        }
        iox ioxVar = (iox) obj;
        return this.a == ioxVar.a && yks.e(this.b, ioxVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CacheData(posterHashCode=" + this.a + ", dominantColors=" + this.b + ")";
    }
}
