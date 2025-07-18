package defpackage;

import com.google.common.collect.ImmutableSortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxo {
    public static final rxo a = new rxo(ImmutableSortedSet.of());
    public final ImmutableSortedSet b;

    public rxo(ImmutableSortedSet immutableSortedSet) {
        this.b = immutableSortedSet;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rxo) {
            return this.b.equals(((rxo) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
