package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpe {
    public final boolean a;
    private final ImmutableList b;

    public rpe() {
        throw null;
    }

    public final ImmutableList a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rpe) {
            rpe rpeVar = (rpe) obj;
            if (this.a == rpeVar.a && this.b.equals(rpeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }

    public rpe(boolean z, ImmutableList immutableList) {
        this.a = z;
        if (immutableList == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = immutableList;
    }
}
