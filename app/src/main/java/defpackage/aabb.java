package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabb {
    public static final aabb a = new aabb(DesugarCollections.unmodifiableMap(new HashMap()));
    private final Map b;

    public aabb(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aabb) {
            return this.b.equals(((aabb) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
