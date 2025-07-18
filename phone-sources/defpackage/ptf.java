package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptf {
    public final List a;

    public ptf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ptf) {
            return this.a.equals(((ptf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SetPreferencesRequest{preferenceEntries=" + String.valueOf(this.a) + "}";
    }

    public ptf(List list) {
        this.a = list;
    }
}
