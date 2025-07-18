package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kur {
    public static final kur a = a(Collections.EMPTY_MAP, Collections.EMPTY_MAP);
    public final ImmutableMap b;
    public final ImmutableMap c;

    public kur() {
        throw null;
    }

    public static kur a(Map map, Map map2) {
        return new kur(ImmutableMap.copyOf(map), ImmutableMap.copyOf(map2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kur) {
            kur kurVar = (kur) obj;
            if (this.b.equals(kurVar.b) && this.c.equals(kurVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ImmutableMap immutableMap = this.c;
        return "FamilyLibrary{assetsShareability=" + this.b.toString() + ", partiallySharedTypes=" + immutableMap.toString() + "}";
    }

    public kur(ImmutableMap immutableMap, ImmutableMap immutableMap2) {
        if (immutableMap == null) {
            throw new NullPointerException("Null assetsShareability");
        }
        this.b = immutableMap;
        if (immutableMap2 == null) {
            throw new NullPointerException("Null partiallySharedTypes");
        }
        this.c = immutableMap2;
    }
}
