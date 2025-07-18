package defpackage;

import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrx {
    public final ImmutableMap a;

    public lrx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrx) {
            return this.a.equals(((lrx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetStreamsQoeResponse{qoePropertiesMap=" + this.a.toString() + "}";
    }

    public lrx(ImmutableMap immutableMap) {
        if (immutableMap == null) {
            throw new NullPointerException("Null qoePropertiesMap");
        }
        this.a = immutableMap;
    }
}
