package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkp {
    public final int a;

    public dkp(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkp) && this.a == ((dkp) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ContainerInfo(layoutId=" + this.a + ')';
    }
}
