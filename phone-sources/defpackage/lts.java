package defpackage;

import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lts {
    public final ImmutableMap a;

    public lts() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lts) {
            return this.a.equals(((lts) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetWatchEventsResponse{playbackEvents=" + this.a.toString() + "}";
    }

    public lts(ImmutableMap immutableMap) {
        if (immutableMap == null) {
            throw new NullPointerException("Null playbackEvents");
        }
        this.a = immutableMap;
    }
}
