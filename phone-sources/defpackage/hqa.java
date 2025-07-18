package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqa implements hpx {
    public final Map b;
    public volatile Map c;

    public hqa(Map map) {
        this.b = DesugarCollections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hqa) {
            return this.b.equals(((hqa) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + String.valueOf(this.b) + "}";
    }
}
