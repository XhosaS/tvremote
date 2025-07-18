package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaf extends hur {
    public final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaf(Object obj) {
        super((short[]) null);
        obj.getClass();
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iaf) && yks.e(this.a, ((iaf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(value=" + this.a + ")";
    }
}
