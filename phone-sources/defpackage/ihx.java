package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihx extends ihz {
    private final int a;

    public ihx(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihx) && this.a == ((ihx) obj).a;
    }

    public final int hashCode() {
        int i = this.a;
        a.bw(i);
        return i;
    }

    public final String toString() {
        return "Loading(origin=" + ((Object) ihz.a(this.a)) + ")";
    }
}
