package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pew {
    public final String a;
    public final ImmutableList b;
    public final uzg c;
    public final long d;

    public pew() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pew) {
            pew pewVar = (pew) obj;
            String str = this.a;
            if (str != null ? str.equals(pewVar.a) : pewVar.a == null) {
                if (this.b.equals(pewVar.b) && this.c.equals(pewVar.c) && this.d == pewVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        uzg uzgVar = this.c;
        return "VisualElementEventRecord{account=" + this.a + ", nodeIdPath=" + this.b.toString() + ", action=" + uzgVar.toString() + ", timestampMs=" + this.d + "}";
    }

    public pew(String str, ImmutableList immutableList, uzg uzgVar, long j) {
        this.a = str;
        if (immutableList == null) {
            throw new NullPointerException("Null nodeIdPath");
        }
        this.b = immutableList;
        if (uzgVar == null) {
            throw new NullPointerException("Null action");
        }
        this.c = uzgVar;
        this.d = j;
    }
}
