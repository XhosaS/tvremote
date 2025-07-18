package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pbf {
    public final ImmutableSet a;
    public final ImmutableSet b;
    public final ImmutableSet c;
    public final ImmutableSet d;

    public pbf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pbf) {
            pbf pbfVar = (pbf) obj;
            if (this.a.equals(pbfVar.a) && this.b.equals(pbfVar.b) && this.c.equals(pbfVar.c) && this.d.equals(pbfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ImmutableSet immutableSet = this.d;
        ImmutableSet immutableSet2 = this.c;
        ImmutableSet immutableSet3 = this.b;
        return "TargetingData{clearcutEvents=" + String.valueOf(this.a) + ", veEvents=" + String.valueOf(immutableSet3) + ", appStateIds=" + String.valueOf(immutableSet2) + ", requestedPermissions=" + String.valueOf(immutableSet) + "}";
    }

    public pbf(ImmutableSet immutableSet, ImmutableSet immutableSet2, ImmutableSet immutableSet3, ImmutableSet immutableSet4) {
        this.a = immutableSet;
        this.b = immutableSet2;
        this.c = immutableSet3;
        this.d = immutableSet4;
    }
}
