package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzr {
    private final Object a;
    private final String b;

    public nzr(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzr)) {
            return false;
        }
        nzr nzrVar = (nzr) obj;
        return this.a == nzrVar.a && this.b.equals(nzrVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
