package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptb {
    public final List a;

    public ptb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ptb) {
            return this.a.equals(((ptb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FetchPreferencesResult{preferenceResults=" + String.valueOf(this.a) + "}";
    }

    public ptb(List list) {
        this.a = list;
    }
}
