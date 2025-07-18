package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmd {
    public final int a;

    public dmd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmd) && this.a == ((dmd) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "LayoutInfo(layoutId=" + this.a + ')';
    }
}
