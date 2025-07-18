package defpackage;

import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrw {
    public final ImmutableMap a;

    public lrw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrw) {
            return this.a.equals(((lrw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetStreamsAvodResponse{avodMap=" + this.a.toString() + "}";
    }

    public lrw(ImmutableMap immutableMap) {
        if (immutableMap == null) {
            throw new NullPointerException("Null avodMap");
        }
        this.a = immutableMap;
    }
}
