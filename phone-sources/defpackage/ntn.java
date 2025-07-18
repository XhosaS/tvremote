package defpackage;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntn {
    public static final ntn a = new ntn(Sets.immutableEnumSet(EnumSet.allOf(nto.class)));
    public static final ntn b = new ntn(ImmutableSet.of());
    public static final ntn c = new ntn(Sets.immutableEnumSet(nto.ZWIEBACK, new nto[0]));
    public final ImmutableSet d;

    public ntn(ImmutableSet immutableSet) {
        this.d = immutableSet;
    }

    public final boolean a(nto ntoVar) {
        return this.d.contains(ntoVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ntn) && this.d.equals(((ntn) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
