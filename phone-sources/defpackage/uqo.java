package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqo {
    public final ImmutableSet a;

    public uqo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqo) {
            return this.a.equals(((uqo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GrpcServiceConfig{grpcMethodConfigs=" + String.valueOf(this.a) + "}";
    }

    public uqo(ImmutableSet immutableSet) {
        this.a = immutableSet;
    }
}
