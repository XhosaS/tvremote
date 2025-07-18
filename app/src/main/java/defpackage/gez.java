package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gez {
    public static final gey a = new gey();
    public final fbo b;
    public final String c;
    public final int d;

    public gez(fbo fboVar, int i, String str) {
        fboVar.getClass();
        this.b = fboVar;
        this.d = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gez)) {
            return false;
        }
        gez gezVar = (gez) obj;
        return this.b == gezVar.b && this.d == gezVar.d && agvy.c(this.c, gezVar.c);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.d) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ClientExecutionContext(clientOp=" + this.b + ", executionType=" + ((Object) Integer.toString(this.d - 1)) + ", eventId=" + this.c + ")";
    }
}
