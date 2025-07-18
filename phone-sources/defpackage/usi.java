package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usi {
    public final ImmutableList a;
    public final Throwable b;
    public final int c;

    public usi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        ImmutableList immutableList;
        if (obj == this) {
            return true;
        }
        if (obj instanceof usi) {
            usi usiVar = (usi) obj;
            if (this.c == usiVar.c && ((immutableList = this.a) != null ? immutableList.equals(usiVar.a) : usiVar.a == null)) {
                Throwable th = this.b;
                Throwable th2 = usiVar.b;
                if (th != null ? th.equals(th2) : th2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.bl(i);
        ImmutableList immutableList = this.a;
        int iHashCode = immutableList == null ? 0 : immutableList.hashCode();
        int i2 = i ^ 1000003;
        Throwable th = this.b;
        return (((i2 * 1000003) ^ iHashCode) * 1000003) ^ (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        String str = this.c != 1 ? "HAS_ERROR" : "HAS_VALUE";
        ImmutableList immutableList = this.a;
        Throwable th = this.b;
        return "EndpointStateResult{state=" + str + ", value=" + String.valueOf(immutableList) + ", error=" + String.valueOf(th) + "}";
    }

    public usi(int i, ImmutableList immutableList, Throwable th) {
        this.c = i;
        this.a = immutableList;
        this.b = th;
    }
}
