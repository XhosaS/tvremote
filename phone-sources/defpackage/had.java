package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class had {
    public static final had a = new had(yhc.a);
    public final Map b;

    public had(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof had) && yks.e(this.b, ((had) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.b + ")";
    }
}
