package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khg {
    private final Object a;
    private final String b;

    public khg(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return this.b + "@" + System.identityHashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khg)) {
            return false;
        }
        khg khgVar = (khg) obj;
        return this.a == khgVar.a && this.b.equals(khgVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
