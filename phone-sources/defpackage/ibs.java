package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibs extends hur {
    public final Object a;

    public ibs(Object obj) {
        super((short[]) null);
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibs) && yks.e(this.a, ((ibs) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Left(value=" + this.a + ")";
    }
}
