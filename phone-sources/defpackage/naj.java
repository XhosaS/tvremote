package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class naj {
    public final List a;

    public naj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof naj) {
            return this.a.equals(((naj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TrailersViewModel{trailers=" + String.valueOf(this.a) + "}";
    }

    public naj(List list) {
        this.a = list;
    }
}
