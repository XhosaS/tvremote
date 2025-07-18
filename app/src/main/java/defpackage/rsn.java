package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsn {
    public final int a;
    public final boolean b;
    private final long c;
    private final boolean d;

    public rsn(int i) {
        this.c = 0L;
        this.a = i;
        this.b = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsn)) {
            return false;
        }
        rsn rsnVar = (rsn) obj;
        long j = rsnVar.c;
        if (this.a != rsnVar.a) {
            return false;
        }
        boolean z = rsnVar.b;
        boolean z2 = rsnVar.d;
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + 1237) * 31) + 1237;
    }

    public final String toString() {
        return "ReceiverParams(timestampAwaitTimeoutMillis=0, minimalOriginBytes=" + this.a + ", includeAudioState=false, includeAudioLevel=false)";
    }

    public rsn() {
        this(Integer.MAX_VALUE);
    }
}
