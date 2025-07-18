package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lui {
    public final boolean a;
    public final long b;

    public lui() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lui) {
            lui luiVar = (lui) obj;
            if (this.a == luiVar.a && this.b == luiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        long j = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Playback{trailer=" + this.a + ", positionMsec=" + this.b + "}";
    }

    public lui(boolean z, long j) {
        this.a = z;
        this.b = j;
    }
}
