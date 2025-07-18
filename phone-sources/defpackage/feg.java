package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feg {
    public static final feg a = new feg(0, 0);
    public final long b;
    public final long c;

    public feg(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            feg fegVar = (feg) obj;
            if (this.b == fegVar.b && this.c == fegVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }

    public final String toString() {
        return "[timeUs=" + this.b + ", position=" + this.c + "]";
    }
}
