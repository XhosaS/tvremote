package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owr extends owt {
    private final Status a;

    public owr(Status status) {
        this.a = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owr) && agvy.c(this.a, ((owr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RefreshError(status=" + this.a + ")";
    }
}
