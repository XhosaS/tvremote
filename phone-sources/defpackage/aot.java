package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aot {
    private final Map a;

    public aot(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aot) {
            return yks.e(this.a, ((aot) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
