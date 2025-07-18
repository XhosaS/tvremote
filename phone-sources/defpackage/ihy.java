package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihy extends ihz {
    private final int a;

    public ihy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihy) && this.a == ((ihy) obj).a;
    }

    public final int hashCode() {
        int i = this.a;
        a.bw(i);
        return i;
    }

    public final String toString() {
        return "NoNewData(origin=" + ((Object) ihz.a(this.a)) + ")";
    }
}
