package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvm {
    public static final String a = gpn.a("NetworkRequestCompat");
    public final Object b;

    public gvm() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gvm) && yks.e(this.b, ((gvm) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ')';
    }

    public gvm(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ gvm(byte[] bArr) {
        this((Object) null);
    }
}
