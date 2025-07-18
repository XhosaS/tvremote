package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahg {
    private final Object a;
    private final String b;

    public ahg(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahg)) {
            return false;
        }
        ahg ahgVar = (ahg) obj;
        return this.a == ahgVar.a && this.b.equals(ahgVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
