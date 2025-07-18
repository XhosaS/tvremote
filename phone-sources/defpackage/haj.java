package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haj {
    public static final haj a;
    public final hjs b;
    public final hjs c;

    static {
        haf hafVar = haf.a;
        a = new haj(hafVar, hafVar);
    }

    public haj(hjs hjsVar, hjs hjsVar2) {
        this.b = hjsVar;
        this.c = hjsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haj)) {
            return false;
        }
        haj hajVar = (haj) obj;
        return yks.e(this.b, hajVar.b) && yks.e(this.c, hajVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Size(width=" + this.b + ", height=" + this.c + ")";
    }
}
