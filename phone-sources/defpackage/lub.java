package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lub {
    public final ImmutableList a;

    public lub() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lub) {
            return this.a.equals(((lub) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetNotificationSettingsResponse{settings=" + this.a.toString() + "}";
    }

    public lub(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null settings");
        }
        this.a = immutableList;
    }
}
